package CursoJava.l04_arrays_y_strings;

import java.util.Scanner;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Determinar si un arreglo es partidario: todo número en casilla par es mayor que cualquiera en casilla impar.
 * Concepto: 3. Recorrer un array (paso de 2 sobre índices pares e impares).
 */
public class Ej09ArregloPartidario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();
        if (cantidad < 0) {
            System.out.println("La cantidad no puede ser negativa.");
            return;
        }

        int[] numeros = new int[cantidad];
        System.out.println("Ingrese los números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        if (esPartidario(numeros)) {
            System.out.println("El arreglo es partidario.");
        } else {
            System.out.println("El arreglo no es partidario.");
        }
    }

    /**
     * Es partidario si el menor valor de las casillas pares supera al mayor de las impares.
     * Se resuelve en un solo recorrido, sin comparar cada par de casillas entre sí.
     */
    public static boolean esPartidario(int[] numeros) {
        int minimoEnPares = Integer.MAX_VALUE;
        int maximoEnImpares = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                minimoEnPares = Math.min(minimoEnPares, numeros[i]);
            } else {
                maximoEnImpares = Math.max(maximoEnImpares, numeros[i]);
            }
        }
        return minimoEnPares > maximoEnImpares;
    }
}
