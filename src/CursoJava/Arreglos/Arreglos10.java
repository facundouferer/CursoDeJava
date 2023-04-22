package CursoJava.Arreglos;

import java.util.Scanner;

public class Arreglos10 {
    /**Ejercicio 10:
     Escriba un algoritmo que lea un arreglo de números enteros, y un número x, y escriba en la
     pantalla todos los índices de las posiciones del arreglo donde está x. Por ejemplo, si el arreglo
     es el que aparece enseguida y x es 2: 1 2 3 100 23 2 2 1 El programa debe escribir: 1 5 6*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de elementos en el arreglo
        System.out.println("Ingrese el número de elementos en el arreglo:");
        int n = scanner.nextInt();

        // Crear un arreglo de enteros para almacenar los números
        int[] numeros = new int[n];

        // Leer los números enteros ingresados por el usuario
        System.out.println("Ingrese los números enteros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Solicitar al usuario el número x a buscar en el arreglo
        System.out.println("Ingrese el número x a buscar:");
        int x = scanner.nextInt();

        // Buscar el número x en el arreglo e imprimir sus índices
        System.out.println("Índices donde se encuentra el número x:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] == x) {
                System.out.print(i + " ");
            }
        }
    }
}
