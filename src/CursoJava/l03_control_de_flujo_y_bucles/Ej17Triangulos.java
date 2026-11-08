package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: clasificar un triángulo como equilátero, isósceles o escaleno según sus lados.
 * Concepto: 1. Condicionales: if, else if, else.
 */
public class Ej17Triangulos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer lado del triángulo:");
        int lado1 = entrada.nextInt();
        System.out.println("Ingrese el segundo lado del triángulo:");
        int lado2 = entrada.nextInt();
        System.out.println("Ingrese el tercer lado del triángulo:");
        int lado3 = entrada.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }
        entrada.close();
    }
}
