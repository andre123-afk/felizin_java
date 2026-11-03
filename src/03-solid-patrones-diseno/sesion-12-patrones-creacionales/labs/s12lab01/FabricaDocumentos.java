package s12lab01; // Declara el paquete del lab 01.

// Interfaz abstracta que agrupa los métodos para crear una familia de productos.
public interface FabricaDocumentos {
    // Declara la creación del producto calculador de impuestos.
    CalculadorImpuesto crearCalculador();
    // Declara la creación del producto que presenta la factura.
    FormatoFactura crearFormato();
} // Fin de la interfaz de fábrica.
