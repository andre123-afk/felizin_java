public class S04Lab01LimpiaYCompara {
    public static void main(String[] args) {
        String nombreEntrada = "  Ana  ";
        String opcionEntrada = " si ";

        // TODO 1: Guardar nombreEntrada.strip() en nombreLimpio conservando el original.
        // strip devuelve un String nuevo, por eso lo guardo en otra variable
        String nombreLimpio = nombreEntrada.strip();

        // TODO 2: Mostrar Original, Limpio y Longitud limpia.
        System.out.println("Original: [" + nombreEntrada + "]");
        System.out.println("Limpio: [" + nombreLimpio + "]");
        System.out.println("Longitud limpia: " + nombreLimpio.length());

        // TODO 3: Limpiar opcionEntrada y comparar con SI usando equalsIgnoreCase.
        String opcionLimpia = opcionEntrada.strip();
        boolean confirmado = opcionLimpia.equalsIgnoreCase("SI");

        // TODO 4: Mostrar Confirmado con el resultado booleano.
        System.out.println("Confirmado: " + confirmado);

        // TODO 5: Probar los datos iniciales y explicar por qué el original no cambia.
        // Salida con los datos iniciales:
        // Original: [  Ana  ]
        // Limpio: [Ana]
        // Longitud limpia: 3
        // Confirmado: true
        // el original no cambia porque los String son inmutables, strip no modifica el objeto, crea uno nuevo con el texto limpio
        // (con opcionEntrada = "NO" Confirmado daria false)
    }
}