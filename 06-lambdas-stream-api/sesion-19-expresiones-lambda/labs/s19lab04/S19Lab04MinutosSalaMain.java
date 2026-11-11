package s19lab04; // Paquete específico del laboratorio 04 de la sesión 19.

import java.util.function.BiFunction; // BiFunction<T, U, R> recibe dos valores y devuelve uno.

public class S19Lab04MinutosSalaMain { // Clase principal del ejercicio de la sala.
    public static void main(String[] args) {
        // La regla del negocio es: minutosRestantes = contratados - utilizados.
        // Necesitamos dos entradas independientes: minutos contratados y minutos usados.
        // Como devuelve un valor numérico, usamos BiFunction<Integer, Integer, Integer>.
        BiFunction<Integer, Integer, Integer> minutosRestantes =
                (contratados, utilizados) -> contratados - utilizados;

        // Se ejecutan los tres casos del enunciado.
        System.out.println("120 y 45 -> " + minutosRestantes.apply(120, 45));
        System.out.println("120 y 0 -> " + minutosRestantes.apply(120, 0));
        System.out.println("120 y 120 -> " + minutosRestantes.apply(120, 120));

        // Explicación para la sustentación:
        // - La operación recibe dos argumentos porque requiere comparar dos cantidades.
        // - Se ejecuta con apply(primero, segundo), que es el método de BiFunction.
        // - El resultado se devuelve para que otra parte del programa lo use o lo imprima.
    }
}
