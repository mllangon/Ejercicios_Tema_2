package _4_;

public class Pantalla {
    private double tamaño;
    private String resolucion;

    public Pantalla(double tamaño, String resolucion) {
        this.tamaño = tamaño;
        this.resolucion = resolucion;
    }

    public void encender() {
        System.out.println("La pantalla está encendida.");
    }

    public void apagar() {
        System.out.println("La pantalla está apagada.");
    }
}