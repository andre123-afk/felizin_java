package s12lab01; // Declara el paquete de esta clase.

// Formato de factura concreto que pertenece a la familia Boreal.
public class FacturaBoreal implements FormatoFactura {
    // Señala que se implementa el método declarado en FormatoFactura.
    @Override
    // Recibe la base y el impuesto, y devuelve el documento como texto.
    public String presentar(long base, long impuesto) {
        // Incluye el total, calculado sumando la base y el impuesto.
        return "FACTURA BOREAL base=" + base
                + " impuesto=" + impuesto + " total=" + (base + impuesto);
    } // Fin del método presentar.
} // Fin de la clase.
