package CursoJava.ArreglosEstaticos;

import java.util.Scanner;

public class Arreglos06 {
    /**
     * Ejercicio 6:
     * Escriba un programa que permita cargar 2 arreglos A y B de 10 elementos cada
     * uno, sumar el
     * elemento en la posici�n 1 del arreglo A con el elemento en la misma posici�n
     * del arreglo B y
     * as� sucesivamente. Almacenar el resultado en un arreglo C e imprima el
     * resultado final.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10; // Cantidad de elementos en cada arreglo
        int[] arregloA = new int[n];
        int[] arregloB = new int[n];
        int[] arregloC = new int[n];

        // Solicitar al usuario los elementos del arreglo A
        System.out.println("Ingrese los elementos del arreglo A:");
        for (int i = 0; i < n; i++) {
            arregloA[i] = scanner.nextInt();
        }

        // Solicitar al usuario los elementos del arreglo B
        System.out.println("Ingrese los elementos del arreglo B:");
        for (int i = 0; i < n; i++) {
            arregloB[i] = scanner.nextInt();
        }

        // Sumar los elementos de los arreglos A y B y almacenar el resultado en el
        // arreglo C
        for (int i = 0; i < n; i++) {
            arregloC[i] = arregloA[i] + arregloB[i];
        }

        // Imprimir el resultado final
        System.out.println("Resultado de la suma de los elementos de A y B:");
        for (int valor : arregloC) {
            System.out.println(valor);
        }
    }

}
