package CursoJava.l04_arrays_y_strings;

import java.util.Arrays;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Intercalar los elementos de dos arreglos, conservando al final los sobrantes del más largo.
 * Concepto: 4. El tamaño es fijo (resultado de longitud conocida) y 5. Arrays de objetos (Object[]).
 */
public class Ej17IntercalarArreglos {

    public static void main(String[] args) {
        Object[] letras = { 'a', 'b', 'c' };
        Object[] numeros = { 1, 2, 3 };
        System.out.println("Arreglo 1: " + Arrays.toString(letras));
        System.out.println("Arreglo 2: " + Arrays.toString(numeros));
        System.out.println("Resultado de la mezcla: " + Arrays.toString(intercalar(letras, numeros)));

        // Con longitudes distintas, los sobrantes quedan al final.
        Object[] mayusculas = { "A", "B", "C" };
        Object[] masNumeros = { 1, 2, 3, 4, 5 };
        System.out.println("Con longitudes distintas: " + Arrays.toString(intercalar(mayusculas, masNumeros)));
    }

    public static Object[] intercalar(Object[] primero, Object[] segundo) {
        Object[] resultado = new Object[primero.length + segundo.length];
        int comunes = Math.min(primero.length, segundo.length);
        int posicion = 0;

        for (int i = 0; i < comunes; i++) {
            resultado[posicion++] = primero[i];
            resultado[posicion++] = segundo[i];
        }
        // Solo uno de los dos bucles siguientes llega a ejecutarse.
        for (int i = comunes; i < primero.length; i++) {
            resultado[posicion++] = primero[i];
        }
        for (int i = comunes; i < segundo.length; i++) {
            resultado[posicion++] = segundo[i];
        }
        return resultado;
    }
}
