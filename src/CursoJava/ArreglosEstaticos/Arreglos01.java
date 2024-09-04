package CursoJava.ArreglosEstaticos;

import java.util.Scanner;

public class Arreglos01 {
    /**
     * Ejercicio 1:
     * Escriba un programa que solicite al usuario un valor entero para establecer
     * el tama�o de un
     * arreglo de n�meros enteros. Luego utilice ese valor para crear el arreglo y
     * posteriormente
     * solicitar al usuario que ingrese cada uno de los valores para completar el
     * arreglo.
     * Finalmente, imprima por pantalla la lista de valores ingresados por el
     * usuario en:
     * a) El mismo orden en que fueron leídos por el teclado.
     * b) En orden inverso al que fueron cargados.
     * c) Una lista de todos los números pares.
     * d) Un lista de todos los valores que se encuentran ubicados en posiciones
     * impares en el
     * arreglo.
     **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tama�o del arreglo
        System.out.println("Por favor, ingrese el tama�o del arreglo:");
        int n = scanner.nextInt();

        // Crear el arreglo y solicitar los valores al usuario
        int[] arreglo = new int[n];
        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        // a) Imprimir los valores en el mismo orden en que fueron ingresados
        System.out.println("Los valores ingresados son:");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();

        // b) Imprimir los valores en orden inverso al que fueron cargados
        System.out.println("Los valores en orden inverso son:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();

        // c) Imprimir todos los n�meros pares
        System.out.println("Los n�meros pares son:");
        for (int valor : arreglo) {
            if (valor % 2 == 0) {
                System.out.print(valor + " ");
            }
        }
        System.out.println();

        // d) Imprimir los valores en posiciones impares del arreglo
        System.out.println("Los valores en posiciones impares son:");
        for (int i = 1; i < n; i += 2) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
