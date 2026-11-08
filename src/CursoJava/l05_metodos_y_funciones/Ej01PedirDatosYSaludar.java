package CursoJava.l05_metodos_y_funciones;

import java.util.Scanner;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Saludar al usuario por su nombre y mostrar el producto de dos números ingresados.
 * Concepto: 1. Declaración y sintaxis de un método (parámetros y valores de retorno).
 */
public class Ej01PedirDatosYSaludar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre = pedirNombre(scanner);
        saludar(nombre);

        int[] numeros = pedirNumeros(scanner);
        int producto = calcularProducto(numeros[0], numeros[1]);
        mostrarProducto(numeros[0], numeros[1], producto);

        scanner.close();
    }

    public static String pedirNombre(Scanner scanner) {
        System.out.println("Por favor, ingresa tu nombre:");
        return scanner.nextLine();
    }

    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    public static int[] pedirNumeros(Scanner scanner) {
        System.out.println("Por favor, ingresa dos números:");
        int primero = scanner.nextInt();
        int segundo = scanner.nextInt();
        return new int[] { primero, segundo };
    }

    public static int calcularProducto(int primero, int segundo) {
        return primero * segundo;
    }

    public static void mostrarProducto(int primero, int segundo, int producto) {
        System.out.println("El producto de " + primero + " y " + segundo + " es: " + producto);
    }
}
