package CursoJava.l04_arrays_y_strings;

import java.util.Scanner;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Cargar nombres de hasta 30 caracteres, recortando los que lo superen, y listarlos numerados.
 * Concepto: 10. Recorrer y cortar texto (length() y substring) sobre un array de String.
 */
public class Ej32CargarNombres {

    private static final int CANTIDAD_NOMBRES = 5;
    private static final int LONGITUD_MAXIMA = 30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[CANTIDAD_NOMBRES];

        System.out.println("Ingrese " + CANTIDAD_NOMBRES + " nombres (máximo " + LONGITUD_MAXIMA + " caracteres):");

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            // En String length() es un método; en un array length es un atributo.
            if (nombre.length() > LONGITUD_MAXIMA) {
                System.out.println("El nombre supera los " + LONGITUD_MAXIMA + " caracteres. Se recortará.");
                nombre = nombre.substring(0, LONGITUD_MAXIMA);
            }
            nombres[i] = nombre;
        }

        System.out.println();
        System.out.println("Nombres ingresados:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i]);
        }
    }
}
