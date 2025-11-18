package Practica.Unidad05;

import java.util.ArrayList;

public class BorrarElementosCondicion {

  public static void main(String[] args) {
    int[] array = { 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    int n = 1;
    int[] resultado = borrarElementosCondicion(array, n);

    System.out.println("Array original: ");
    imprimirArray(array);

    System.out.println("Array después de borrar elementos que son primos y mayores que " + n + ": ");
    imprimirArray(resultado);
  }

  public static int[] borrarElementosCondicion(int[] array, int n) {
    ArrayList<Integer> lista = new ArrayList<>();

    for (int i = 0; i < array.length; i++) {
      if (!(esPrimo(array[i]) && array[i] > n)) {
        lista.add(array[i]);
      }
    }

    int[] nuevoArray = new int[lista.size()];
    for (int i = 0; i < lista.size(); i++) {
      nuevoArray[i] = lista.get(i);
    }

    return nuevoArray;
  }

  public static boolean esPrimo(int num) {
    if (num <= 1)
      return false;
    if (num == 2)
      return true;
    if (num % 2 == 0)
      return false;
    for (int i = 3; i * i <= num; i += 2) {
      if (num % i == 0)
        return false;
    }
    return true;
  }

  public static void imprimirArray(int[] array) {
    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
