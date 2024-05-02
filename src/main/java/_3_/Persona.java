package _3_;

import _2_.Lampara;
import _2_.Libro;
import _2_.Reloj;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void despertar(_2_.Reloj reloj) {
        System.out.println(nombre + " se despertó por la alarma del reloj.");
        reloj.iniciarAlarma(new _2_.Lampara());
    }

    public void encenderLampara(_2_.Lampara lampara) {
        System.out.println(nombre + " enciende la lámpara.");
        lampara.encender();
    }

    public void leerLibro(_2_.Libro libro) {
        System.out.println(nombre + " comienza a leer el libro: " + libro.getTitulo());
        libro.leer();
    }
}