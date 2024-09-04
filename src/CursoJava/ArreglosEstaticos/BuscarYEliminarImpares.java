package CursoJava.ArreglosEstaticos;

public class BuscarYEliminarImpares {
  public static void main(String[] args) {
    int[] arreglo = { 10, 3, 98, 12, 5, 12, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29 };
    // eliminar todos los numeros pares
    int cantidadDePares = 0;
    System.out.println("arreglo");
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print(arreglo[i] + ", ");
      if (arreglo[i] % 2 == 0) {
        cantidadDePares++;
      }
    }
    int[] nuevoArreglo = new int[arreglo.length - cantidadDePares];
    int j = 0;
    for (int i = 0; i < arreglo.length; i++) {
      if (arreglo[i] % 2 != 0) {
        nuevoArreglo[j] = arreglo[i];
        j++;
      }
    }
    arreglo = nuevoArreglo;
    // impresión del arreglo
    System.out.println("\nArreglo nuevo");
    for (int elemento : arreglo) {
      System.out.print(elemento + ", ");
    }
  }
}
