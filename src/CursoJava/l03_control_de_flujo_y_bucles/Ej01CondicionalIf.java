package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: informar si el número ingresado es igual a 0 usando un condicional simple.
 * Concepto: 1. Condicionales: if.
 */
public class Ej01CondicionalIf {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = entrada.nextInt();

        if (numero == 0) {
            System.out.println("Ingresó un número igual a 0.");
        }
        entrada.close();
    }
}
