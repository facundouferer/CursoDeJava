package CursoJava.Arreglos;

public class ListarElementos {
  // listar los elementos de un arreglo de enteros
  public static void main(String[] args) {
    int[] arreglo = { 10, 3, 98, 12, 5 };
    for (int elemento : arreglo) {
      System.out.println(elemento);
    }
  }

}
