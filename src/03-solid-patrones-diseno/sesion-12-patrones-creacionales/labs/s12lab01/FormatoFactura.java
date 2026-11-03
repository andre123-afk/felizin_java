package s12lab01; // Declara el paquete de las clases del lab 01.

// Interfaz que define cómo debe presentarse una factura.
public interface FormatoFactura {
    // Recibe la base y el impuesto y devuelve el resultado formateado.
    String presentar(long base, long impuesto);
} // Fin de la interfaz.
