package s12lab03; // Declara el paquete de las clases del lab 03.
import java.util.ArrayList; // Importa una lista que puede crecer durante la ejecución.
import java.util.List; // Importa la interfaz general de listas.

// Prototype concreto: puede crear copias personalizadas de una rutina existente.
public class Rutina {
    // El nombre de la rutina no cambia luego de construirla.
    private final String nombre;
    // Lista privada que contiene los ejercicios mutables de esta rutina.
    private final List<Ejercicio> ejercicios = new ArrayList<>();

    // Constructor público: crea una rutina nueva y valida su nombre.
    public Rutina(String nombre) {
        // Rechaza los nombres ausentes o que solo contienen espacios.
        if (nombre == null || nombre.isBlank()) {
            // Lanza un error descriptivo cuando el argumento no es válido.
            throw new IllegalArgumentException("Nombre obligatorio");
        }
        // Guarda el nombre sin espacios al principio ni al final.
        this.nombre = nombre.strip();
    } // Fin del constructor.
    // Agrega un ejercicio válido y devuelve si se pudo completar la operación.
    public boolean agregar(String nombreEjercicio, int repeticiones) {
        // Valida tanto el nombre como el rango permitido de repeticiones.
        if (nombreEjercicio == null || nombreEjercicio.isBlank()
                || repeticiones < 1 || repeticiones > 100) {
            // Devuelve false y no modifica la lista si los datos son incorrectos.
            return false;
        }
        // Crea un objeto nuevo y guarda el nombre normalizado en la lista.
        ejercicios.add(new Ejercicio(nombreEjercicio.strip(), repeticiones));
        // Devuelve true para indicar que el ejercicio quedó agregado.
        return true;
    } // Fin del método agregar.
    // Cambia las repeticiones de un ejercicio indicado por su posición.
    public boolean cambiarRepeticiones(int indice, int nuevas) {
        // Comprueba que el índice corresponda a un elemento de la lista.
        if (indice < 0 || indice >= ejercicios.size()) {
            // Devuelve false cuando la posición está fuera de los límites.
            return false;
        }
        // Delega al ejercicio la validación del nuevo número de repeticiones.
        return ejercicios.get(indice).cambiarRepeticiones(nuevas);
    } // Fin del método cambiarRepeticiones.
    // Crea una copia independiente y le permite tener otro nombre.
    public Rutina copiar(String nuevoNombre) {
        // El constructor crea el nuevo objeto y valida el nombre de la copia.
        Rutina copia = new Rutina(nuevoNombre);
        // Recorre los elementos originales para copiarlos individualmente.
        for (Ejercicio ejercicio : ejercicios) {
            // Cada elemento mutable también se copia para evitar referencias compartidas.
            copia.ejercicios.add(ejercicio.copiar());
        } // Fin del ciclo de copia de ejercicios.
        // Devuelve la nueva rutina ya configurada.
        return copia;
    } // Fin del método copiar.
    // Método de consulta: informa cuántos ejercicios contiene la rutina.
    public int cantidad() {
        // Devuelve el número actual de elementos de la lista.
        return ejercicios.size();
    } // Fin del método cantidad.
    // Construye una descripción de la rutina y todos sus ejercicios.
    public String resumen() {
        // Inicia el texto con el nombre y la cantidad total de ejercicios.
        String texto = nombre + " (" + cantidad() + "):";
        // Recorre los ejercicios para añadir su descripción al texto.
        for (Ejercicio ejercicio : ejercicios) {
            // Concatena el resumen del ejercicio actual.
            texto += " [" + ejercicio.resumen() + "]";
        } // Fin del ciclo que crea el resumen.
        // Devuelve el texto completo de la rutina.
        return texto;
    } // Fin del método resumen.
} // Fin de la clase Rutina.
