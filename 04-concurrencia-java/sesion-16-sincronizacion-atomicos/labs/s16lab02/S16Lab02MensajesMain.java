package s16lab02;

import java.util.concurrent.atomic.AtomicInteger;

public class S16Lab02MensajesMain {
    public static int procesar(int agentes, int mensajesPorAgente) throws InterruptedException {
        if (agentes < 1 || agentes > 16) {
            throw new IllegalArgumentException("Agentes entre 1 y 16");
        }
        AtomicInteger contador = new AtomicInteger();
        Runnable[] tareas = new Runnable[agentes];
        // Cada agente actualiza la misma instancia atomica.
        for (int indice = 0; indice < agentes; indice++) {
            tareas[indice] = new AgenteMensajes(contador, mensajesPorAgente);
        }
        // Espera a todos los agentes antes de devolver el total final.
        EjecutorPrueba.ejecutar(tareas);
        return contador.get();
    }

    public static void main(String[] args) throws InterruptedException {
        int agentes = 6;
        int mensajesPorAgente = 250;
        int esperado = agentes * mensajesPorAgente;
        int observado = procesar(agentes, mensajesPorAgente);
        System.out.println("Esperado: " + esperado);
        System.out.println("Procesados: " + observado);
        System.out.println("Correcto: " + (esperado == observado));
        if (esperado != observado) {
            throw new IllegalStateException("Se perdieron mensajes");
        }
        // Ejemplo secuencial para comparar si cada operacion devuelve el valor anterior o nuevo.
        AtomicInteger secuencial = new AtomicInteger(0);
        System.out.println("incrementAndGet retorna: " + secuencial.incrementAndGet());
        System.out.println("getAndIncrement retorna: " + secuencial.getAndIncrement());
        System.out.println("Valor final del ejemplo secuencial: " + secuencial.get());
    }
}
