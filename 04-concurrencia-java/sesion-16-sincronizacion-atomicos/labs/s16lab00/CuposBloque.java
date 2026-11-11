package s16lab00;

public final class CuposBloque implements Cupos {
    private int disponibles;
    // El monitor privado evita exponer el objeto usado para coordinar el acceso.
    private final Object monitor = new Object();

    public CuposBloque(int disponibles) {
        if (disponibles < 0 || disponibles > 1_000_000) {
            throw new IllegalArgumentException("Disponibles entre 0 y 1000000");
        }
        this.disponibles = disponibles;
    }

    @Override
    public boolean reservar() {
        synchronized (monitor) {
            // Comprobar y descontar dentro del mismo bloque evita reservas duplicadas.
            if (disponibles <= 0) {
                return false;
            }
            int observado = disponibles;
            disponibles = observado - 1;
            return true;
        }
    }

    @Override
    public int consultarDisponibles() {
        synchronized (monitor) {
            // La lectura se coordina con las reservas usando el mismo monitor.
            return disponibles;
        }
    }
}
