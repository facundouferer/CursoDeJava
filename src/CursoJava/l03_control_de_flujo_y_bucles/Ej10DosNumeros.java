package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: calcular la suma del doble del primer número más el cuadrado del segundo, y el promedio de sus cubos.
 * Concepto: 1. Condicionales (cálculo previo a las decisiones).
 */
public class Ej10DosNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double primero = entrada.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double segundo = entrada.nextDouble();

        double suma = (2 * primero) + (segundo * segundo);
        System.out.println("La suma del doble del primer número más el cuadrado del segundo número es: " + suma);

        double promedioCubos = (Math.pow(primero, 3) + Math.pow(segundo, 3)) / 2;
        System.out.println("El promedio de los cubos de los dos números es: " + promedioCubos);
        entrada.close();
    }
}
