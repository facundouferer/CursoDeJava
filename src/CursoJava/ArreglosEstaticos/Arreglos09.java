package CursoJava.ArreglosEstaticos;

import java.util.Scanner;

public class Arreglos09 {
    /**
     * Ejercicio 9:
     * Escriba un algoritmo que efect�e la normalizaci�n de una colecci�n de n�meros
     * reales (float).
     * Para llevar a cabo esta normalizaci�n, se debe en primer lugar encontrar el
     * n�mero mayor de la
     * colecci�n; luego se divide cada n�mero por dicho valor m�ximo, de forma que
     * los valores
     * resultantes (normalizados) est�n comprendidos en el intervalo del 0 al 1.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el n�mero de elementos en la colecci�n
        System.out.println("Ingrese el n�mero de elementos en la colecci�n:");
        int n = scanner.nextInt();

        // Crear un arreglo de tipo float para almacenar los n�meros reales
        float[] numeros = new float[n];

        // Leer los n�meros reales ingresados por el usuario
        System.out.println("Ingrese los n�meros reales:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextFloat();
        }

        // Encontrar el n�mero mayor en la colecci�n
        float maximo = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        // Normalizar la colecci�n de n�meros reales dividiendo cada n�mero por el valor
        // m�ximo
        for (int i = 0; i < n; i++) {
            numeros[i] = numeros[i] / maximo;
        }

        // Imprimir los n�meros normalizados
        System.out.println("N�meros normalizados:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", numeros[i]); // Imprimir con 2 decimales
        }
    }
}
