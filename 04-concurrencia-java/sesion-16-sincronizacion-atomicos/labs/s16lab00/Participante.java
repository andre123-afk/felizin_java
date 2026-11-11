package s16lab00;

import java.util.Objects;

public final class Participante implements Runnable {
    // Todos los participantes reciben la misma instancia de Cupos.
    private final Cupos cupos;
    private final int intentos;
    // Este contador pertenece a un participante y solo lo modifica su propio hilo.
    private int reservas;

    public Participante(Cupos cupos, int intentos) {
        this.cupos = Objects.requireNonNull(cupos);
        if (intentos < 1 || intentos > 100_000) {
            throw new IllegalArgumentException("Intentos entre 1 y 100000");
        }
        this.intentos = intentos;
    }

    @Override
    public void run() {
        // Cada intento intenta reservar una plaza de manera independiente.
        for (int intento = 0; intento < intentos; intento++) {
            if (cupos.reservar()) {
                reservas++;
            }
        }
    }

    public int consultarReservas() {
        // La prueba consulta este resultado despues de esperar a que termine el hilo.
        return reservas;
    }
}
