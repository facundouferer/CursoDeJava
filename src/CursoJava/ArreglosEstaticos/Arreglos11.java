package CursoJava.ArreglosEstaticos;

import java.util.Scanner;

public class Arreglos11 {
    /**
     * Ejercicio 11:
     * Un arreglo de n�meros se llama partidario si todo n�mero que est� en una
     * casilla par (0,2,4,�)
     * es mayor que cualquiera de los n�meros que est�n en las casillas impares
     * (1,3,5,�). Escriba
     * un algoritmo que lea un arreglo de n�meros enteros y luego, diga si es
     * partidario o no. Por
     * ejemplo, si el arreglo es el siguiente: 100 5 200 1 1000 0 600 50 300 4 El
     * programa debe
     * escribir: es partidario
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

        // Verificar si el arreglo es partidario
        boolean esPartidario = true;
        for (int i = 0; i < n - 1; i += 2) {
            if (numeros[i] <= numeros[i + 1]) {
                esPartidario = false;
                break;
            }
        }

        // Imprimir el resultado
        if (esPartidario) {
            System.out.println("El arreglo es partidario.");
        } else {
            System.out.println("El arreglo no es partidario.");
        }
    }
}
