package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Obtener un término de la sucesión de Fibonacci mediante recursión múltiple.
 * Concepto: 5. Introducción a la recursión (formas de recursión).
 */
public class Ej16Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) { // casos base: fibonacci(0) = 0 y fibonacci(1) = 1
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("El Fibonacci en la posición " + n + " es: " + fibonacci(n));
    }
}
