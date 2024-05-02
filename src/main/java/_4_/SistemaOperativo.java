package _4_;

public class SistemaOperativo {
    private String nombre;
    private String version;

    public SistemaOperativo(String nombre, String version) {
        this.nombre = nombre;
        this.version = version;
    }

    public void actualizar(String nuevaVersion) {
        this.version = nuevaVersion;
        System.out.println("El sistema operativo ha sido actualizado a la versión " + nuevaVersion);
    }
}