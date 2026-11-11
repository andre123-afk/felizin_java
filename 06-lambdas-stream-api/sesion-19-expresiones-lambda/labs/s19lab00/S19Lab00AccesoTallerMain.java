package s19lab00;

import java.util.function.Predicate; // Predicate<T> recibe un valor y devuelve un boolean.

public class S19Lab00AccesoTallerMain {
    public static void main(String[] args) {
        // La regla del negocio dice: una persona puede ingresar si tiene 15 años o más.
        // Como recibe una edad y responde true/false, la interfaz adecuada es Predicate<Integer>.
        Predicate<Integer> puedeIngresar = edad -> edad >= 15;

        // Probamos la misma lambda con las edades pedidas en el README.
        int[] edades = {14, 15, 20};
        for (int edad : edades) {
            // La lambda se ejecuta al invocar test(edad), que devuelve el resultado booleano.
            System.out.println("Edad " + edad + " -> " + puedeIngresar.test(edad));
        }

        // Explicación breve: elegimos Predicate porque la operación no cambia el dato,
        // solo evalúa una condición y devuelve true o false.
    }
}
