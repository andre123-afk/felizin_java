package s19lab02;

import java.util.function.Supplier; // Supplier<T> no recibe argumentos y devuelve un valor.

public class S19Lab02HorarioAtencionMain {
    public static void main(String[] args) {
        // La operación debe devolver el texto del horario cuando alguien lo solicite.
        // No recibe argumentos y devuelve un String, por eso usamos Supplier<String>.
        Supplier<String> horarioAtencion = () -> "Horario: 8:00 a 17:00";

        System.out.println(horarioAtencion.get());
        System.out.println(horarioAtencion.get());
        System.out.println(horarioAtencion.get());


    }
}
