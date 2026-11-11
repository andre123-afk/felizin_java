package s15lab02;

import java.util.Objects;

// Runnable representa el trabajo que puede ejecutar un Thread o un Executor.
public final class PrepararCertificado implements Runnable {
    // Cada tarea conserva el nombre del certificado que debe preparar.
    private final String nombre;

    public PrepararCertificado(String nombre) {
        this.nombre = Objects.requireNonNull(nombre);
        if (nombre.isBlank()) {
            throw new IllegalArgumentException("Nombre vacio");
        }
    }

    @Override
    public void run() {
        // El trabajador que ejecuta la tarea puede ser un hilo manual o del pool.
        System.out.println(nombre + " atendido por " + Thread.currentThread().getName());
    }
}
