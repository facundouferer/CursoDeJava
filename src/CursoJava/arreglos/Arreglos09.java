package CursoJava.arreglos;

import java.util.Scanner;

public class Arreglos09 {
    /**Ejercicio 9:
     Escriba un algoritmo que efectúe la normalización de una colección de números reales (float).
     Para llevar a cabo esta normalización, se debe en primer lugar encontrar el número mayor de la
     colección; luego se divide cada número por dicho valor máximo, de forma que los valores
     resultantes (normalizados) estén comprendidos en el intervalo del 0 al 1.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Solicitar al usuario la cantidad de números a ingresar
        System.out.println("Ingrese la cantidad de números reales:");
        n = scanner.nextInt();

        // Crear un arreglo para almacenar los números reales
        float[] numeros = new float[n];

        // Solicitar al usuario los números reales
        System.out.println("Ingrese los números reales:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextFloat();
        }

        // Encontrar el número mayor en la colección de números
        float maximo = numeros[0];
        for (int i = 1; i < n; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        // Normalizar los números reales dividiendo cada uno por el valor máximo
        for (int i = 0; i < n; i++) {
            numeros[i] /= maximo;
        }

        // Imprimir los números normalizados
        System.out.println("Números normalizados:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f", numeros[i]);
            System.out.print(" ");
        }
    }
}
