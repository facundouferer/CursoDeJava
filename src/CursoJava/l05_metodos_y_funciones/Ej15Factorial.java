package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Calcular el factorial de un número de forma recursiva.
 * Concepto: 5. Introducción a la recursión (caso base y caso recursivo).
 */
public class Ej15Factorial {

    public static int factorial(int n) {
        if (n <= 1) { // caso base
            return 1;
        }
        return n * factorial(n - 1); // caso recursivo
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("El factorial de " + n + " es: " + factorial(n));
    }
}
