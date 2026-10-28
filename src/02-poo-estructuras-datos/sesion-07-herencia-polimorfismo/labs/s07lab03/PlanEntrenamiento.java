package s07lab03;

// TODO 1: Declarar PlanEntrenamiento como clase abstracta.
public abstract class PlanEntrenamiento {
    private final String nombre;

    public PlanEntrenamiento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // TODO 2: Declarar public abstract int duracionMinutos() sin cuerpo.
    // getNombre es concreto (ya tiene cuerpo) y duracionMinutos es abstracto, cada plan aporta el suyo
    public abstract int duracionMinutos();
}