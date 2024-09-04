package CursoJava.ArreglosEstaticos;

import java.util.Scanner;

public class Arreglos10 {

    // Rest of the code...
    /**
     * Ejercicio 10:
     * Escriba un algoritmo que lea un arreglo de n�meros enteros, y un n�mero x, y
     * escriba en la
     * pantalla todos los �ndices de las posiciones del arreglo donde est� x. Por
     * ejemplo, si el arreglo
     * es el que aparece enseguida y x es 2: 1 2 3 100 23 2 2 1 El programa debe
     * escribir: 1 5 6
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el n�mero de elementos en el arreglo
        System.out.println("Ingrese el n�mero de elementos en el arreglo:");
        int n = scanner.nextInt();

        // Crear un arreglo de enteros para almacenar los n�meros
        int[] numeros = new int[n];

        // Leer los n�meros enteros ingresados por el usuario
        System.out.println("Ingrese los n�meros enteros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Solicitar al usuario el n�mero x a buscar en el arreglo
        System.out.println("Ingrese el n�mero x a buscar:");
        int x = scanner.nextInt();

        // Buscar el n�mero x en el arreglo e imprimir sus �ndices
        System.out.println("�ndices donde se encuentra el n�mero x:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] == x) {
                System.out.print(i + " ");
            }
        }
    }
}
