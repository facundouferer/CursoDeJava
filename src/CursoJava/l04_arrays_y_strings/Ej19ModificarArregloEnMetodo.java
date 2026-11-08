package CursoJava.l04_arrays_y_strings;

import java.util.Arrays;
import java.util.Random;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Mostrar que un método que recibe un arreglo modifica el arreglo original, no una copia.
 * Concepto: 5. Arrays de primitivos vs. arrays de objetos: la variable guarda una referencia al bloque del Heap.
 */
public class Ej19ModificarArregloEnMetodo {

    public static void main(String[] args) {
        int base = new Random().nextInt(10) + 1;
        int[] valores = { base, base * 2, base * 3 };

        System.out.println("Antes de modificar: " + Arrays.toString(valores));
        modificar(valores);
        System.out.println("Después de modificar: " + Arrays.toString(valores));
        System.out.println("Primer elemento: " + valores[0]);
    }

    /** Recibe la referencia al mismo bloque, así que sus cambios se ven desde quien llamó. */
    public static void modificar(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = valores[i] + (i * 2);
        }
    }
}
