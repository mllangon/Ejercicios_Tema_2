package _2_;

public class Libro {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public void leer() {
        System.out.println("Leyendo el libro: " + titulo);
    }

    protected void finalizar() throws Throwable {
        System.out.println("El libro '" + titulo + "' ahora está siendo reciclado.");
        super.finalize();
    }
}