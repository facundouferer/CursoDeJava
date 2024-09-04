package CursoJava.ArreglosEstaticos;

import java.util.Scanner;

public class Arreglos07 {
    /**
     * Ejercicio 7:
     * Dise�e un algoritmo que lea dos arreglos A y B de 20 elementos cada uno y
     * multiplique el
     * primer elemento de A con el �ltimo elemento de B y luego el segundo elemento
     * de A por el
     * d�cimo noveno elemento de B y as� sucesivamente hasta llegar al veinteavo
     * elemento de A por
     * el primer elemento de B. Almancer el resultado de las multiplicaciones en un
     * arreglo C.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 20; // Cantidad de elementos en cada arreglo
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

        // Multiplicar los elementos de los arreglos A y B de manera inversa y almacenar
        // el resultado en el arreglo C
        for (int i = 0; i < n; i++) {
            arregloC[i] = arregloA[i] * arregloB[n - 1 - i];
        }

        // Imprimir el resultado de las multiplicaciones
        System.out.println("Resultado de las multiplicaciones de los elementos de A y B:");
        for (int valor : arregloC) {
            System.out.println(valor);
        }
    }
}
