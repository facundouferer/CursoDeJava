package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: ingresar sexo (M/F), edad y carrera (A, B o C) de N alumnos e informar la carrera con menor promedio
 * de edad entre sus alumnos varones.
 * Concepto: 3. Bucles e iteración: for; 2. La estructura switch.
 */
public class Ej39AlumnosUniversidad {

    private static final int CANTIDAD_CARRERAS = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos:");
        int cantidadAlumnos = entrada.nextInt();

        int[] sumaEdades = new int[CANTIDAD_CARRERAS];
        int[] cantidadVarones = new int[CANTIDAD_CARRERAS];

        for (int i = 1; i <= cantidadAlumnos; i++) {
            System.out.println("Alumno " + i + " - Ingrese el sexo (M/F):");
            char sexo = Character.toUpperCase(entrada.next().charAt(0));
            System.out.println("Alumno " + i + " - Ingrese la edad:");
            int edad = entrada.nextInt();
            System.out.println("Alumno " + i + " - Ingrese la carrera (A, B o C):");
            char carrera = Character.toUpperCase(entrada.next().charAt(0));

            int indice = carrera - 'A';
            if (sexo == 'M' && indice >= 0 && indice < CANTIDAD_CARRERAS) {
                sumaEdades[indice] += edad;
                cantidadVarones[indice]++;
            }
        }

        int mejorCarrera = -1;
        double menorPromedio = Double.MAX_VALUE;
        for (int i = 0; i < CANTIDAD_CARRERAS; i++) {
            if (cantidadVarones[i] > 0) {
                double promedio = (double) sumaEdades[i] / cantidadVarones[i];
                if (promedio < menorPromedio) {
                    menorPromedio = promedio;
                    mejorCarrera = i;
                }
            }
        }

        if (mejorCarrera == -1) {
            System.out.println("No se ingresaron alumnos varones.");
        } else {
            System.out.println("La carrera con menor promedio de edad de varones es la " + (char) ('A' + mejorCarrera)
                    + " (" + menorPromedio + " años).");
        }
        entrada.close();
    }
}
