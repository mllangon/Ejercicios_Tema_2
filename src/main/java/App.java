import javax.swing.*;
import java.awt.*;
import _2_.Lampara;
import _2_.Reloj;
import _3_.Persona;
import _4_.TelefonoMovil;
import _4_.Bateria;
import _4_.Pantalla;
import _4_.SistemaOperativo;
import _5_.Vehiculo;
import _5_.Bicicleta;
import _5_.Coche;
import _5_.Camion;
import _5_.Deportivo;
import _6_.Empleado;
import _6_.EmpleadoAsalariado;
import _6_.EmpleadoPorHoras;
import _6_.Empresa;

public class App extends JFrame {
    private JButton btnEjercicio1, btnEjercicio2, btnEjercicio3, btnEjercicio4, btnEjercicio5, btnEjercicio6, btnCerrar;

    public App() {
        super("Demostración de Conceptos de Programación");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        JPanel panelBotones = new JPanel(new GridLayout(7, 1));
        btnEjercicio1 = new JButton("1. Investigación y Análisis Crítico de Lenguajes de Programación");
        btnEjercicio2 = new JButton("2. Demostración de Lámpara, Reloj y Libro");
        btnEjercicio3 = new JButton("3. Demostración de Interacción Persona con Reloj y Lámpara");
        btnEjercicio4 = new JButton("4. Demostración de Funciones del Teléfono Móvil");
        btnEjercicio5 = new JButton("5. Simulación de Vehículos");
        btnEjercicio6 = new JButton("6. Gestión de Empleados en Empresa");
        btnCerrar = new JButton("Cerrar Aplicación");

        panelBotones.add(btnEjercicio1);
        panelBotones.add(btnEjercicio2);
        panelBotones.add(btnEjercicio3);
        panelBotones.add(btnEjercicio4);
        panelBotones.add(btnEjercicio5);
        panelBotones.add(btnEjercicio6);
        panelBotones.add(btnCerrar);

        add(panelBotones, BorderLayout.CENTER);

        btnEjercicio1.addActionListener(e -> mostrarAnalisisCritico());
        btnEjercicio2.addActionListener(e -> mostrarDemoLamparaReloj());
        btnEjercicio3.addActionListener(e -> mostrarDemoInteraccionPersona());
        btnEjercicio4.addActionListener(e -> mostrarDemoTelefonoMovil());
        btnEjercicio5.addActionListener(e -> mostrarSimulacionVehiculos());
        btnEjercicio6.addActionListener(e -> mostrarGestionEmpleados());
        btnCerrar.addActionListener(e -> cerrarAplicacion());

        setVisible(true);
    }

    private void mostrarAnalisisCritico() {
        JTextArea textArea = new JTextArea(15, 30);
        textArea.setText("1. Investigación y Análisis Crítico de Lenguajes de Programación\n"
                + "C (Lenguaje Procedimental):\n"
                + "Abstracción: En C, la abstracción se maneja a través de funciones y punteros a funciones, lo que permite separar la implementación de la interfaz.\n"
                + "Evolución: Con el tiempo, se han creado bibliotecas que facilitan niveles más altos de abstracción, aunque el lenguaje en sí es bastante bajo nivel.\n"
                + "Java (Lenguaje Orientado a Objetos):\n"
                + "Abstracción: Java utiliza clases e interfaces para abstraer detalles de implementación. Las interfaces son un medio clave para definir contratos sin especificar cómo se realizan las tareas.\n"
                + "Evolución: A lo largo de los años, Java ha evolucionado para soportar abstracciones más robustas, incluyendo lambdas y streams introducidos en Java 8.\n"
                + "Python (Lenguaje Multiparadigma):\n"
                + "Abstracción: Python soporta la abstracción a través de clases, pero también permite una programación más flexible con funciones de primera clase y múltiples paradigmas de programación.\n"
                + "Evolución: Python ha continuado expandiendo su soporte para diferentes paradigmas y técnicas de abstracción, como decoradores y generadores.");
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollPane, "Análisis Crítico", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarDemoLamparaReloj() {
        Lampara lampara = new Lampara();
        Reloj reloj = new Reloj();
        reloj.iniciarAlarma(lampara);
        JOptionPane.showMessageDialog(this, "Lámpara encendida por el reloj después de 5 segundos", "Demo Lámpara y Reloj", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarDemoInteraccionPersona() {
        Persona persona = new Persona("Juan");
        Lampara lampara = new Lampara();
        Reloj reloj = new Reloj();
        persona.despertar(reloj, lampara);
        JOptionPane.showMessageDialog(this, "Juan se despierta y el reloj enciende la lámpara", "Interacción Persona", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarDemoTelefonoMovil() {
        Bateria bateria = new Bateria(3000);
        Pantalla pantalla = new Pantalla(6.0, "1080x1920");
        SistemaOperativo os = new SistemaOperativo("Android", "10.0");
        TelefonoMovil movil = new TelefonoMovil("Samsung", "Galaxy S10", bateria, pantalla, os);
        movil.encender();
        JOptionPane.showMessageDialog(this, "Teléfono Móvil 'Samsung Galaxy S10' encendido: Pantalla y SO activos", "Demo Teléfono Móvil", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarSimulacionVehiculos() {
        Vehiculo bicicleta = new Bicicleta();
        Vehiculo coche = new Coche();
        Vehiculo camion = new Camion();
        Vehiculo deportivo = new Deportivo();
        bicicleta.mover();
        coche.mover();
        camion.mover();
        deportivo.mover();
        JOptionPane.showMessageDialog(this, "Bicicleta, Coche, Camión, y Deportivo se han movido", "Simulación Vehículos", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarGestionEmpleados() {
        Empresa empresa = new Empresa();
        Empleado emp1 = new EmpleadoAsalariado("Pedro", 3000);
        Empleado emp2 = new EmpleadoPorHoras("Ana", 20, 120);
        empresa.contratarEmpleado(emp1);
        empresa.contratarEmpleado(emp2);
        double totalSalarios = empresa.calcularSalarioTotal();
        JOptionPane.showMessageDialog(this, "Total de salarios pagados: $" + totalSalarios + " (Pedro: $3000, Ana: $" + (20 * 120) + ")", "Gestión Empleados", JOptionPane.INFORMATION_MESSAGE);
    }

    private void cerrarAplicacion() {
        System.exit(0);
    }

    public static void main(String[] args) {
        new App();
    }
}
