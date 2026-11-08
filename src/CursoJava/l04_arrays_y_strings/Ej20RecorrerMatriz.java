package CursoJava.l04_arrays_y_strings;

import java.util.Arrays;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Recorrer una matriz de 4 filas por 3 columnas de tres formas distintas.
 * Concepto: 6. Matrices y arrays irregulares (un array de arrays, con bucles anidados y for-each anidado).
 */
public class Ej20RecorrerMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };

        // A) Un valor por línea, con su posición. Se usa matriz[fila].length: la longitud de ESA fila.
        System.out.println("MOSTRAR DE FORMA VERTICAL");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.println(matriz[fila][col] + " (" + fila + "," + col + ")");
            }
        }

        // B) Como matriz, con bucles anidados por índice.
        System.out.println("MOSTRAR COMO MATRIZ");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }

        // C) Con for-each anidado, cuando no hacen falta los índices.
        System.out.println("MOSTRAR CON FOR-EACH");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        // Para imprimir la matriz completa, Arrays.toString no alcanza: se usa deepToString.
        System.out.println(Arrays.deepToString(matriz));
    }
}
