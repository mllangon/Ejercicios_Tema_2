package _2_;

public class Lampara {
    private boolean encendida;

    public Lampara() {
        this.encendida = false;
    }

    public void encender() {
        this.encendida = true;
        System.out.println("La lámpara está encendida.");
    }

    public void apagar() {
        this.encendida = false;
        System.out.println("La lámpara está apagada.");
    }
}