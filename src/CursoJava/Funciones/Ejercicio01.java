package CursoJava.Funciones;

import java.util.Scanner;

public class Ejercicio01 {

    /**
     * Ejercicio 1:
     * Escribir un programa que pregunte al usuario:
     * a) Su nombre, y luego lo salude.
     * b) Dos números, y luego muestre el producto.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = pedirNombre(scanner);
        saludar(nombre);
        int[] numeros = pedirNumeros(scanner);
        int producto = calcularProducto(numeros[0], numeros[1]);
        mostrarProducto(numeros[0], numeros[1], producto);
        scanner.close();
    }

    public static String pedirNombre(Scanner entrada) {
        System.out.println("Por favor, ingresa tu nombre:");
        return entrada.nextLine();
    }

    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    public static int[] pedirNumeros(Scanner scanner) {
        System.out.println("Por favor, ingresa dos números:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        return new int[] { num1, num2 };
    }

    public static int calcularProducto(int num1, int num2) {
        return num1 * num2;
    }

    public static void mostrarProducto(int num1, int num2, int producto) {
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + producto);
    }

}
