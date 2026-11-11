package s16lab00;

// Ambas implementaciones permiten reservar y consultar el mismo recurso compartido.
public interface Cupos {
    boolean reservar();
    int consultarDisponibles();
}
