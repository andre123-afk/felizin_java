package s12lab01; // Declara el paquete de esta clase.

// Es el cliente: utiliza una fábrica sin conocer sus productos concretos.
public class EmisorFactura {
    // Guarda la fábrica que proveerá los productos de una misma familia.
    private final FabricaDocumentos fabrica;
    // Constructor: recibe la fábrica que este emisor utilizará.
    public EmisorFactura(FabricaDocumentos fabrica) {
        // Verifica que la dependencia obligatoria no sea nula.
        if (fabrica == null) {
            // Informa del argumento inválido mediante una excepción.
            throw new IllegalArgumentException("Fabrica obligatoria");
        }
        // Guarda la fábrica recibida en el atributo de esta instancia.
        this.fabrica = fabrica;
    } // Fin del constructor.
    // Crea la factura a partir de los productos de la fábrica elegida.
    public String emitir(long base) {
        // Solicita a la fábrica el calculador de impuesto de su familia.
        CalculadorImpuesto calculador = fabrica.crearCalculador();
        // Solicita a la misma fábrica el formato de factura correspondiente.
        FormatoFactura formato = fabrica.crearFormato();
        // Calcula el impuesto y entrega base e impuesto al formato concreto.
        return formato.presentar(base, calculador.calcular(base));
    } // Fin del método emitir.
} // Fin de la clase.
