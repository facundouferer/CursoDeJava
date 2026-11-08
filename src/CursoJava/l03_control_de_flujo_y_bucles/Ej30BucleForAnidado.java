package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: mostrar todas las sumas posibles entre los números de 0 hasta el número ingresado.
 * Concepto: 3. Bucles e iteración: for (bucles anidados).
 */
public class Ej30BucleForAnidado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = entrada.nextInt();

        for (int i = 0; i <= numero; i++) {
            for (int j = 0; j <= numero; j++) {
                System.out.println(i + " + " + j + " = " + (i + j));
            }
        }
        entrada.close();
    }
}
