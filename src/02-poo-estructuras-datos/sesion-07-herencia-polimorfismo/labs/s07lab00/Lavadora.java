package s07lab00;

// TODO 1: Hacer que Lavadora herede de Electrodomestico.
public class Lavadora extends Electrodomestico {
    private int capacidadKg;

    public Lavadora(String marca, int capacidadKg) {
        // TODO 2: Invocar super(marca) primero y guardar capacidadKg con this.
        // super inicializa la marca en la base y this.capacidadKg guarda la capacidad
        super(marca);
        this.capacidadKg = capacidadKg;
    }

    public String ficha() {
        // TODO 3: Devolver la ficha usando describirMarca() y capacidadKg.
        return "Lavadora " + describirMarca() + " - capacidad: " + capacidadKg + " kg";
    }
}