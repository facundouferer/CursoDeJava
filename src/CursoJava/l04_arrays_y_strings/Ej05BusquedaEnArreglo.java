package CursoJava.l04_arrays_y_strings;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Buscar un número en un arreglo e informar su primera posición y todas las posiciones donde aparece.
 * Concepto: 3. Recorrer un array (búsqueda lineal con índice).
 */
public class Ej05BusquedaEnArreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de valores: ");
        int cantidad = scanner.nextInt();
        if (cantidad < 0) {
            System.out.println("La cantidad no puede ser negativa.");
            return;
        }

        int[] numeros = new int[cantidad];
        System.out.println("Ingrese los valores:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el número a buscar: ");
        int buscado = scanner.nextInt();

        int primera = buscarPrimera(numeros, buscado);
        if (primera == -1) {
            System.out.println("NO");
        } else {
            System.out.println("El número se encuentra por primera vez en la posición: " + primera);
            System.out.println("Posiciones donde aparece: " + Arrays.toString(buscarTodas(numeros, buscado)));
        }
    }

    /** Devuelve el índice de la primera aparición de buscado, o -1 si no está. */
    public static int buscarPrimera(int[] numeros, int buscado) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                return i;
            }
        }
        return -1;
    }

    /** Devuelve todos los índices donde aparece buscado (arreglo vacío si no está). */
    public static int[] buscarTodas(int[] numeros, int buscado) {
        int[] posiciones = new int[numeros.length];
        int cantidad = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                posiciones[cantidad++] = i;
            }
        }
        // El arreglo es de tamaño fijo: se recorta con copyOf a las posiciones realmente halladas.
        return Arrays.copyOf(posiciones, cantidad);
    }
}
