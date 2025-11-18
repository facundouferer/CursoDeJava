package Practica.Unidad05;

public class EliminarDuplicados {
  public static void main(String[] args) {
    int[] array = { 4, 2, 3, 2, 4, 3, 1, 2 };
    System.out.println("Array original:");
    imprimirArray(array);

    int[] arraySinDuplicados = eliminarDuplicados(array);
    System.out.println("Array sin duplicados:");
    imprimirArray(arraySinDuplicados);
  }

  public static int[] eliminarDuplicados(int[] a) {
    if (a.length == 0 || a.length == 1) {
      return a;
    }
    int[] t = new int[a.length];
    int ix = 0;
    for (int i = 0; i < a.length; i++) {
      boolean duplicado = false;
      for (int j = 0; j < ix; j++) {
        if (a[i] == t[j]) {
          duplicado = true;
          break;
        }
      }
      if (!duplicado) {
        t[ix++] = a[i];
      }
    }
    int[] array = new int[ix];
    for (int i = 0; i < ix; i++) {
      array[i] = t[i];
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
