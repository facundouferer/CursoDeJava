package CursoJava.l04_arrays_y_strings;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Dada una lista de enteros, obtener los números primos, la sumatoria y el promedio.
 * Concepto: 3. Recorrer un array y 4. Tamaño fijo (recortar el resultado con Arrays.copyOf).
 */
public class Ej07SumaPromedioYPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números enteros: ");
        int cantidad = scanner.nextInt();
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        int[] numeros = new int[cantidad];
        System.out.println("Ingrese los números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números primos: " + Arrays.toString(obtenerPrimos(numeros)));

        int sumatoria = calcularSumatoria(numeros);
        System.out.println("Sumatoria: " + sumatoria);
        System.out.println("Promedio: " + (double) sumatoria / numeros.length);
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int divisor = 2; divisor * divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] obtenerPrimos(int[] numeros) {
        int[] primos = new int[numeros.length];
        int cantidad = 0;
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                primos[cantidad++] = numero;
            }
        }
        // Las casillas sobrantes quedaron en 0: se descartan copiando solo las ocupadas.
        return Arrays.copyOf(primos, cantidad);
    }

    public static int calcularSumatoria(int[] numeros) {
        int sumatoria = 0;
        for (int numero : numeros) {
            sumatoria += numero;
        }
        return sumatoria;
    }
}
