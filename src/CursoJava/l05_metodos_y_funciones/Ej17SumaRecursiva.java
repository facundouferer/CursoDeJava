package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Sumar los enteros desde 1 hasta n de forma recursiva.
 * Concepto: 5. Introducción a la recursión (recursión lineal).
 */
public class Ej17SumaRecursiva {

    public static int suma(int n) {
        if (n == 1) {
            return 1;
        }
        return n + suma(n - 1);
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("La suma de los números del 1 al " + n + " es: " + suma(n));
    }
}
