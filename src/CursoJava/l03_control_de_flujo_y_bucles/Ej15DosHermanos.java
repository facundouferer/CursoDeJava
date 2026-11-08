package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: informar la edad del hermano mayor y cuántos años de diferencia tiene con el menor.
 * Concepto: 1. Condicionales: if, else.
 */
public class Ej15DosHermanos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad del primer hermano:");
        int edadPrimero = entrada.nextInt();
        System.out.println("Ingrese la edad del segundo hermano:");
        int edadSegundo = entrada.nextInt();

        int edadMayor = Math.max(edadPrimero, edadSegundo);
        int edadMenor = Math.min(edadPrimero, edadSegundo);

        System.out.println("El hermano mayor tiene " + edadMayor + " años y el hermano menor tiene " + edadMenor
                + " años. La diferencia de edad es de " + (edadMayor - edadMenor) + " años.");
        entrada.close();
    }
}
