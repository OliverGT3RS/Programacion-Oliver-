package Reto1.ui;

import java.util.Scanner;

public class  CLI {
    private Scanner scanner;

    public CLI() {
        scanner = new Scanner(System.in);
    }

    // Método para mostrar el menú de opciones
    public void mostrarMenu() {
        System.out.println("--- Menú de Cálculos ---");
        System.out.println("A. Cálculo de masa corporal (índice de masa corporal)");
        System.out.println("B. Cálculo de masa corporal magra");
        System.out.println("C. Cálculo de metabolismo basal (gasto energético basal)");
        System.out.println("Seleccione una opción:");
    }

    // Método para obtener la opción seleccionada por el usuario
    public char obtenerOpcion() {
        return scanner.nextLine().toUpperCase().charAt(0);
    }

    // Método para solicitar los datos del paciente (peso y estatura)
    public double[] solicitarDatosPaciente() {
        double[] datos = new double[2];
        System.out.print("Ingrese el peso del paciente (kg): ");
        datos[0] = Double.parseDouble(scanner.nextLine());
        System.out.print("Ingrese la estatura del paciente (cm): ");
        datos[1] = Double.parseDouble(scanner.nextLine());
        return datos;
    }

    // Método para solicitar el sexo del paciente
    public String solicitarSexo() {
        System.out.print("Ingrese el sexo del paciente (mujer/hombre): ");
        return scanner.nextLine();
    }

    // Método para solicitar la edad del paciente
    public int solicitarEdad() {
        System.out.print("Ingrese la edad del paciente: ");
        return Integer.parseInt(scanner.nextLine());
    }

    // Método para mostrar resultados
    public void mostrarResultados(String resultado) {
        System.out.println(resultado);
    }
}

