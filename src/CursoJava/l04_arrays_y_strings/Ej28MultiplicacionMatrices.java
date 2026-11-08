package CursoJava.l04_arrays_y_strings;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Multiplicar dos matrices compatibles (columnas de la primera igual a filas de la segunda).
 * Concepto: 6. Matrices y arrays irregulares (tres bucles anidados sobre arrays de arrays).
 */
public class Ej28MultiplicacionMatrices {

    public static void main(String[] args) {
        int[][] primera = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        int[][] segunda = {
                { 7, 8 },
                { 9, 10 },
                { 11, 12 }
        };

        if (primera[0].length != segunda.length) {
            System.out.println("Las matrices no se pueden multiplicar: las dimensiones no son compatibles.");
            return;
        }

        System.out.println("Producto de las matrices:");
        for (int[] fila : multiplicar(primera, segunda)) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplicar(int[][] primera, int[][] segunda) {
        int filas = primera.length;
        int columnasPrimera = primera[0].length;
        int columnasSegunda = segunda[0].length;

        int[][] resultado = new int[filas][columnasSegunda];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnasSegunda; j++) {
                for (int k = 0; k < columnasPrimera; k++) {
                    resultado[i][j] += primera[i][k] * segunda[k][j];
                }
            }
        }
        return resultado;
    }
}
