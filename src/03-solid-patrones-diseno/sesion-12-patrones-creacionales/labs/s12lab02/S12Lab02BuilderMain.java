package s12lab02; // Declara el paquete de la clase ejecutable.
import java.time.LocalDate; // Permite crear una fecha fija para el ejemplo.

// Punto de entrada para probar el patrón Builder con reservas.
public class S12Lab02BuilderMain {
    // La JVM comienza la ejecución del programa en este método.
    public static void main(String[] args) {
        // Configura datos obligatorios y opciones encadenando métodos del builder.
        ReservaBuilder builder = new ReservaBuilder().huesped("Luis")
                .fecha(LocalDate.of(2026, 3, 5)).desayuno(true).estacionamiento(true);
        // Construye la primera reserva con las opciones actuales del builder.
        Reserva primera = builder.build();
        // Cambia la opción y construye una segunda reserva distinta.
        Reserva segunda = builder.lateCheckout(true).build();
        // Imprime el estado de la primera reserva construida.
        System.out.println(primera.resumen());
        // Imprime el estado de la segunda reserva construida.
        System.out.println(segunda.resumen());
        // Comprueba que modificar el builder después no cambió el primer producto.
        System.out.println("Primera conserva lateCheckout: " + primera.tieneLateCheckout());
        // Compara referencias para comprobar que build creó dos objetos distintos.
        System.out.println("Objetos distintos: " + (primera != segunda));
        // Inicia un bloque que captura el error esperado al faltar un dato obligatorio.
        try {
            // Construye sin huésped para que build rechace la configuración incompleta.
            new ReservaBuilder().huesped("Ana").build();
        // Captura específicamente la excepción que indica un estado inválido del builder.
        } catch (IllegalStateException error) {
            // Imprime el mensaje descriptivo de la validación fallida.
            System.out.println("Reserva rechazada: " + error.getMessage());
        } // Fin del bloque try-catch.
    } // Fin del método main.
} // Fin de la clase ejecutable.
