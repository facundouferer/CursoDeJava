package CursoJava.ArreglosEstaticos;

import java.util.Scanner;

public class Arreglos08 {
    /**
     * Ejercicio 8:
     * Dise�e un algoritmo que lea un n�mero cualquiera y lo busque en un arreglo X,
     * el cual tiene
     * almacenado 10 elementos num�ricos. Escriba la posici�n donde se encuentra
     * almacenado el
     * n�mero en el arreglo o el mensaje �NO� si no lo encuentra.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10; // Cantidad de elementos en el arreglo X

        // Crear un arreglo X de tama�o n para almacenar los elementos
        int[] arregloX = new int[n];

        // Solicitar al usuario los elementos del arreglo X
        System.out.println("Ingrese los elementos del arreglo X:");
        // Leer cada elemento del arreglo X
        for (int i = 0; i < n; i++) {
            arregloX[i] = scanner.nextInt();
        }

        // Solicitar al usuario el n�mero a buscar en el arreglo X
        System.out.println("Ingrese el n�mero a buscar:");
        // Leer el n�mero ingresado por el usuario
        int numeroABuscar = scanner.nextInt();

        // Inicializar una variable booleana para verificar si el n�mero se encuentra en
        // el arreglo
        boolean encontrado = false;

        // Recorrer el arreglo X para buscar el n�mero ingresado
        for (int i = 0; i < n; i++) {
            // Verificar si el elemento en la posici�n i es igual al n�mero a buscar
            if (arregloX[i] == numeroABuscar) {
                // Si el n�mero se encuentra, cambiar el valor de la variable encontrado a true
                encontrado = true;
                // Imprimir la posici�n del n�mero encontrado
                System.out.println("El n�mero se encuentra en la posici�n: " + i);
                // Terminar la b�squeda porque ya se encontr� el n�mero
                break;
            }
        }

        // Si no se encuentra el n�mero (la variable encontrado sigue siendo false),
        // imprimir "NO"
        if (!encontrado) {
            System.out.println("NO");
        }
    }
}
