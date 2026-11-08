package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: calcular el promedio de alumnos por comisión y el porcentaje de hombres y mujeres de las 3 comisiones
 * de Programación I.
 * Concepto: 3. Bucles e iteración: for.
 */
public class Ej12PorcentajeEstudiantes {

    private static final int CANTIDAD_COMISIONES = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalHombres = 0;
        int totalMujeres = 0;

        for (int comision = 1; comision <= CANTIDAD_COMISIONES; comision++) {
            System.out.println("Ingrese la cantidad de hombres de la comisión " + comision + ":");
            totalHombres += entrada.nextInt();
            System.out.println("Ingrese la cantidad de mujeres de la comisión " + comision + ":");
            totalMujeres += entrada.nextInt();
        }

        int total = totalHombres + totalMujeres;
        if (total == 0) {
            System.out.println("No hay alumnos cursando.");
        } else {
            double promedio = (double) total / CANTIDAD_COMISIONES;
            double porcentajeHombres = totalHombres * 100.0 / total;
            double porcentajeMujeres = totalMujeres * 100.0 / total;
            System.out.println("El promedio de alumnos por comisión es de: " + promedio);
            System.out.println("El porcentaje de hombres es de: " + porcentajeHombres + "%");
            System.out.println("El porcentaje de mujeres es de: " + porcentajeMujeres + "%");
        }
        entrada.close();
    }
}
