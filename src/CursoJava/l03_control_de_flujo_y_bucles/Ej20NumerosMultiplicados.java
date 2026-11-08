package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: operar dos números: si son iguales se multiplican, si el primero es mayor se restan y si no se suman.
 * Concepto: 1. Condicionales: if, else if, else.
 */
public class Ej20NumerosMultiplicados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        int primero = entrada.nextInt();
        System.out.println("Ingrese el segundo número:");
        int segundo = entrada.nextInt();

        int resultado;
        if (primero == segundo) {
            resultado = primero * segundo;
        } else if (primero > segundo) {
            resultado = primero - segundo;
        } else {
            resultado = primero + segundo;
        }

        System.out.println("El resultado es: " + resultado);
        entrada.close();
    }
}
