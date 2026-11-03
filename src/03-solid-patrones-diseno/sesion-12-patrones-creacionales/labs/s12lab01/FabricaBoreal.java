package s12lab01; // Declara el paquete de esta fábrica concreta.

// Implementa la fábrica abstracta para la familia de documentos Boreal.
public class FabricaBoreal implements FabricaDocumentos {
    // Indica que el método implementa el contrato de la fábrica.
    @Override
    // Crea el producto calculador de impuestos para Boreal.
    public CalculadorImpuesto crearCalculador() {
        // Devuelve la implementación concreta del cálculo para Boreal.
        return new ImpuestoBoreal();
    } // Fin del método crearCalculador.
    // Indica que el método implementa el segundo método de la fábrica.
    @Override
    // Crea el producto de formato de factura para Boreal.
    public FormatoFactura crearFormato() {
        // Devuelve la implementación concreta del formato para Boreal.
        return new FacturaBoreal();
    } // Fin del método crearFormato.
} // Fin de la fábrica concreta.
