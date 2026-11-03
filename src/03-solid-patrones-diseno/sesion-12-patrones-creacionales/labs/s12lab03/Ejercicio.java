package s12lab03; // Declara el paquete de las clases del lab 03.

// Elemento mutable de una Rutina; no es público fuera de su paquete.
final class Ejercicio {
    // El nombre no cambia luego de crear el ejercicio.
    private final String nombre;
    // Las repeticiones pueden modificarse mediante el método validado.
    private int repeticiones;

    // Constructor de paquete: Rutina valida los datos antes de crear ejercicios.
    Ejercicio(String nombre, int repeticiones) {
        // Guarda el nombre recibido en el atributo inmutable.
        this.nombre = nombre;
        // Guarda la cantidad inicial de repeticiones.
        this.repeticiones = repeticiones;
    } // Fin del constructor.
    // Método para cambiar las repeticiones; devuelve si el cambio fue válido.
    boolean cambiarRepeticiones(int nuevas) {
        // Rechaza valores que no estén dentro del rango permitido 1 a 100.
        if (nuevas < 1 || nuevas > 100) {
            // Informa del rechazo sin alterar el estado del ejercicio.
            return false;
        }
        // Actualiza el dato mutable luego de superar la validación.
        repeticiones = nuevas;
        // Informa que el cambio se realizó correctamente.
        return true;
    } // Fin del método cambiarRepeticiones.
    // Método de copia que crea otro ejercicio con los mismos valores.
    Ejercicio copiar() {
        // La nueva instancia evita compartir este objeto mutable con la copia.
        return new Ejercicio(nombre, repeticiones);
    } // Fin del método copiar.
    // Método que convierte el ejercicio en texto para mostrarlo.
    String resumen() {
        // Devuelve el nombre junto con su número actual de repeticiones.
        return nombre + "=" + repeticiones;
    } // Fin del método resumen.
} // Fin de la clase Ejercicio.
