package s19lab01;

import java.util.function.Consumer; // Consumer<T> recibe un valor y no devuelve nada (void).

public class S19Lab01LavanderiaMain {
    public static void main(String[] args) {
        // La acción requerida es mostrar un aviso con el nombre del cliente.
        // Como recibe un nombre y solo imprime, la interfaz correcta es Consumer<String>.
        Consumer<String> avisoLavanderia = nombre ->
                System.out.println("Tu pedido esta listo, " + nombre);

        avisoLavanderia.accept("Ana");
        avisoLavanderia.accept("Luis");
        avisoLavanderia.accept("Sara");

    }
}
