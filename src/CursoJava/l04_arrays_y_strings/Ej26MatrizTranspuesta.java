package CursoJava.l04_arrays_y_strings;

import java.util.Arrays;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Obtener la transpuesta de una matriz rectangular (las filas pasan a ser columnas).
 * Concepto: 6. Matrices y arrays irregulares (la transpuesta se instancia como new int[columnas][filas]).
 */
public class Ej26MatrizTranspuesta {

    public static void main(String[] args) {
        int[][] cuadrada = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] rectangular = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        System.out.println("Transpuesta de la matriz cuadrada:");
        imprimirMatriz(transponer(cuadrada));

        System.out.println("Matriz rectangular: " + Arrays.deepToString(rectangular));
        System.out.println("Su transpuesta: " + Arrays.deepToString(transponer(rectangular)));
    }

    public static int[][] transponer(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // La transpuesta invierte las dimensiones.
        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
