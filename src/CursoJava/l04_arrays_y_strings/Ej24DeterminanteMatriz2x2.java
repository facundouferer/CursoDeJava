package CursoJava.l04_arrays_y_strings;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Calcular el determinante de una matriz de 2 por 2.
 * Concepto: 6. Matrices y arrays irregulares (acceso directo por [fila][columna]).
 */
public class Ej24DeterminanteMatriz2x2 {

    public static void main(String[] args) {
        int[][] matriz = {
                { 4, 3 },
                { 2, 1 }
        };

        System.out.println("El determinante de la matriz 2x2 es: " + calcularDeterminante(matriz));
    }

    public static int calcularDeterminante(int[][] matriz) {
        return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
    }
}
