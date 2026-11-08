package CursoJava.l04_arrays_y_strings;

import java.util.Arrays;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Rotar los elementos de un arreglo hacia la derecha una cantidad dada de posiciones.
 * Concepto: 4. El tamaño es fijo: la rotación produce un bloque nuevo con los elementos reubicados.
 */
public class Ej16RotarArreglo {

    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7 };
        int posiciones = 2;

        System.out.println("Arreglo original: " + Arrays.toString(numeros));
        System.out.println("Arreglo rotado " + posiciones + " veces: " + Arrays.toString(rotar(numeros, posiciones)));
    }

    /** Rota hacia la derecha; el módulo evita índices fuera de rango cuando posiciones supera la longitud. */
    public static int[] rotar(int[] numeros, int posiciones) {
        int[] rotado = new int[numeros.length];
        if (numeros.length == 0) {
            return rotado;
        }
        int desplazamiento = ((posiciones % numeros.length) + numeros.length) % numeros.length;
        for (int i = 0; i < numeros.length; i++) {
            rotado[(i + desplazamiento) % numeros.length] = numeros[i];
        }
        return rotado;
    }
}
