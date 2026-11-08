package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: mostrar la tabla de multiplicar de un número entre 1 y 9, hasta su multiplicación por 9.
 * Concepto: 3. Bucles e iteración: for.
 */
public class Ej33TablaDeNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 9:");
        int numero = entrada.nextInt();

        if (numero > 0 && numero < 10) {
            for (int i = 1; i < 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        } else {
            System.out.println("El número debe estar entre 1 y 9");
        }
        entrada.close();
    }
}
