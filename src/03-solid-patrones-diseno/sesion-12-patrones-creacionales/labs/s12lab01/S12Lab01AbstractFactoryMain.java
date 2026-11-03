package s12lab01; // Declara el paquete de la clase ejecutable.

// Punto de entrada para probar las familias de productos Alba y Boreal.
public class S12Lab01AbstractFactoryMain {
    // La JVM comienza la ejecución del programa en este método.
    public static void main(String[] args) {
        // Crea un emisor con la fábrica Alba e imprime la factura de base 10000.
        System.out.println(new EmisorFactura(new FabricaAlba()).emitir(20000));
        // Crea un emisor con la fábrica Boreal e imprime su factura de base 10000.
        System.out.println(new EmisorFactura(new FabricaBoreal()).emitir(20000));
    } // Fin del método main.
} // Fin de la clase ejecutable.
