package s12lab00; // Define el paquete de esta implementación.

// Esta clase representa un comprobante para préstamos digitales.
public class ComprobantePrestamoDigital implements ComprobantePrestamo {
    // Indica que este método implementa el contrato de la interfaz.
    @Override
    // Recibe el título prestado y construye el texto del comprobante.
    public String describir(String titulo) {
        // Devuelve una descripción específica para el acceso digital.
        return "Acceso en plataforma: " + titulo;
    } // Fin del método describir.
} // Fin de la clase.
