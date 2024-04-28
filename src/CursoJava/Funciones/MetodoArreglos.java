package CursoJava.Funciones;

import java.util.Scanner;

public class MetodoArreglos {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Tamaño del listado:");
    int tamanio = scanner.nextInt();
    int[] arreglo = new int[tamanio];

    solicitarArreglo(arreglo, scanner);
    imprimirArreglo(arreglo);
  }

  public static void imprimirArreglo(int[] arreglo) {
    System.out.println("Cuadrados:");
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print(arreglo[i] * arreglo[i] + ", ");
    }
  }

  public static void solicitarArreglo(int[] arreglo, Scanner scanner) {
    for (int i = 0; i < arreglo.length; i++) {
      scanner = new Scanner(System.in);
      System.out.println("valor:");
      arreglo[i] = scanner.nextInt();
    }
  }

}
