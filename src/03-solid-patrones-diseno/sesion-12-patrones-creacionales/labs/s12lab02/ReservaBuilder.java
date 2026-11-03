package s12lab02; // Declara el paquete de las clases del lab 02.
import java.time.LocalDate; // Importa el tipo usado para representar la fecha.

// Builder: reúne los datos temporales antes de construir una Reserva.
public class ReservaBuilder {
    // Dato obligatorio del producto que se configurará.
    private String huesped;
    // Dato obligatorio del producto que se configurará.
    private LocalDate fecha;
    // Opción de desayuno; false es el valor predeterminado.
    private boolean desayuno;
    // Opción de estacionamiento; false es el valor predeterminado.
    private boolean estacionamiento;
    // Opción de salida tardía; false es el valor predeterminado.
    private boolean lateCheckout;

    // Método de configuración: fija el huésped y devuelve el mismo builder.
    public ReservaBuilder huesped(String valor) {
        // Guarda el valor proporcionado en el builder.
        huesped = valor;
        // Retorna this para permitir encadenar la siguiente configuración.
        return this;
    } // Fin del método huesped.
    // Método de configuración: fija la fecha y devuelve el mismo builder.
    public ReservaBuilder fecha(LocalDate valor) {
        // Guarda la fecha proporcionada en el builder.
        fecha = valor;
        // Retorna this para continuar la cadena de métodos.
        return this;
    } // Fin del método fecha.
    // Método de configuración: fija la opción de desayuno.
    public ReservaBuilder desayuno(boolean valor) {
        // Guarda si se solicitó desayuno.
        desayuno = valor;
        // Devuelve el mismo builder para permitir el encadenamiento.
        return this;
    } // Fin del método desayuno.
    // Método de configuración: fija la opción de estacionamiento.
    public ReservaBuilder estacionamiento(boolean valor) {
        // Guarda si se solicitó estacionamiento.
        estacionamiento = valor;
        // Devuelve el mismo builder para permitir el encadenamiento.
        return this;
    } // Fin del método estacionamiento.
    // Método de configuración: fija la opción de salida tardía.
    public ReservaBuilder lateCheckout(boolean valor) {
        // Guarda si se solicitó late checkout.
        lateCheckout = valor;
        // Devuelve el mismo builder para permitir el encadenamiento.
        return this;
    } // Fin del método lateCheckout.
    // Método final del patrón: valida datos y construye una Reserva nueva.
    public Reserva build() {
        // Comprueba que el dato obligatorio huésped exista y no esté en blanco.
        if (huesped == null || huesped.isBlank()) {
            // Informa que no es posible construir la reserva sin huésped.
            throw new IllegalStateException("El huesped es obligatorio");
        }
        // Comprueba que se haya configurado la fecha obligatoria.
        if (fecha == null) {
            // Informa que no es posible construir la reserva sin fecha.
            throw new IllegalStateException("La fecha es obligatoria");
        }
        // Normaliza los espacios del huésped y construye un producto independiente.
        return new Reserva(huesped.strip(), fecha, desayuno, estacionamiento, lateCheckout);
    } // Fin del método build.
} // Fin de la clase ReservaBuilder.
