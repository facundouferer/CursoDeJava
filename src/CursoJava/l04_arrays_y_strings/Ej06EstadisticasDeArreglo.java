package CursoJava.l04_arrays_y_strings;

import java.util.Scanner;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Calcular el promedio y el máximo de 20 valores, y listar los que superan el promedio.
 * Concepto: 3. Recorrer un array (acumuladores; inicializar el máximo con el primer elemento).
 */
public class Ej06EstadisticasDeArreglo {

    private static final int CANTIDAD = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[CANTIDAD];

        System.out.println("Ingrese " + CANTIDAD + " valores:");
        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextInt();
        }

        double promedio = calcularPromedio(valores);
        int cantidadMayores = 0;
        for (int valor : valores) {
            if (valor > promedio) {
                cantidadMayores++;
            }
        }

        System.out.println("El promedio es: " + promedio);
        System.out.println("El valor máximo es: " + buscarMaximo(valores));
        System.out.println("La cantidad de valores mayores al promedio es: " + cantidadMayores);
        System.out.println("Valores mayores que el promedio:");
        for (int valor : valores) {
            if (valor > promedio) {
                System.out.println(valor);
            }
        }
    }

    public static double calcularPromedio(int[] valores) {
        long suma = 0;
        for (int valor : valores) {
            suma += valor;
        }
        // El (double) evita la división entera, que perdería los decimales.
        return (double) suma / valores.length;
    }

    /** Se arranca con el primer elemento y nunca con 0: si todos fueran negativos el máximo sería falso. */
    public static int buscarMaximo(int[] valores) {
        int maximo = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maximo) {
                maximo = valores[i];
            }
        }
        return maximo;
    }
}
