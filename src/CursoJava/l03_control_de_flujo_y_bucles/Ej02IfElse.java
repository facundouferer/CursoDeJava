package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: informar si el número ingresado es igual o distinto de 0 usando if / else.
 * Concepto: 1. Condicionales: if, else.
 */
public class Ej02IfElse {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = entrada.nextInt();

        if (numero == 0) {
            System.out.println("Ingresó un número igual a 0.");
        } else {
            System.out.println("Ingresó un número distinto de 0.");
        }
        entrada.close();
    }
}
