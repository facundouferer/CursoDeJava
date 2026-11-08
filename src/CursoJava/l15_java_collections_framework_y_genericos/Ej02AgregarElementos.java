/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Cargar elementos de texto en una lista hasta que se ingrese una línea vacía.
 * Concepto: Familia List: crecimiento dinámico con add().
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej02AgregarElementos {

  public static void main(String[] args) {
    List<String> elementos = new ArrayList<>();

    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        System.out.print("Ingrese un elemento (vacío para terminar): ");
        String entrada = scanner.nextLine();
        if (entrada.isEmpty()) {
          break;
        }
        elementos.add(entrada);
      }
    }

    System.out.println("Elementos ingresados:");
    for (String elemento : elementos) {
      System.out.println(elemento);
    }
  }
}
