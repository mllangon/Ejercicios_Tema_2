package _6_;

public class EmpleadoAsalariado extends Empleado {
    private double salario;

    public EmpleadoAsalariado(String nombre, double salario) {
        super(nombre);
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}