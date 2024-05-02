package _4_;

public class Aplicacion {
    private String nombre;
    private String version;

    public Aplicacion(String nombre, String version) {
        this.nombre = nombre;
        this.version = version;
    }

    public void abrir() {
        System.out.println("La aplicación " + this.nombre + " está abierta.");
    }

    public void cerrar() {
        System.out.println("La aplicación " + this.nombre + " está cerrada.");
    }
}