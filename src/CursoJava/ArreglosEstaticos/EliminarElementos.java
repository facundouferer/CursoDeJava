package CursoJava.ArreglosEstaticos;

public class EliminarElementos {
  public static void main(String[] args) {
    int[] arreglo = { 10, 3, 98, 12, 5 };

    // Eliminar el elemento en la posición 2
    for (int i = 2; i < arreglo.length - 1; i++) {
      arreglo[i] = arreglo[i + 1];
    }

    // eliminar el último elemento
    int[] nuevoArreglo = new int[arreglo.length - 1];
    for (int i = 0; i < nuevoArreglo.length; i++) {
      nuevoArreglo[i] = arreglo[i];
    }

    arreglo = nuevoArreglo;

    // impresión del arreglo
    for (int elemento : arreglo) {
      System.out.println(elemento);
    }

  }

}
