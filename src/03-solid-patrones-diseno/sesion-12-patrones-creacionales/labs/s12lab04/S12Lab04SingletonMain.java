package s12lab04; // Declara el paquete de la clase ejecutable.

// Punto de entrada para comprobar la instancia única y su estado compartido.
public class S12Lab04SingletonMain {
    // La JVM comienza la ejecución del programa en este método.
    public static void main(String[] args) {
        // Obtiene la referencia a la instancia única del contador.
        ContadorMetricas primera = ContadorMetricas.obtenerInstancia();
        // Vuelve a pedir la instancia para demostrar que se reutiliza el objeto.
        ContadorMetricas segunda = ContadorMetricas.obtenerInstancia();
        // Compara identidades; true indica que ambas variables refieren al mismo objeto.
        System.out.println("Misma instancia: " + (primera == segunda));
        // Muestra el total inicial del contador en una JVM recién iniciada.
        System.out.println("Total inicial: " + primera.consultar());
        // Construye el primer proceso y le inyecta la primera referencia.
        ProcesoLaboratorio procesoA = new ProcesoLaboratorio(primera);
        // Construye el segundo proceso con la segunda referencia al mismo contador.
        ProcesoLaboratorio procesoB = new ProcesoLaboratorio(segunda);
        // Registra un evento desde el primer proceso.
        procesoA.registrarEventos(1);
        // Registra un evento desde el segundo proceso.
        procesoB.registrarEventos(1);
        // Consulta el total compartido usando la referencia primera.
        System.out.println("Total desde A: " + primera.consultar());
        // Consulta el mismo total compartido usando la referencia segunda.
        System.out.println("Total desde B: " + segunda.consultar());
    } // Fin del método main.
} // Fin de la clase ejecutable.
