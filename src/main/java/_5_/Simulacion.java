package _5_;

public class Simulacion {
    public static void main(String[] args) {
        Vehiculo bicicleta = new Bicicleta();
        Motorizado coche = new Coche();
        Motorizado camion = new Camion();
        Motorizado deportivo = new Deportivo();

        mostrarMovimiento(bicicleta);
        mostrarMovimiento(coche);
        mostrarMovimiento(camion);
        mostrarMovimiento(deportivo);

        mostrarEstadoMotor(coche);
        mostrarEstadoMotor(camion);
        mostrarEstadoMotor(deportivo);
    }

    public static void mostrarMovimiento(Vehiculo vehiculo) {
        vehiculo.mover();
    }

    public static void mostrarEstadoMotor(Motorizado vehiculoMotorizado) {
        vehiculoMotorizado.encenderMotor();
        vehiculoMotorizado.apagarMotor();
    }
}