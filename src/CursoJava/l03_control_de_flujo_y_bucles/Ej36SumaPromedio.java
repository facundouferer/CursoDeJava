package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: calcular la suma y el promedio de números del rango [0, 100]; la carga termina al ingresar un valor
 * fuera del rango.
 * Concepto: 3. Bucles e iteración: while.
 */
public class Ej36SumaPromedio {

    private static final int MINIMO = 0;
    private static final int MAXIMO = 100;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        int cantidad = 0;

        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        while (numero >= MINIMO && numero <= MAXIMO) {
            suma += numero;
            cantidad++;
            System.out.print("Ingrese un número: ");
            numero = entrada.nextInt();
        }

        if (cantidad > 0) {
            System.out.println("Suma: " + suma);
            System.out.println("Promedio: " + (double) suma / cantidad);
        } else {
            System.out.println("No se ingresaron números en el rango [0,100]");
        }
        entrada.close();
    }
}
