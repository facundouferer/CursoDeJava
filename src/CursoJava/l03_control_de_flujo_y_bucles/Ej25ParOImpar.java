package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: informar si un número entero distinto de 0 es par o impar.
 * Concepto: 1. Condicionales: if anidado.
 */
public class Ej25ParOImpar {

    public static void main(String[] args) {
        int numero = 5;

        if (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par");
            } else {
                System.out.println("El número " + numero + " es impar");
            }
        } else {
            System.out.println("El número no puede ser 0");
        }
    }
}
