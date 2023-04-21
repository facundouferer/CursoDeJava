package CursoJava.arreglos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Arreglos02 {
    /**Ejercicio 2:
     Escribir un programa que dada una lista de números enteros, escribir una función que:
     a) Devuelva una lista con todos los que sean primos.
     b) Devuelva la sumatoria de los valores
     c) Devuelva el promedio de los valores.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño de la lista
        System.out.println("Por favor, ingrese el tamaño de la lista:");
        int n = scanner.nextInt();

        // Crear la lista y solicitar los valores al usuario
        List<Integer> lista = new ArrayList<>();
        System.out.println("Ingrese los valores de la lista:");
        for (int i = 0; i < n; i++) {
            lista.add(scanner.nextInt());
        }

        // a) Obtener la lista de números primos
        List<Integer> primos = obtenerNumerosPrimos(lista);
        System.out.println("La lista de números primos es: " + primos);

        // b) Calcular la sumatoria de los valores
        int sumatoria = calcularSumatoria(lista);
        System.out.println("La sumatoria de los valores es: " + sumatoria);

        // c) Calcular el promedio de los valores
        double promedio = calcularPromedio(lista);
        System.out.println("El promedio de los valores es: " + promedio);
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función para obtener la lista de números primos
    public static List<Integer> obtenerNumerosPrimos(List<Integer> lista) {
        List<Integer> primos = new ArrayList<>();
        for (int num : lista) {
            if (esPrimo(num)) {
                primos.add(num);
            }
        }
        return primos;
    }

    // Función para calcular la sumatoria de los valores
    public static int calcularSumatoria(List<Integer> lista) {
        int sumatoria = 0;
        for (int num : lista) {
            sumatoria += num;
        }
        return sumatoria;
    }

    // Función para calcular el promedio de los valores
    public static double calcularPromedio(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        }
        int sumatoria = calcularSumatoria(lista);
        return (double) sumatoria / lista.size();
    }
}
