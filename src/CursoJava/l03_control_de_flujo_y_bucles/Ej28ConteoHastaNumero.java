package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: mostrar todos los números desde 0 hasta el número ingresado.
 * Concepto: 3. Bucles e iteración: for.
 */
public class Ej28ConteoHastaNumero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = entrada.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
        entrada.close();
    }
}
