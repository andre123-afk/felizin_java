import java.util.Locale;

public class S04Lab05NormalizaRegistro {
    public static void main(String[] args) {
        String nombreEntrada = "  Laura Gomez  ";
        String documentoEntrada = " 1048 ";
        String edadTexto = " 24 ";
        String ciudadEntrada = "bucaramanga";
        String estaturaTexto = "1.68";

        // TODO 1: Limpiar nombre y documento conservando los originales.
        // el documento sigue siendo texto, no lo paso a numero para no perder ceros iniciales
        String nombre = nombreEntrada.strip();
        String documento = documentoEntrada.strip();

        // TODO 2: Rechazar nombre en blanco o documento con menos de 4 posiciones.
        if (nombre.isBlank() || documento.length() < 4) {
            System.out.println("Registro invalido");
        } else {

            // TODO 3: Convertir edad a int y estatura a double despues de strip.
            int edad = Integer.parseInt(edadTexto.strip());
            double estatura = Double.parseDouble(estaturaTexto.strip());

            // TODO 4: Validar edad de 0 a 120 y estatura positiva y finita.
            if (edad < 0 || edad > 120 || estatura <= 0 || !Double.isFinite(estatura)) {
                System.out.println("Registro invalido");
            } else {

                // TODO 5: Normalizar ciudad a mayusculas con Locale.ROOT.
                String ciudad = ciudadEntrada.strip().toUpperCase(Locale.ROOT);

                // TODO 6: Clasificar por mayoria de edad.
                String categoria;
                if (edad >= 18) {
                    categoria = "MAYOR_DE_EDAD";
                } else {
                    categoria = "MENOR_DE_EDAD";
                }

                // TODO 7: Mostrar la ficha con las seis etiquetas indicadas.
                System.out.println("Nombre: " + nombre);
                System.out.println("Documento: " + documento);
                System.out.println("Edad: " + edad);
                System.out.println("Ciudad: " + ciudad);
                System.out.println("Estatura (m): " + estatura);
                System.out.println("Categoria: " + categoria);
            }
        }

        // TODO 8: Probar caso inicial, edad 17 y nombre en blanco.
        // caso inicial: Nombre: Laura Gomez, Documento: 1048, Edad: 24, Ciudad: BUCARAMANGA, Estatura (m): 1.68, Categoria: MAYOR_DE_EDAD
        // edad 17: solo cambian Edad: 17 y Categoria: MENOR_DE_EDAD
        // nombre "   ": imprime solo Registro invalido

        // TODO 9: Observar opcionalmente el error de parsing con veinte y restaurar el dato valido.
        // con edadTexto = "veinte" salta NumberFormatException en la linea del parseInt, ya quedo restaurado en " 24 "
    }
}