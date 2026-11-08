package CursoJava.l04_arrays_y_strings;

import java.util.Scanner;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Pedir el tamaño de un listado, cargar sus valores y mostrar el cuadrado de cada uno.
 * Concepto: 2. Declarar, instanciar e inicializar (el tamaño se conoce recién en ejecución).
 */
public class Ej01CrearArregloUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del listado: ");
        int tamanio = scanner.nextInt();

        // Un tamaño negativo lanzaría NegativeArraySizeException: se valida antes de instanciar.
        if (tamanio < 0) {
            System.out.println("El tamaño no puede ser negativo.");
            return;
        }

        int[] valores = new int[tamanio];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        System.out.println("Cuadrados:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] * valores[i]);
            if (i < valores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
