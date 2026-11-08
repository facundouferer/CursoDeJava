package CursoJava.l04_arrays_y_strings;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Rellenar con números aleatorios un arreglo de 100 posiciones y una matriz de 9 por 9, y mostrarlos.
 * Concepto: 6. Matrices y arrays irregulares (bucles anidados para escribir y for-each para leer).
 */
public class Ej22RellenarConAleatorios {

    public static void main(String[] args) {
        int[] arreglo = new int[100];
        rellenarArreglo(arreglo);
        System.out.println("Arreglo de 100 posiciones:");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();

        int[][] matriz = new int[9][9];
        rellenarMatriz(matriz);
        System.out.println("Matriz de 9 por 9:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    /** Escribe valores entre 0 y 99; al modificar el arreglo hace falta el índice. */
    public static void rellenarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
    }

    public static void rellenarMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            rellenarArreglo(matriz[fila]);
        }
    }
}
