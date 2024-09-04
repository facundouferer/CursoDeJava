package CursoJava.ArreglosEstaticos;

import java.util.Scanner;

public class Arreglos04 {
    /**
     * Ejercicio 4:
     * Escriba un programa para realizar otra funci�n que invierta una lista,
     * similar al ejercicio anterior,
     * pero en lugar de devolver una nueva, modifique la lista dada para invertirla,
     * sin usar listas
     * auxiliares.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Solicitar al usuario la cantidad de elementos a ingresar
        System.out.println("Ingrese la cantidad de elementos en la lista:");
        n = scanner.nextInt();
        scanner.nextLine();

        // Crear un arreglo para almacenar las cadenas
        String[] lista = new String[n];

        // Solicitar al usuario las cadenas
        System.out.println("Ingrese los elementos de la lista:");
        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextLine();
        }

        // Invertir la lista sin utilizar listas auxiliares
        for (int i = 0; i < n / 2; i++) {
            String temp = lista[i];
            lista[i] = lista[n - 1 - i];
            lista[n - 1 - i] = temp;
        }

        // Imprimir la lista invertida
        System.out.println("Lista invertida:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

}
