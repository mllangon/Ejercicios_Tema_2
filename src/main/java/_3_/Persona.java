package _3_;

import _2_.Lampara;
import _2_.Libro;
import _2_.Reloj;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void despertar(Reloj reloj, Lampara lampara) {
        System.out.println(nombre + " se despertó por la alarma del reloj.");
        reloj.iniciarAlarma(lampara);
    }

    public void encenderLampara(Lampara lampara) {
        System.out.println(nombre + " enciende la lámpara.");
        lampara.encender();
    }

    public void leerLibro(Libro libro) {
        System.out.println(nombre + " comienza a leer el libro: " + libro.getTitulo());
        libro.leer();
    }
}