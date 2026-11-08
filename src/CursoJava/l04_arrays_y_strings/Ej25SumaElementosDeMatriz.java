package CursoJava.l04_arrays_y_strings;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Sumar todos los elementos de una matriz y, por separado, solo los elementos pares.
 * Concepto: 6. Matrices y arrays irregulares (for-each anidado cuando no se necesitan los índices).
 */
public class Ej25SumaElementosDeMatriz {

    public static void main(String[] args) {
        int[][] matriz = {
                { 2, 3, 4 },
                { 5, 6, 7 },
                { 8, 9, 10 }
        };

        System.out.println("Matriz original:");
        imprimirMatriz(matriz);
        System.out.println("La suma de todos los elementos de la matriz es: " + sumarTodos(matriz));
        System.out.println("La suma de los elementos pares de la matriz es: " + sumarPares(matriz));
    }

    public static int sumarTodos(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        return suma;
    }

    public static int sumarPares(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 == 0) {
                    suma += valor;
                }
            }
        }
        return suma;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
