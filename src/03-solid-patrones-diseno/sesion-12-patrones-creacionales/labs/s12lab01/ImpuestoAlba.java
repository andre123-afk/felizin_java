package s12lab01; // Declara el paquete de esta implementación.

// Calculador de impuesto concreto para la familia Alba.
public class ImpuestoAlba implements CalculadorImpuesto {
    // Señala que este método implementa el contrato del calculador.
    @Override
    // Recibe la base y devuelve el impuesto calculado.
    public long calcular(long base) {
        // Rechaza bases negativas, superiores al máximo o no múltiplos de 100.
        if (base < 0 || base > 1000000 || base % 100 != 0) {
            // Comunica que la base no respeta el contrato de entrada.
            throw new IllegalArgumentException("Base fuera del contrato");
        }
        // Calcula el cinco por ciento de la base usando enteros.
        return base * 5 / 100;
    } // Fin del método calcular.
} // Fin de la clase.
