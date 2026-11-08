package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Mostrar las operaciones básicas entre dos números y la tabla de multiplicar de un entero.
 * Concepto: 1. Declaración y sintaxis de un método (método void con parámetros).
 */
public class Ej03OperacionesYTabla {

    public static void main(String[] args) {
        operacionesBasicas(6, 3);
        tablaMultiplicar(5);
    }

    public static void operacionesBasicas(int primero, int segundo) {
        int suma = primero + segundo;
        int resta = primero - segundo;
        int multiplicacion = primero * segundo;
        double division = (double) primero / segundo;

        System.out.println("Suma: " + primero + " + " + segundo + " = " + suma);
        System.out.println("Resta: " + primero + " - " + segundo + " = " + resta);
        System.out.println("Multiplicación: " + primero + " * " + segundo + " = " + multiplicacion);
        System.out.println("División: " + primero + " / " + segundo + " = " + division);
    }

    public static void tablaMultiplicar(int n) {
        System.out.println("Tabla de multiplicar del " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
