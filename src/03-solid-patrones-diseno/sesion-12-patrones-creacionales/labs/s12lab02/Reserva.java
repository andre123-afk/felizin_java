package s12lab02; // Declara el paquete de las clases del lab 02.
import java.time.LocalDate; // Importa el tipo de fecha sin hora de Java.

// Producto final creado por ReservaBuilder.
public final class Reserva {
    // Campo privado e inmutable: guarda el huésped de esta reserva.
    private final String huesped;
    // Campo privado e inmutable: guarda la fecha de la reserva.
    private final LocalDate fecha;
    // Campo privado e inmutable: indica si incluye desayuno.
    private final boolean desayuno;
    // Campo privado e inmutable: indica si incluye estacionamiento.
    private final boolean estacionamiento;
    // Campo privado e inmutable: indica si incluye salida tardía.
    private final boolean lateCheckout;

    // Constructor de paquete: el builder lo usa para crear el producto completo.
    Reserva(String huesped, LocalDate fecha, boolean desayuno,
            boolean estacionamiento, boolean lateCheckout) {
        // Copia el huésped recibido al campo final de esta instancia.
        this.huesped = huesped;
        // Copia la fecha recibida al campo final de esta instancia.
        this.fecha = fecha;
        // Guarda el valor de la opción desayuno.
        this.desayuno = desayuno;
        // Guarda el valor de la opción estacionamiento.
        this.estacionamiento = estacionamiento;
        // Guarda el valor de la opción lateCheckout.
        this.lateCheckout = lateCheckout;
    } // Fin del constructor.
    // Método de consulta: informa si se seleccionó salida tardía.
    public boolean tieneLateCheckout() {
        // Devuelve el valor almacenado sin modificar la reserva.
        return lateCheckout;
    } // Fin del método tieneLateCheckout.
    // Método que crea una representación legible de todos los datos.
    public String resumen() {
        // Une huésped, fecha y opciones para mostrar la reserva.
        return huesped + " | " + fecha + " | desayuno=" + desayuno
                + " | estacionamiento=" + estacionamiento + " | lateCheckout=" + lateCheckout;
    } // Fin del método resumen.
} // Fin de la clase Reserva.
