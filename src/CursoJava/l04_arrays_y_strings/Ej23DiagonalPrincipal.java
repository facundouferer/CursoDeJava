package CursoJava.l04_arrays_y_strings;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Mostrar los elementos de la diagonal principal de una matriz cuadrada.
 * Concepto: 6. Matrices y arrays irregulares (la diagonal es la casilla donde fila y columna coinciden).
 */
public class Ej23DiagonalPrincipal {

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Elementos de la diagonal principal:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]);
        }
    }
}
