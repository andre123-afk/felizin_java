package s12lab00; // Declara el paquete de la clase ejecutable.

// Esta clase contiene el punto de entrada para probar Factory Method.
public class S12Lab00FactoryMethodMain {
    // La JVM inicia la ejecución del programa en el método main.
    public static void main(String[] args) {
        // La variable usa el tipo base; el objeto real es el gestor físico.
        GestorPrestamo fisico = new GestorFisico();
        // El gestor digital reemplaza la decisión de qué comprobante crear.
        GestorPrestamo digital = new GestorDigital();
        // Registra e imprime el comprobante producido por el gestor físico.
        System.out.println(fisico.registrarPrestamo("POO aplicada"));
        // Registra e imprime el comprobante producido por el gestor digital.
        System.out.println(digital.registrarPrestamo("POO aplicada"));
    } // Fin del método main.
} // Fin de la clase ejecutable.
