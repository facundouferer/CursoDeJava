package CursoJava.l04_arrays_y_strings;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Listar todos los pares de enteros no negativos cuya suma es igual a un número dado.
 * Concepto: 6. Matrices y arrays irregulares (un arreglo de arreglos de dos posiciones).
 */
public class Ej13ParesQueSuman {

    public static void main(String[] args) {
        int objetivo = 5;

        System.out.println("Pares cuya suma es igual a " + objetivo + ":");
        for (int[] par : encontrarPares(objetivo)) {
            System.out.println("[" + par[0] + ", " + par[1] + "]");
        }
    }

    /**
     * Devuelve los pares [i, objetivo - i] con i <= objetivo - i.
     * Basta con llegar hasta objetivo / 2: más allá solo se repetirían los mismos pares invertidos.
     */
    public static int[][] encontrarPares(int objetivo) {
        if (objetivo < 0) {
            return new int[0][];
        }
        int[][] pares = new int[objetivo / 2 + 1][];
        for (int i = 0; i <= objetivo / 2; i++) {
            pares[i] = new int[] { i, objetivo - i };
        }
        return pares;
    }
}
