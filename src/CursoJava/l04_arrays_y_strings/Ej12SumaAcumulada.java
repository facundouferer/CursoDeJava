package CursoJava.l04_arrays_y_strings;

import java.util.Arrays;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Generar un arreglo donde cada posición contiene la suma de los elementos desde el inicio hasta ella.
 * Concepto: 3. Recorrer un array (acumulador que se escribe por índice).
 */
public class Ej12SumaAcumulada {

    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4 };

        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        System.out.println("Suma acumulada: " + Arrays.toString(calcularSumaAcumulada(numeros)));
    }

    public static int[] calcularSumaAcumulada(int[] numeros) {
        int[] acumulada = new int[numeros.length];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            acumulada[i] = suma;
        }
        return acumulada;
    }
}
