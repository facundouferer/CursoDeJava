package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Multiplicar dos enteros mediante sumas sucesivas, de forma recursiva.
 * Concepto: 5. Introducción a la recursión (recursión lineal sobre uno de los parámetros).
 */
public class Ej18MultiplicacionRecursiva {

    // a * b equivale a sumar "a" un total de "b" veces (b >= 0).
    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + multiplicar(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(a + " * " + b + " = " + multiplicar(a, b));
    }
}
