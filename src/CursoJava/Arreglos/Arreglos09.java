package CursoJava.Arreglos;

import java.util.Scanner;

public class Arreglos09 {
    /**Ejercicio 9:
     Escriba un algoritmo que efectúe la normalización de una colección de números reales (float).
     Para llevar a cabo esta normalización, se debe en primer lugar encontrar el número mayor de la
     colección; luego se divide cada número por dicho valor máximo, de forma que los valores
     resultantes (normalizados) estén comprendidos en el intervalo del 0 al 1.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de elementos en la colección
        System.out.println("Ingrese el número de elementos en la colección:");
        int n = scanner.nextInt();

        // Crear un arreglo de tipo float para almacenar los números reales
        float[] numeros = new float[n];

        // Leer los números reales ingresados por el usuario
        System.out.println("Ingrese los números reales:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextFloat();
        }

        // Encontrar el número mayor en la colección
        float maximo = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        // Normalizar la colección de números reales dividiendo cada número por el valor máximo
        for (int i = 0; i < n; i++) {
            numeros[i] = numeros[i] / maximo;
        }

        // Imprimir los números normalizados
        System.out.println("Números normalizados:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", numeros[i]); // Imprimir con 2 decimales
        }
    }
}
