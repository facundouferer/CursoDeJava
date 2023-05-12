package CursoJava.Secuencias;

import java.util.Scanner;

public class OrdenAlfabetico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener el tamaño del arreglo
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = scanner.nextInt();

        // Crear el arreglo
        String[] arreglo = new String[n];

        // Obtener los elementos del arreglo
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.next();
        }

        // Ordenar el arreglo alfabéticamente
        ordenarArreglo(arreglo);

        // Mostrar el arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int i = 0; i < n; i++) {
            System.out.println(arreglo[i]);
        }
    }

    public static void ordenarArreglo(String[] arreglo) {
        int n = arreglo.length;

        // Recorrer el arreglo
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            // Encontrar el índice del elemento más pequeño en el subarreglo restante
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j].compareTo(arreglo[indiceMinimo]) < 0) {
                    indiceMinimo = j;
                }
            }
            // Intercambiar el elemento más pequeño con el primer elemento no ordenado
            String temp = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = temp;
        }
    }
}
