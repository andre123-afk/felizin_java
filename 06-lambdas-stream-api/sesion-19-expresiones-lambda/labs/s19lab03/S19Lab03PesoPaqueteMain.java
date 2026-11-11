package s19lab03;

import java.util.function.Function; // Function<T,R> recibe un valor y devuelve otro valor transformado.

public class S19Lab03PesoPaqueteMain {
    public static void main(String[] args) {
        // La regla de negocio dice: kilos = gramos / 1000.0.
        // Recibe un entero en gramos y devuelve un Double en kilogramos.
        Function<Integer, Double> convertirAKilos = gramos -> gramos / 1000.0;


        int[] pesosGramos = {500, 1000, 2500};
        for (int gramos : pesosGramos) {
            // La lambda se ejecuta con apply(gramos) y entrega el resultado convertido.
            System.out.println(gramos + " g -> " + convertirAKilos.apply(gramos) + " kg");
        }

    }
}
