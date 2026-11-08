package CursoJava.l04_arrays_y_strings;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Mostrar una matriz reemplazando por una X cada aparición de un elemento dado.
 * Concepto: 6. Matrices y arrays irregulares (el bucle interno usa la longitud de la fila actual).
 */
public class Ej29ReemplazarElementoEnMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 5 }
        };

        mostrarConReemplazo(matriz, 5);
    }

    public static void mostrarConReemplazo(int[][] matriz, int elemento) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                if (matriz[fila][col] == elemento) {
                    System.out.print("X ");
                } else {
                    System.out.print(matriz[fila][col] + " ");
                }
            }
            System.out.println();
        }
    }
}
