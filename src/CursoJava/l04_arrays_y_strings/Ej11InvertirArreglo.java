package CursoJava.l04_arrays_y_strings;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Invertir una lista de textos de dos maneras: devolviendo una copia nueva e invirtiendo el mismo arreglo.
 * Concepto: 3. Recorrer un array (escribir en el array requiere el índice) y 5. Arrays de objetos.
 */
public class Ej11InvertirArreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos de la lista: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // consume el salto de línea pendiente
        if (cantidad < 0) {
            System.out.println("La cantidad no puede ser negativa.");
            return;
        }

        String[] lista = new String[cantidad];
        System.out.println("Ingrese los elementos de la lista:");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = scanner.nextLine();
        }

        String[] copiaInvertida = invertirEnCopia(lista);
        System.out.println("Lista invertida (copia nueva): " + Arrays.toString(copiaInvertida));
        System.out.println("Lista original sin cambios: " + Arrays.toString(lista));

        invertirEnLugar(lista);
        System.out.println("Lista invertida (mismo arreglo): " + Arrays.toString(lista));
    }

    /** Devuelve un arreglo nuevo con los elementos en orden inverso; el original no se modifica. */
    public static String[] invertirEnCopia(String[] lista) {
        String[] invertida = new String[lista.length];
        for (int i = 0; i < lista.length; i++) {
            invertida[i] = lista[lista.length - 1 - i];
        }
        return invertida;
    }

    /** Invierte el mismo arreglo intercambiando extremos hacia el centro, sin arreglos auxiliares. */
    public static void invertirEnLugar(String[] lista) {
        for (int i = 0; i < lista.length / 2; i++) {
            String temporal = lista[i];
            lista[i] = lista[lista.length - 1 - i];
            lista[lista.length - 1 - i] = temporal;
        }
    }
}
