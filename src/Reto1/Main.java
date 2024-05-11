package Reto1;
import Reto1.Process.MenuDeCalculos;
import Reto1.ui.CLI;

public class Main {
    public static void main(String[] args) {
        CLI cli = new CLI();
        char opcion;

        // Mostrar menú de opciones
        do {
            cli.mostrarMenu();
            opcion = cli.obtenerOpcion();

            switch (opcion) {
                case 'A':
                    // Cálculo de índice de masa corporal (IMC)
                    double[] datosIMC = cli.solicitarDatosPaciente();
                    double imc = MenuDeCalculos.calcularIMC(datosIMC[0], datosIMC[1]);
                    String interpretacionIMC = MenuDeCalculos.interpretarIMC(imc);
                    cli.mostrarResultados("El IMC calculado es: " + imc + ". Interpretación: " + interpretacionIMC);
                    break;
                case 'B':
                    // Cálculo de masa corporal magra
                    double[] datosMasaMagra = cli.solicitarDatosPaciente();
                    String sexo = cli.solicitarSexo();
                    double masaMagra = MenuDeCalculos.calcularMasaCorporalMagra(datosMasaMagra[0], datosMasaMagra[1], sexo);
                    cli.mostrarResultados("La masa corporal magra calculada es: " + masaMagra + " kg.");
                    break;
                case 'C':
                    // Cálculo de metabolismo basal
                    double[] datosMetabolismo = cli.solicitarDatosPaciente();
                    int edad = cli.solicitarEdad();
                    String sexoMB = cli.solicitarSexo();
                    double metabolismoBasal = MenuDeCalculos.calcularMetabolismoBasal(datosMetabolismo[0], datosMetabolismo[1], edad, sexoMB);
                    cli.mostrarResultados("El metabolismo basal calculado es: " + metabolismoBasal + " kcal/día.");
                    break;
                default:
                    cli.mostrarResultados("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 'A' && opcion != 'B' && opcion != 'C');
    }
}