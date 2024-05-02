package _5_;

public class Coche extends Terrestre implements Motorizado {
    @Override
    public void mover() {
        System.out.println("El coche se está moviendo.");
    }

    @Override
    public void encenderMotor() {
        System.out.println("El motor del coche se está encendiendo.");
    }

    @Override
    public void apagarMotor() {
        System.out.println("El motor del coche se está apagando.");
    }
}