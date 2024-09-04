package CursoJava.ArreglosEstaticos;

import java.util.Scanner;

public class CrearArregloUsuario {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Tamaño del listado:");
    int tamanio = scanner.nextInt();
    int[] arreglo = new int[tamanio];

    for (int i = 0; i < arreglo.length; i++) {
      scanner = new Scanner(System.in);
      System.out.println("valor:");
      arreglo[i] = scanner.nextInt();
    }

    System.out.println("Cuadrados:");
    for (int i = 0; i < arreglo.length; i++) {
      System.out.print(arreglo[i] * arreglo[i] + ", ");
    }
  }

}
