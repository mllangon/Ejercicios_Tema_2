package _4_;

public class Bateria {
    private int capacidad;
    private int nivel;

    public Bateria(int capacidad) {
        this.capacidad = capacidad;
        this.nivel = 100;
    }

    public void cargar() {
        this.nivel = 100;
    }

    public void usarBateria(int uso) {
        this.nivel -= uso;
    }
}