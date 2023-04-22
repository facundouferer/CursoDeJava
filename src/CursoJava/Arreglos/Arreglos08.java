package CursoJava.Arreglos;

import java.util.Scanner;

public class Arreglos08 {
    /**Ejercicio 8:
     Diseñe un algoritmo que lea un número cualquiera y lo busque en un arreglo X, el cual tiene
     almacenado 10 elementos numéricos. Escriba la posición donde se encuentra almacenado el
     número en el arreglo o el mensaje “NO” si no lo encuentra.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10; // Cantidad de elementos en el arreglo X

        // Crear un arreglo X de tamaño n para almacenar los elementos
        int[] arregloX = new int[n];

        // Solicitar al usuario los elementos del arreglo X
        System.out.println("Ingrese los elementos del arreglo X:");
        // Leer cada elemento del arreglo X
        for (int i = 0; i < n; i++) {
            arregloX[i] = scanner.nextInt();
        }

        // Solicitar al usuario el número a buscar en el arreglo X
        System.out.println("Ingrese el número a buscar:");
        // Leer el número ingresado por el usuario
        int numeroABuscar = scanner.nextInt();

        // Inicializar una variable booleana para verificar si el número se encuentra en el arreglo
        boolean encontrado = false;

        // Recorrer el arreglo X para buscar el número ingresado
        for (int i = 0; i < n; i++) {
            // Verificar si el elemento en la posición i es igual al número a buscar
            if (arregloX[i] == numeroABuscar) {
                // Si el número se encuentra, cambiar el valor de la variable encontrado a true
                encontrado = true;
                // Imprimir la posición del número encontrado
                System.out.println("El número se encuentra en la posición: " + i);
                // Terminar la búsqueda porque ya se encontró el número
                break;
            }
        }

        // Si no se encuentra el número (la variable encontrado sigue siendo false), imprimir "NO"
        if (!encontrado) {
            System.out.println("NO");
        }
    }
}
