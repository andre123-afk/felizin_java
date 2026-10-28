package s07lab03;

public class S07Lab03AbstractasMain {
    public static void mostrarPlan(PlanEntrenamiento plan) {
        // TODO 5: Imprimir nombre y duracion mediante los metodos del plan.
        System.out.println(plan.getNombre() + ": " + plan.duracionMinutos() + " min");
    }

    public static void main(String[] args) {
        PlanEntrenamiento fuerza = new PlanFuerza();
        PlanEntrenamiento cardio = new PlanCardio();
        mostrarPlan(fuerza);
        mostrarPlan(cardio);

        // new PlanFuerza() es valido porque PlanFuerza es concreta y ya implementa duracionMinutos
        // new PlanEntrenamiento("General") no compila porque una clase abstracta no se puede instanciar
    }
}