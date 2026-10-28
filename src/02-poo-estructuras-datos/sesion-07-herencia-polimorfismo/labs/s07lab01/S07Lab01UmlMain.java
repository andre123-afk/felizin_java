package s07lab01;

public class S07Lab01UmlMain {
    public static void main(String[] args) {
        TramitePresencial tramite = new TramitePresencial("T-01");
        Validador validador = new Validador();
        System.out.println(tramite.descripcion());
        System.out.println(tramite.verificar(validador));

        // "es un": TramitePresencial es un Tramite (herencia, flecha con triangulo)
        // "usa": Tramite usa un Validador solo cuando le llega por parametro en verificar (flecha punteada)
    }
}