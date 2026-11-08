package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: ingresar tres números enteros e informar cuál es el mayor.
 * Concepto: 3. Bucles e iteración: for; 1. Condicionales: if.
 */
public class Ej16MayorDeTresNumeros {

    private static final int CANTIDAD = 3;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[CANTIDAD];

        for (int i = 0; i < CANTIDAD; i++) {
            System.out.println("Ingrese el número entero " + (i + 1) + ":");
            numeros[i] = entrada.nextInt();
        }

        int mayor = numeros[0];
        for (int i = 1; i < CANTIDAD; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("Los números ingresados son: " + numeros[0] + ", " + numeros[1] + " y " + numeros[2] + ".");
        System.out.println("El número mayor es: " + mayor + ".");
        entrada.close();
    }
}
