package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: combinar tres dígitos en un único número (por ejemplo 5, 6 y 2 forman 562).
 * Concepto: 1. Condicionales (cálculo previo a las decisiones).
 */
public class Ej11TresDigitos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer dígito:");
        int centenas = entrada.nextInt();
        System.out.println("Ingrese el segundo dígito:");
        int decenas = entrada.nextInt();
        System.out.println("Ingrese el tercer dígito:");
        int unidades = entrada.nextInt();

        int numero = centenas * 100 + decenas * 10 + unidades;
        System.out.println("El número formado es: " + numero);
        entrada.close();
    }
}
