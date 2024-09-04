package CursoJava.ArreglosEstaticos;

public class ListarElementos {
  // listar los elementos de un arreglo de enteros
  public static void main(String[] args) {

    int[] arreglo = { 10, 3, 98, 12, 5 };

    for (int elemento : arreglo) {
      System.out.print(elemento + ", ");
    }
    System.out.println();
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print(arreglo[i] + ", ");
    }
  }

}
