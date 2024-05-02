package _2_;

import java.util.Timer;
import java.util.TimerTask;

public class Reloj {
    private Timer timer;

    public Reloj() {
        timer = new Timer();
    }

    public void iniciarAlarma(final Lampara lampara) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                lampara.encender();
            }
        }, 5000);
        System.out.println("La alarma del reloj se ha configurado para encender la lámpara en 5 segundos.");
    }

    public void cancelarAlarma() {
        timer.cancel();
        System.out.println("El reloj está siendo desechado y su timer cancelado.");
    }
}