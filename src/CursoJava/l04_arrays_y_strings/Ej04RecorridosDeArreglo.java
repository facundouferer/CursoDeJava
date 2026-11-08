package CursoJava.l04_arrays_y_strings;

import java.util.Scanner;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Cargar un arreglo y mostrarlo en orden, en orden inverso, solo los pares y solo las posiciones impares.
 * Concepto: 3. Recorrer un array (hacia adelante, hacia atrás y con paso 2).
 */
public class Ej04RecorridosDeArreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de valores: ");
        int cantidad = scanner.nextInt();
        if (cantidad < 0) {
            System.out.println("La cantidad no puede ser negativa.");
            return;
        }

        int[] valores = new int[cantidad];
        System.out.println("Ingrese los valores:");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextInt();
        }

        // a) Mismo orden en que fueron ingresados.
        System.out.println("Los valores ingresados son:");
        for (int valor : valores) {
            System.out.print(valor + " ");
        }
        System.out.println();

        // b) Orden inverso: se recorre hacia atrás desde length - 1.
        System.out.println("Los valores en orden inverso son:");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();

        // c) Solo los valores pares.
        System.out.println("Los números pares son:");
        for (int valor : valores) {
            if (valor % 2 == 0) {
                System.out.print(valor + " ");
            }
        }
        System.out.println();

        // d) Solo los valores que están en posiciones impares (1, 3, 5...).
        System.out.println("Los valores en posiciones impares son:");
        for (int i = 1; i < valores.length; i += 2) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();
    }
}
