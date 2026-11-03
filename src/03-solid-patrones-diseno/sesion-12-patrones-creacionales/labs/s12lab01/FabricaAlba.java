package s12lab01; // Declara el paquete de esta fábrica concreta.

// Implementa la fábrica abstracta para la familia de documentos Alba.
public class FabricaAlba implements FabricaDocumentos {
    // Indica que el método implementa el contrato de la fábrica.
    @Override
    // Crea el producto calculador de impuestos para Alba.
    public CalculadorImpuesto crearCalculador() {
        // Devuelve la implementación concreta del cálculo para Alba.
        return new ImpuestoAlba();
    } // Fin del método crearCalculador.
    // Indica que el método implementa el segundo método de la fábrica.
    @Override
    // Crea el producto de formato de factura para Alba.
    public FormatoFactura crearFormato() {
        // Devuelve la implementación concreta del formato para Alba.
        return new FacturaAlba();
    } // Fin del método crearFormato.
} // Fin de la fábrica concreta.
