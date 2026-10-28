public class S04Lab02ExtraeIdentificador {
    public static void main(String[] args) {
        String codigo = "USR-1048-CO";

        // TODO 1: Validar longitud 11 antes de acceder a posiciones.
        // primero reviso la longitud para que charAt y substring no se salgan de rango
        if (codigo.length() == 11) {

            // TODO 2: Comprobar prefijo USR- y separador en indice 8.
            if (codigo.substring(0, 4).equals("USR-") && codigo.charAt(8) == '-') {

                // TODO 3: Extraer tipo, numeroTexto, pais e inicial.
                String tipo = codigo.substring(0, 3);
                String numeroTexto = codigo.substring(4, 8);
                String pais = codigo.substring(9, 11);
                char inicial = codigo.charAt(0);

                // TODO 4: Mostrar los cuatro datos o solo Codigo invalido.
                System.out.println("Tipo: " + tipo);
                System.out.println("Numero: " + numeroTexto);
                System.out.println("Pais: " + pais);
                System.out.println("Inicial: " + inicial);
            } else {
                System.out.println("Codigo invalido");
            }
        } else {
            System.out.println("Codigo invalido");
        }

        // TODO 5: Probar el codigo inicial y USR; explicar el final exclusivo de substring.
        // con USR-1048-CO sale Tipo: USR, Numero: 1048, Pais: CO, Inicial: U
        // con USR la longitud es 3 y solo sale Codigo invalido
        // substring(4, 8) no incluye el indice 8 porque el final es exclusivo, toma los indices 4, 5, 6 y 7 (los 4 digitos) y el 8 es el guion
    }
}