package Reto1.Process;
public class MenuDeCalculos {
    // Método para calcular el índice de masa corporal (IMC)
    public static double calcularIMC(double peso, double estatura) {
        // Convertir estatura a metros
        double estaturaMetros = estatura / 100.0;
        // Calcular IMC
        return peso / (estaturaMetros * estaturaMetros);
    }

    // Método para interpretar el IMC y mostrar la condición del paciente
    public static String interpretarIMC(double imc) {
        if (imc < 18.5)
            return "Peso bajo";
        else if (imc >= 18.5 && imc <= 24.99)
            return "Peso normal";
        else if (imc >= 25 && imc <= 29.99)
            return "Sobrepeso";
        else if (imc >= 30 && imc <= 34.99)
            return "Obesidad leve";
        else if (imc >= 35 && imc <= 39.99)
            return "Obesidad media";
        else
            return "Obesidad mórbida";
    }

    // Método para calcular la masa corporal magra
    public static double calcularMasaCorporalMagra(double peso, double estatura, String sexo) {
        // Convertir estatura a metros
        double estaturaMetros = estatura / 100.0;
        // Calcular masa corporal magra
        if (sexo.equalsIgnoreCase("mujer"))
            return (1.07 * peso) - 148 * (peso * peso) / (estaturaMetros * estaturaMetros);
        else
            return (1.10 * peso) - 128 * (peso * peso) / (estaturaMetros * estaturaMetros);
    }

    // Método para calcular el metabolismo basal (Gasto energético basal)
    public static double calcularMetabolismoBasal(double peso, double estatura, int edad, String sexo) {
        if (sexo.equalsIgnoreCase("mujer"))
            return 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
        else
            return 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
    }
}