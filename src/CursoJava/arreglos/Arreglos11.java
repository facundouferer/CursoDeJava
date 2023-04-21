package CursoJava.arreglos;

import java.util.Scanner;

public class Arreglos11 {
    /**Ejercicio 11:
     Un arreglo de números se llama partidario si todo número que está en una casilla par (0,2,4,…)
     es mayor que cualquiera de los números que están en las casillas impares (1,3,5,…). Escriba
     un algoritmo que lea un arreglo de números enteros y luego, diga si es partidario o no. Por
     ejemplo, si el arreglo es el siguiente: 100 5 200 1 1000 0 600 50 300 4 El programa debe
     escribir: es partidario*/

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

        // Verificar si el arreglo es partidario
        boolean esPartidario = true;
        for (int i = 0; i < n - 1; i += 2) {
            for (int j = 1; j < n; j += 2) {
                if (numeros[i] <= numeros[j]) {
                    esPartidario = false;
                    break;
                }
            }
            if (!esPartidario) {
                break;
            }
        }

        // Imprimir si el arreglo es partidario o no
        if (esPartidario) {
            System.out.println("Es partidario");
        } else {
            System.out.println("No es partidario");
        }
    }
}
