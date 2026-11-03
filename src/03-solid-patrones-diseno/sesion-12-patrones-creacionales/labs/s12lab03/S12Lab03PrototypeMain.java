package s12lab03; // Declara el paquete de la clase ejecutable.

// Punto de entrada para probar las copias creadas con Prototype.
public class S12Lab03PrototypeMain {
    // La JVM comienza la ejecución del programa en este método.
    public static void main(String[] args) {
        // Crea el objeto original que funcionará como plantilla.
        Rutina base = new Rutina("Base");
        // Agrega el primer ejercicio a la plantilla.
        base.agregar("Sentadillas", 10);
        // Agrega el segundo ejercicio a la plantilla.
        base.agregar("Flexiones", 8);
        // Crea otra rutina con ejercicios copiados y un nombre diferente.
        Rutina personal = base.copiar("Personal");
        // Modifica solo las repeticiones del primer ejercicio de la copia.
        personal.cambiarRepeticiones(0, 15);
        // Agrega un ejercicio adicional solo a la copia.
        personal.agregar("Plancha", 1);
        // Modifica el ejercicio de la rutina original luego de crear la copia.
        base.cambiarRepeticiones(1, 12);
        // Compara referencias para verificar que son dos objetos diferentes.
        System.out.println("Objetos distintos: " + (base != personal));
        // Muestra que la plantilla cambia sin afectar el ejercicio copiado.
        System.out.println(base.resumen());
        // Muestra que Personal conserva Flexiones=8 y los cambios propios.
        System.out.println(personal.resumen());
        // Prueba un índice fuera del rango de la lista.
        System.out.println("Indice invalido: " + personal.cambiarRepeticiones(8, 20));
        // Prueba una cantidad inválida de repeticiones.
        System.out.println("Repeticiones cero: " + personal.cambiarRepeticiones(0, 0));
        // Comprueba que los intentos inválidos no alteraron la rutina personal.
        System.out.println(personal.resumen());
    } // Fin del método main.
} // Fin de la clase ejecutable.
