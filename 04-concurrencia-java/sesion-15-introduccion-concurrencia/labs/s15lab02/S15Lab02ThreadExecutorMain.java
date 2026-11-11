package s15lab02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class S15Lab02ThreadExecutorMain {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Las mismas tres tareas se ejecutan primero con Thread y luego con un pool.
        String[] nombres = {"Ana", "Luis", "Sara"};
        System.out.println("=== Thread: un hilo nuevo por tarea ===");
        ejecutarConThread(nombres);
        System.out.println("=== Executor: pool de 2 hilos ===");
        ejecutarConExecutor(nombres);
        System.out.println("Fin: todas las tareas terminaron");
    }

    private static void ejecutarConThread(String[] nombres) throws InterruptedException {
        List<Thread> hilos = new ArrayList<>();
        try {
            for (int indice = 0; indice < nombres.length; indice++) {
                // Cada tarea recibe un hilo propio; construirlo no lo inicia todavía.
                Thread hilo = new Thread(new PrepararCertificado(nombres[indice]),
                        "manual-" + (indice + 1));
                hilos.add(hilo);
                hilo.start();
            }
            // join espera a que cada hilo termine antes de continuar.
            for (Thread hilo : hilos) {
                hilo.join();
            }
        } finally {
            // Si el método sale antes de que terminen, solicita detener los hilos activos.
            for (Thread hilo : hilos) {
                if (hilo.isAlive()) {
                    hilo.interrupt();
                }
            }
        }
    }

    private static void ejecutarConExecutor(String[] nombres)
            throws InterruptedException, ExecutionException {
        // El pool reutiliza como máximo dos trabajadores para todas las tareas enviadas.
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Future<?>> pendientes = new ArrayList<>();
        try {
            for (String nombre : nombres) {
                // submit entrega una tarea y devuelve un Future para seguir su finalización.
                pendientes.add(executor.submit(new PrepararCertificado(nombre)));
            }
            // No acepta nuevas tareas; las ya enviadas siguen ejecutandose.
            executor.shutdown();
            // get espera a cada tarea y propaga su fallo si ocurre.
            for (Future<?> pendiente : pendientes) {
                pendiente.get();
            }
            // Confirma que el ejecutor también terminó su cierre.
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                throw new IllegalStateException("El ejecutor no termino en el plazo de cierre");
            }
        } finally {
            // Tambien solicita cierre si get o la espera fallan.
            executor.shutdownNow();
        }
    }
}
