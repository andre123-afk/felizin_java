package s12lab00; // Define el paquete de las clases del lab 00.

// La clase abstracta contiene el flujo común para registrar cualquier préstamo.
public abstract class GestorPrestamo {
    // Método fábrica abstracto: cada subclase debe elegir el comprobante concreto.
    protected abstract ComprobantePrestamo crearComprobante();

    // Método público que ejecuta los pasos comunes del registro del préstamo.
    public String registrarPrestamo(String titulo) {
        // Rechaza títulos nulos o vacíos antes de utilizarlos.
        if (titulo == null || titulo.isBlank()) {
            // Lanza una excepción para informar que el argumento no es válido.
            throw new IllegalArgumentException("Titulo obligatorio");
        }
        // Crea el comprobante mediante el método fábrica y elimina espacios externos.
        return crearComprobante().describir(titulo.strip());
    } // Fin del método registrarPrestamo.
} // Fin de la clase abstracta.
