package _5_;

public class Camion extends Terrestre implements Motorizado {
    @Override
    public void mover() {
        System.out.println("El camión se está moviendo.");
    }

    @Override
    public void encenderMotor() {
        System.out.println("El motor del camión se está encendiendo.");
    }

    @Override
    public void apagarMotor() {
        System.out.println("El motor del camión se está apagando.");
    }
}