package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: determinar si un número es primo y mostrar todos los primos comprendidos entre dos números.
 * Concepto: 3. Bucles e iteración: for; 4. Control de bucles: break.
 */
public class Ej38NumerosPrimos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número para verificar si es primo:");
        int numero = entrada.nextInt();
        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        System.out.println("Ingrese el primer número del rango:");
        int inicio = entrada.nextInt();
        System.out.println("Ingrese el segundo número del rango:");
        int fin = entrada.nextInt();

        System.out.print("Números primos entre " + inicio + " y " + fin + ": ");
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        entrada.close();
    }

    private static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        boolean primo = true;
        for (int divisor = 2; divisor * divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                primo = false;
                break; // alcanza con encontrar un divisor para descartarlo
            }
        }
        return primo;
    }
}
