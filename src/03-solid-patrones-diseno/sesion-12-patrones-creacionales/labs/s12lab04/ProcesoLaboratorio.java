package s12lab04; // Declara el paquete de las clases del lab 04.

// Representa un proceso lógico que registra eventos en un contador compartido.
public class ProcesoLaboratorio {
    // Referencia final al contador compartido que recibe este proceso.
    private final ContadorMetricas contador;
    // Constructor: recibe la dependencia en lugar de buscarla globalmente.
    public ProcesoLaboratorio(ContadorMetricas contador) {
        // Comprueba que la dependencia obligatoria haya sido proporcionada.
        if (contador == null) {
            // Informa que no se puede crear el proceso sin contador.
            throw new IllegalArgumentException("Contador obligatorio");
        }
        // Guarda la referencia recibida para usarla en sus métodos.
        this.contador = contador;
    } // Fin del constructor.
    // Registra la cantidad indicada de eventos en el contador compartido.
    public void registrarEventos(int cantidad) {
        // Rechaza una cantidad negativa, que no representa eventos válidos.
        if (cantidad < 0) {
            // Informa del argumento inválido mediante una excepción.
            throw new IllegalArgumentException("Cantidad negativa");
        }
        // Repite el incremento una vez por cada evento solicitado.
        for (int i = 0; i < cantidad; i++) {
            // Actualiza el contador recibido en el constructor.
            contador.incrementar();
        } // Fin del ciclo de registro.
    } // Fin del método registrarEventos.
} // Fin de la clase ProcesoLaboratorio.
