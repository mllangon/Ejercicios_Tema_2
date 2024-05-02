package _5_;

public class Deportivo extends Coche {
    @Override
    public void mover() {
        System.out.println("El coche deportivo se está moviendo rápidamente.");
    }

    @Override
    public void encenderMotor() {
        System.out.println("El motor del coche deportivo se está encendiendo.");
    }

    @Override
    public void apagarMotor() {
        System.out.println("El motor del coche deportivo se está apagando.");
    }
}