package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: calcular el sueldo de un empleado según las horas trabajadas, pagando el doble las horas extras.
 * Concepto: 1. Condicionales: if, else.
 */
public class Ej09SueldoEmpleado {

    private static final int HORAS_NORMALES = 40;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = entrada.nextInt();
        System.out.print("Ingrese el sueldo por hora: ");
        double sueldoPorHora = entrada.nextDouble();

        double sueldoTotal;
        if (horasTrabajadas <= HORAS_NORMALES) {
            sueldoTotal = horasTrabajadas * sueldoPorHora;
        } else {
            // Las horas que exceden las normales (extras) se pagan al doble.
            int horasExtras = horasTrabajadas - HORAS_NORMALES;
            sueldoTotal = HORAS_NORMALES * sueldoPorHora + horasExtras * sueldoPorHora * 2;
        }

        System.out.println("El sueldo total del empleado es: $" + sueldoTotal);
        entrada.close();
    }
}
