package CursoJava.l04_arrays_y_strings;

import java.util.Scanner;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Cargar palabras en un arreglo y mostrarlas ordenadas alfabéticamente.
 * Concepto: 7. java.util.Arrays (el orden se resuelve a mano con compareTo; Arrays.sort hace lo mismo) y 5. Arrays de objetos.
 */
public class Ej30OrdenAlfabetico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de palabras: ");
        int cantidad = scanner.nextInt();
        if (cantidad < 0) {
            System.out.println("La cantidad no puede ser negativa.");
            return;
        }

        String[] palabras = new String[cantidad];
        System.out.println("Ingrese las palabras:");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = scanner.next();
        }

        ordenar(palabras);

        System.out.println("Palabras ordenadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    /** Ordenamiento por selección: en cada pasada se ubica el menor de lo que falta ordenar. */
    public static void ordenar(String[] palabras) {
        for (int i = 0; i < palabras.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < palabras.length; j++) {
                // compareTo compara el contenido; == compararía referencias.
                if (palabras[j].compareTo(palabras[indiceMinimo]) < 0) {
                    indiceMinimo = j;
                }
            }
            String temporal = palabras[indiceMinimo];
            palabras[indiceMinimo] = palabras[i];
            palabras[i] = temporal;
        }
    }
}
