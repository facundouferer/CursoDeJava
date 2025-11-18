package Practica.Unidad05;

import java.util.ArrayList;
import java.util.Scanner;

public class AgregarElementos {

  public static void main(String[] args) {
    ArrayList<String> listaDeElementos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Ingrese un elemento de texto: ");
      String input = scanner.nextLine();
      // isEmpty() devuelve true si el String está vacío
      if (input.isEmpty()) {
        break;
      }
      listaDeElementos.add(input);
    }
    scanner.close();
    System.out.println("Elementos ingresados:");
    for (String elemento : listaDeElementos) {
      System.out.println(elemento);
    }
  }
}
