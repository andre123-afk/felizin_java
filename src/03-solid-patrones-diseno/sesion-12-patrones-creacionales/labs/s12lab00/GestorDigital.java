package s12lab00; // Define el paquete de esta clase.

// Hereda el flujo general del gestor y personaliza el producto creado.
public class GestorDigital extends GestorPrestamo {
    // Sobrescribe el método de creación declarado por el gestor abstracto.
    @Override
    // Este método fábrica decide qué comprobante digital entregar.
    protected ComprobantePrestamo crearComprobante() {
        // El constructor crea un nuevo producto concreto digital.
        return new ComprobantePrestamoDigital();
    } // Fin del método fábrica.
} // Fin de la clase.
