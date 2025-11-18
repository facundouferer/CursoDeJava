package Practica.Unidad05;

import java.util.Scanner;

public class EliminarElemento {

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    Scanner scanner = new Scanner(System.in);
    System.out.println("Array original:");
    imprimirArray(array);
    System.out.print("Ingrese el valor a eliminar: ");
    int valorAEliminar = scanner.nextInt();
    int[] nuevoArray = eliminarElemento(array, valorAEliminar);
    if (nuevoArray.length == array.length) {
      System.out.println("El valor " + valorAEliminar + " no se encontró en el array.");
    } else {
      System.out.println("Array después de eliminar " + valorAEliminar + ":");
      imprimirArray(nuevoArray);
    }
    scanner.close();
  }

  public static int[] eliminarElemento(int[] arr, int v) {
    int conteo = 0;
    for (int i : arr) {
      if (i == v) {
        conteo++;
      }
    }
    if (conteo == 0) {
      return arr;
    }
    int[] array = new int[arr.length - conteo];
    int indice = 0;
    for (int i : arr) {
      if (i != v) {
        array[indice++] = i;
      }
    }
    return array;
  }

  public static void imprimirArray(int[] array) {
    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
