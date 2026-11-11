package s16lab00;

public final class CuposMetodo implements Cupos {
    // Los participantes comparten este saldo mediante una misma instancia.
    private int disponibles;

    public CuposMetodo(int disponibles) {
        if (disponibles < 0 || disponibles > 1_000_000) {
            throw new IllegalArgumentException("Disponibles entre 0 y 1000000");
        }
        this.disponibles = disponibles;
    }

    @Override
    public synchronized boolean reservar() {
        // La comprobacion y el descuento se ejecutan juntos bajo el monitor this.
        if (disponibles <= 0) {
            return false;
        }
        int observado = disponibles;
        disponibles = observado - 1;
        return true;
    }

    @Override
    public synchronized int consultarDisponibles() {
        // La consulta usa el mismo monitor que reservar.
        return disponibles;
    }
}
