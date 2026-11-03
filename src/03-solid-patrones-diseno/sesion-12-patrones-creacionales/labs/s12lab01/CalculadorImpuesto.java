package s12lab01; // Declara el paquete de las clases del lab 01.

// Define el contrato que implementa cada calculador de impuesto.
public interface CalculadorImpuesto {
    // La base usa pesos enteros entre 0 y 1000000, y debe ser múltiplo de 100.
    // Este método devuelve el impuesto calculado para una base dada.
    long calcular(long base);
} // Fin de la interfaz.
