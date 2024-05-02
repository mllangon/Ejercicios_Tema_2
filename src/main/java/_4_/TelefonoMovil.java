package _4_;

import java.util.ArrayList;
import java.util.List;

public class TelefonoMovil {
    private String marca;
    private String modelo;
    private boolean encendido;
    private Bateria bateria;
    private Pantalla pantalla;
    private SistemaOperativo sistemaOperativo;
    private List<Aplicacion> aplicaciones;

    public TelefonoMovil(String marca, String modelo, Bateria bateria, Pantalla pantalla, SistemaOperativo sistemaOperativo) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.pantalla = pantalla;
        this.sistemaOperativo = sistemaOperativo;
        this.aplicaciones = new ArrayList<>();
        this.encendido = false;
    }

    public void encender() {
        this.encendido = true;
        this.pantalla.encender();
    }

    public void apagar() {
        this.encendido = false;
        this.pantalla.apagar();
    }

    public void instalarAplicacion(Aplicacion app) {
        this.aplicaciones.add(app);
    }

    public void desinstalarAplicacion(Aplicacion app) {
        this.aplicaciones.remove(app);
    }
}