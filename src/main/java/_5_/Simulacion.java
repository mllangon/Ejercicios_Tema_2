package _5_;

public class Simulacion {
    public static void main(String[] args) {
        Vehiculo bicicleta = new Bicicleta();
        Vehiculo coche = new Coche();
        Vehiculo camion = new Camion();
        Vehiculo deportivo = new Deportivo();

        mostrarMovimiento(bicicleta);
        mostrarMovimiento(coche);
        mostrarMovimiento(camion);
        mostrarMovimiento(deportivo);

        mostrarEstadoMotor((Motorizado) coche);
        mostrarEstadoMotor((Motorizado) camion);
        mostrarEstadoMotor((Motorizado) deportivo);
    }

    public static void mostrarMovimiento(Vehiculo vehiculo) {
        vehiculo.mover();
    }

    public static void mostrarEstadoMotor(Motorizado vehiculoMotorizado) {
        vehiculoMotorizado.encenderMotor();
        vehiculoMotorizado.apagarMotor();
    }
}