package CursoJava.l04_arrays_y_strings;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Cargar dos arreglos A y B y obtener C con la suma posición a posición y D con el producto de A por B invertido.
 * Concepto: 3. Recorrer un array (dos índices sobre arreglos distintos, uno de ellos hacia atrás).
 */
public class Ej10OperacionesEntreArreglos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos de cada arreglo: ");
        int cantidad = scanner.nextInt();
        if (cantidad < 0) {
            System.out.println("La cantidad no puede ser negativa.");
            return;
        }

        int[] a = leerArreglo(scanner, "A", cantidad);
        int[] b = leerArreglo(scanner, "B", cantidad);

        System.out.println("Suma de A y B posición a posición: " + Arrays.toString(sumar(a, b)));
        System.out.println("Producto de A por B en orden inverso: " + Arrays.toString(multiplicarConInverso(a, b)));
    }

    private static int[] leerArreglo(Scanner scanner, String nombre, int cantidad) {
        int[] arreglo = new int[cantidad];
        System.out.println("Ingrese los elementos del arreglo " + nombre + ":");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = scanner.nextInt();
        }
        return arreglo;
    }

    /** C[i] = A[i] + B[i]. Ambos arreglos deben tener la misma longitud. */
    public static int[] sumar(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }

    /** C[i] = A[i] * B[length - 1 - i]: el primero de A con el último de B, y así sucesivamente. */
    public static int[] multiplicarConInverso(int[] a, int[] b) {
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[b.length - 1 - i];
        }
        return c;
    }
}
