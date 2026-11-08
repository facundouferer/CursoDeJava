package CursoJava.l04_arrays_y_strings;

import java.util.Scanner;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Normalizar una colección de reales dividiendo cada valor por el máximo, para llevarlos al intervalo 0 a 1.
 * Concepto: 3. Recorrer un array (escribir en el array requiere el índice).
 */
public class Ej08NormalizarArreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int cantidad = scanner.nextInt();
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        float[] numeros = new float[cantidad];
        System.out.println("Ingrese los números reales:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextFloat();
        }

        float maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }

        if (maximo <= 0) {
            System.out.println("No se puede normalizar: el valor máximo debe ser mayor que cero.");
            return;
        }

        // Se modifica el array, por eso se usa el índice y no un for-each.
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] / maximo;
        }

        System.out.println("Números normalizados:");
        for (float numero : numeros) {
            System.out.printf("%.2f ", numero);
        }
        System.out.println();
    }
}
