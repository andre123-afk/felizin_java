package s12lab04; // Declara el paquete de las clases del lab 04.

// final impide que otra clase herede y cree variantes de este Singleton.
public final class ContadorMetricas {
    // Campo estático compartido: crea una única instancia al cargar la clase.
    private static final ContadorMetricas INSTANCIA = new ContadorMetricas();
    // Estado compartido que almacena la cantidad de eventos registrados.
    private long total;

    // Constructor privado: evita que otras clases creen contadores directamente.
    private ContadorMetricas() {
    } // Fin del constructor privado.
    // Método estático de acceso que devuelve la instancia compartida.
    public static ContadorMetricas obtenerInstancia() {
        // Devuelve el mismo objeto cada vez que se invoca este método.
        return INSTANCIA;
    } // Fin del método obtenerInstancia.
    // Ejemplo monohilo: no promete incrementos seguros desde varios hilos.
    // Método de operación que incrementa en uno el total compartido.
    public void incrementar() {
        // Suma un evento al contador actual.
        total++;
    } // Fin del método incrementar.
    // Método de consulta que permite leer el total actual.
    public long consultar() {
        // Devuelve el total sin modificarlo.
        return total;
    } // Fin del método consultar.
} // Fin de la clase Singleton.
