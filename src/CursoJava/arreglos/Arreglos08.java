package CursoJava.arreglos;

import java.util.Scanner;

public class Arreglos08 {
    /**Ejercicio 8:
     Diseñe un algoritmo que lea un número cualquiera y lo busque en un arreglo X, el cual tiene
     almacenado 10 elementos numéricos. Escriba la posición donde se encuentra almacenado el
     número en el arreglo o el mensaje “NO” si no lo encuentra.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;

        // Crear un arreglo X de 10 elementos numéricos
        int[] arregloX = new int[n];

        // Solicitar al usuario los elementos del arreglo X
        System.out.println("Ingrese los elementos del arreglo X:");
        for (int i = 0; i < n; i++) {
            arregloX[i] = scanner.nextInt();
        }

        // Solicitar al usuario el número a buscar
        System.out.println("Ingrese el número a buscar:");
        int numeroBuscado = scanner.nextInt();

        // Buscar el número en el arreglo X
        int posicion = -1;
        for (int i = 0; i < n; i++) {
            if (arregloX[i] == numeroBuscado) {
                posicion = i;
                break;
            }
        }

        // Imprimir la posición donde se encuentra almacenado el número en el arreglo
        // o el mensaje "NO" si no se encuentra
        if (posicion == -1) {
            System.out.println("NO");
        } else {
            System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + posicion + " del arreglo.");
        }
    }
}
