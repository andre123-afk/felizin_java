public class S04Lab04CastingYWrappers {
    public static void main(String[] args) {
        int cantidad = 10;
        double medicion = 7.9;
        String cantidadTexto = "42";

        // TODO 1: Ampliar cantidad a double sin cast y mostrarla.
        double cantidadAmpliada = cantidad;
        System.out.println("Cantidad ampliada: " + cantidadAmpliada);

        // TODO 2: Truncar medicion a int y mostrarla.
        int medicionTruncada = (int) medicion;
        System.out.println("Medicion truncada: " + medicionTruncada);

        // TODO 3: Truncar -7.9 a int y mostrarlo.
        int negativaTruncada = (int) -7.9;
        System.out.println("Negativa truncada: " + negativaTruncada);

        // TODO 4: Obtener un int con parseInt y un Integer con valueOf.
        int cantidadPrimitiva = Integer.parseInt(cantidadTexto);
        Integer cantidadObjeto = Integer.valueOf(cantidadTexto);

        // TODO 5: Realizar unboxing y mostrar los tres valores.
        int recuperada = cantidadObjeto;
        System.out.println("Primitivo: " + cantidadPrimitiva);
        System.out.println("Wrapper: " + cantidadObjeto);
        System.out.println("Unboxing: " + recuperada);

        // TODO 6: Convertir el primitivo a String con String.valueOf y mostrarlo entre corchetes.
        String texto = String.valueOf(cantidadPrimitiva);
        System.out.println("Texto: [" + texto + "]");

        // TODO 7: Explicar casting frente a parsing y primitivo frente a wrapper.
        // el casting cambia entre tipos numericos (double a int) y trunca hacia cero, el parsing interpreta un texto y lo vuelve numero, un String no se puede castear a int
        // int es un primitivo que guarda solo el valor, Integer es un objeto wrapper que envuelve ese valor (boxing) y se puede volver a int con unboxing
    }
}