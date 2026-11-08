package CursoJava.l04_arrays_y_strings;

import java.util.Arrays;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Concatenar dos arreglos en uno nuevo que contiene primero los elementos del primero y luego los del segundo.
 * Concepto: 4. El tamaño es fijo: se crea un bloque nuevo y se copia con System.arraycopy.
 */
public class Ej15ConcatenarArreglos {

    public static void main(String[] args) {
        int[] primero = { 1, 2, 3 };
        int[] segundo = { 4, 5, 6 };

        System.out.println("Arreglo concatenado: " + Arrays.toString(concatenar(primero, segundo)));
    }

    public static int[] concatenar(int[] primero, int[] segundo) {
        int[] resultado = new int[primero.length + segundo.length];
        //               origen, desde, destino, hacia, cuántos
        System.arraycopy(primero, 0, resultado, 0, primero.length);
        System.arraycopy(segundo, 0, resultado, primero.length, segundo.length);
        return resultado;
    }
}
