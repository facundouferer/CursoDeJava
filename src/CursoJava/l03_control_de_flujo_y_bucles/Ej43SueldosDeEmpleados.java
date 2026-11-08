package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: leer los sueldos de N empleados e informar cuántos cobran entre $100 y $300, cuántos cobran más de
 * $300 y el gasto total en sueldos.
 * Concepto: 3. Bucles e iteración: for.
 */
public class Ej43SueldosDeEmpleados {

    private static final int CANTIDAD_EMPLEADOS = 5;
    private static final int LIMITE_SUELDO = 300;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sueldosHastaLimite = 0;
        int sueldosSobreLimite = 0;
        int gastoTotal = 0;

        for (int i = 1; i <= CANTIDAD_EMPLEADOS; i++) {
            System.out.println("Ingrese el sueldo del empleado " + i + ":");
            int sueldo = entrada.nextInt();
            gastoTotal += sueldo;

            if (sueldo <= LIMITE_SUELDO) {
                sueldosHastaLimite++;
            } else {
                sueldosSobreLimite++;
            }
        }

        System.out.println("Empleados que cobran entre $100 y $300: " + sueldosHastaLimite);
        System.out.println("Empleados que cobran más de $300: " + sueldosSobreLimite);
        System.out.println("Gasto total en sueldos: $" + gastoTotal);
        entrada.close();
    }
}
