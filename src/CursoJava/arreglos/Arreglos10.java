package CursoJava.arreglos;

import java.util.Scanner;

public class Arreglos10 {
    /**Ejercicio 10:
     Escriba un algoritmo que lea un arreglo de números enteros, y un número x, y escriba en la
     pantalla todos los índices de las posiciones del arreglo donde está x. Por ejemplo, si el arreglo
     es el que aparece enseguida y x es 2: 1 2 3 100 23 2 2 1 El programa debe escribir: 1 5 6*/

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

        // Solicitar al usuario el número x
        System.out.println("Ingrese el número x:");
        int x = scanner.nextInt();

        // Encontrar y mostrar los índices de las posiciones del arreglo donde está x
        System.out.println("Índices de las posiciones donde está x:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] == x) {
                System.out.print(i + " ");
            }
        }
    }
}
