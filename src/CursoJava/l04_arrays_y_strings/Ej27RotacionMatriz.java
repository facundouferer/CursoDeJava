package CursoJava.l04_arrays_y_strings;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Rotar 90 grados en sentido horario una matriz cuadrada.
 * Concepto: 6. Matrices y arrays irregulares (el elemento [i][j] pasa a la posición [j][n - 1 - i]).
 */
public class Ej27RotacionMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        System.out.println("Matriz rotada 90 grados en sentido horario:");
        imprimirMatriz(rotarMatriz(matriz));
    }

    public static int[][] rotarMatriz(int[][] matriz) {
        int n = matriz.length;
        int[][] rotada = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotada[j][n - 1 - i] = matriz[i][j];
            }
        }
        return rotada;
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
