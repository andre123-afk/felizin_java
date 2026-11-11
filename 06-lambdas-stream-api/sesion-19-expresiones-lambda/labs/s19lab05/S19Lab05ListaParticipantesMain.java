package s19lab05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class S19Lab05ListaParticipantesMain {
    public static void main(String[] args) {
        // El instructor quiere ordenar nombres alfabéticamente.
        // Como List.sort recibe un Comparator<String>, usamos una lambda que compare dos nombres.
        Comparator<String> ordenAlfabetico = (nombre1, nombre2) -> nombre1.compareTo(nombre2);

        // Caso 1: nombres con orden normal.
        List<String> participantes1 = new ArrayList<>(List.of("Sofia", "Luis", "Ana"));
        participantes1.sort(ordenAlfabetico);
        System.out.println("Caso 1: " + participantes1);

        // Caso 2: nombres con duplicados, donde "Ana" puede aparecer más de una vez.
        List<String> participantes2 = new ArrayList<>(List.of("Luis", "Ana", "Ana"));
        participantes2.sort(ordenAlfabetico);
        System.out.println("Caso 2: " + participantes2);

        // Caso 3: lista vacía, sin producir error al ordenar.
        List<String> participantes3 = new ArrayList<>();
        participantes3.sort(ordenAlfabetico);
        System.out.println("Caso 3: " + participantes3);

    }
}
