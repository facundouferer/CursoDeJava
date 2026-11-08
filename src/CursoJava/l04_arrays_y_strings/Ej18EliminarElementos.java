package CursoJava.l04_arrays_y_strings;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Eliminar elementos de un arreglo por posición, por valor o por condición, y quitar duplicados.
 * Concepto: 4. El tamaño es fijo: eliminar siempre significa crear un arreglo más chico y copiar lo que se conserva.
 */
public class Ej18EliminarElementos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Arreglo original: " + Arrays.toString(numeros));

        System.out.println("Sin la posición 2: " + Arrays.toString(eliminarPosicion(numeros, 2)));

        System.out.print("Ingrese el valor a eliminar: ");
        int valor = scanner.nextInt();
        int[] sinValor = eliminarValor(numeros, valor);
        if (sinValor.length == numeros.length) {
            System.out.println("El valor " + valor + " no se encontró en el arreglo.");
        } else {
            System.out.println("Arreglo después de eliminar " + valor + ": " + Arrays.toString(sinValor));
        }

        System.out.println("Sin los números pares: " + Arrays.toString(eliminarPares(numeros)));
        System.out.println("Sin los mayores que 4: " + Arrays.toString(eliminarMayoresQue(numeros, 4)));

        int[] mezclados = { 3, -4, 5, -6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        System.out.println("Arreglo con negativos: " + Arrays.toString(mezclados));
        System.out.println("Sin los negativos: " + Arrays.toString(eliminarNegativos(mezclados)));
        System.out.println("Sin los primos mayores que 5: " + Arrays.toString(eliminarPrimosMayoresQue(mezclados, 5)));

        int[] repetidos = { 4, 2, 3, 2, 4, 3, 1, 2 };
        System.out.println("Arreglo con repetidos: " + Arrays.toString(repetidos));
        System.out.println("Sin duplicados: " + Arrays.toString(eliminarDuplicados(repetidos)));
    }

    /** Elimina la casilla indicada: los elementos posteriores se copian una posición hacia atrás. */
    public static int[] eliminarPosicion(int[] numeros, int posicion) {
        if (posicion < 0 || posicion >= numeros.length) {
            return numeros;
        }
        int[] resultado = new int[numeros.length - 1];
        System.arraycopy(numeros, 0, resultado, 0, posicion);
        System.arraycopy(numeros, posicion + 1, resultado, posicion, numeros.length - posicion - 1);
        return resultado;
    }

    /** Elimina todas las apariciones de un valor; si no está, devuelve el mismo arreglo. */
    public static int[] eliminarValor(int[] numeros, int valor) {
        boolean[] descartar = new boolean[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            descartar[i] = numeros[i] == valor;
        }
        return compactar(numeros, descartar);
    }

    public static int[] eliminarPares(int[] numeros) {
        boolean[] descartar = new boolean[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            descartar[i] = numeros[i] % 2 == 0;
        }
        return compactar(numeros, descartar);
    }

    public static int[] eliminarNegativos(int[] numeros) {
        boolean[] descartar = new boolean[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            descartar[i] = numeros[i] < 0;
        }
        return compactar(numeros, descartar);
    }

    public static int[] eliminarMayoresQue(int[] numeros, int limite) {
        boolean[] descartar = new boolean[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            descartar[i] = numeros[i] > limite;
        }
        return compactar(numeros, descartar);
    }

    public static int[] eliminarPrimosMayoresQue(int[] numeros, int limite) {
        boolean[] descartar = new boolean[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            descartar[i] = esPrimo(numeros[i]) && numeros[i] > limite;
        }
        return compactar(numeros, descartar);
    }

    /** Conserva la primera aparición de cada valor y descarta las repetidas. */
    public static int[] eliminarDuplicados(int[] numeros) {
        int[] unicos = new int[numeros.length];
        int cantidad = 0;
        for (int numero : numeros) {
            boolean repetido = false;
            for (int j = 0; j < cantidad; j++) {
                if (unicos[j] == numero) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                unicos[cantidad++] = numero;
            }
        }
        return Arrays.copyOf(unicos, cantidad);
    }

    /** Crea un arreglo del tamaño justo y copia solo las casillas no marcadas para descartar. */
    private static int[] compactar(int[] numeros, boolean[] descartar) {
        int conservados = 0;
        for (boolean quitar : descartar) {
            if (!quitar) {
                conservados++;
            }
        }
        if (conservados == numeros.length) {
            return numeros;
        }
        int[] resultado = new int[conservados];
        int indice = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (!descartar[i]) {
                resultado[indice++] = numeros[i];
            }
        }
        return resultado;
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int divisor = 2; divisor * divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
