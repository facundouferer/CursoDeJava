package CursoJava.ArreglosEstaticos;

import java.util.Scanner;

public class Arreglos02 {
    /**
     * Ejercicio 2:
     * Escribir un programa que dada una lista de n�meros enteros, escribir una
     * funci�n que:
     * a) Devuelva una lista con todos los que sean primos.
     * b) Devuelva la sumatoria de los valores
     * c) Devuelva el promedio de los valores.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Solicitar al usuario la cantidad de números a ingresar
        System.out.println("Ingrese la cantidad de números enteros:");
        n = scanner.nextInt();

        // Crear un arreglo para almacenar los números enteros
        int[] numeros = new int[n];

        // Solicitar al usuario los números enteros
        System.out.println("Ingrese los números enteros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        // a) Devolver una lista con todos los números primos
        int[] primos = numerosPrimos(numeros);
        System.out.print("Números primos: ");
        for (int primo : primos) {
            if (primo != 0) {
                System.out.print(primo + " ");
            }
        }
        System.out.println();

        // b) Devolver la sumatoria de los valores
        int sumatoria = sumatoria(numeros);
        System.out.println("Sumatoria: " + sumatoria);

        // c) Devolver el promedio de los valores
        double promedio = (double) sumatoria / n;
        System.out.println("Promedio: " + promedio);
    }

    // Función para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función para obtener un arreglo con los números primos
    public static int[] numerosPrimos(int[] numeros) {
        int[] primos = new int[numeros.length];
        int index = 0;
        for (int numero : numeros) {
            if (esPrimo(numero)) {
                primos[index++] = numero;
            }
        }
        return primos;
    }

    // Función para calcular la sumatoria de los valores de un arreglo
    public static int sumatoria(int[] numeros) {
        int sumatoria = 0;
        for (int numero : numeros) {
            sumatoria += numero;
        }
        return sumatoria;
    }
}
