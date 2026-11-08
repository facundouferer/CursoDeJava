package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Sumar dos, tres o cuatro enteros usando varias versiones del método sumar.
 * Concepto: 3. Sobrecarga de métodos (mismo nombre, distinta cantidad de parámetros).
 */
public class Ej12SobrecargaDeMetodos {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static int sumar(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        System.out.println("Suma de 2 números: " + sumar(1, 2));
        System.out.println("Suma de 3 números: " + sumar(1, 2, 3));
        System.out.println("Suma de 4 números: " + sumar(1, 2, 3, 4));
    }
}
