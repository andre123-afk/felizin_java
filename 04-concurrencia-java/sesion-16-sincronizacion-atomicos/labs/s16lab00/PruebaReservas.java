package s16lab00;

public final class PruebaReservas {
    private PruebaReservas() {
    }

    public static String ejecutar(Cupos cupos, int participantes, int intentos,
                                  boolean exigirCoherencia) throws InterruptedException {
        if (participantes < 1 || participantes > 16) {
            throw new IllegalArgumentException("Participantes entre 1 y 16");
        }
        int inicial = cupos.consultarDisponibles();
        Participante[] tareas = new Participante[participantes];
        // Cada tarea comparte los cupos, pero conserva su propio total de reservas.
        for (int indice = 0; indice < participantes; indice++) {
            tareas[indice] = new Participante(cupos, intentos);
        }
        // Espera a que todos terminen antes de sumar sus resultados.
        EjecutorPrueba.ejecutar(tareas);
        int reservas = 0;
        for (Participante participante : tareas) {
            reservas += participante.consultarReservas();
        }
        int finalDisponibles = cupos.consultarDisponibles();
        int totalIntentos = participantes * intentos;
        // Comprueba la conservacion de cupos y que se aprovecharon todas las plazas posibles.
        boolean coherente = finalDisponibles >= 0 && reservas <= inicial
                && inicial == reservas + finalDisponibles
                && reservas == Math.min(inicial, totalIntentos);
        if (exigirCoherencia && !coherente) {
            throw new IllegalStateException("Cupos incoherente");
        }
        return "disponibles=" + finalDisponibles + " reservas=" + reservas
                + " rechazos=" + (totalIntentos - reservas) + " coherente=" + coherente;
    }
}
