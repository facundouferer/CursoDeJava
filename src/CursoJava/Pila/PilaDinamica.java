package CursoJava.Pila;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PilaDinamica {
  private ArrayList<Integer> pila;

  // Constructor para inicializar la pila
  public PilaDinamica() {
    pila = new ArrayList<>();
  }

  // Método para agregar un elemento a la pila (push)
  public void push(int elemento) {
    pila.add(elemento);
    System.out.println("Elemento " + elemento + " agregado a la pila.");
  }

  // Método para eliminar el elemento superior de la pila (pop)
  public int pop() {
    if (pila.isEmpty()) {
      System.out.println("La pila está vacía. No se puede eliminar ningún elemento.");
      return -1; // Indicador de que la pila está vacía
    } else {
      int elemento = pila.remove(pila.size() - 1);
      System.out.println("Elemento " + elemento + " eliminado de la pila.");
      return elemento;
    }
  }

  // Método para ver el elemento superior de la pila sin eliminarlo (peek)
  public int peek() {
    if (pila.isEmpty()) {
      System.out.println("La pila está vacía.");
      return -1; // Indicador de que la pila está vacía
    } else {
      return pila.get(pila.size() - 1);
    }
  }

  // Método para modificar un elemento en una posición específica de la pila
  public void modificar(int indice, int nuevoElemento) {
    if (indice < 0 || indice >= pila.size()) {
      System.out.println("Índice fuera de rango.");
    } else {
      pila.set(indice, nuevoElemento);
      System.out.println("Elemento en el índice " + indice + " modificado a " + nuevoElemento);
    }
  }

  // Método para ordenar la pila
  public void ordenar() {
    Collections.sort(pila);
    System.out.println("Pila ordenada: " + pila);
  }

  // Método para mostrar todos los elementos de la pila
  public void mostrar() {
    if (pila.isEmpty()) {
      System.out.println("La pila está vacía.");
    } else {
      System.out.println("Elementos en la pila: " + pila);
    }
  }

  public static void main(String[] args) {
    PilaDinamica pila = new PilaDinamica();
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
      System.out.println("\n==================================");
      System.out.println("PILA DINÁMICA - MENU DE OPCIONES");
      System.out.println("==================================");
      System.out.println("1. Agregar elemento");
      System.out.println("2. Eliminar elemento");
      System.out.println("3. Ver elemento superior");
      System.out.println("4. Modificar elemento");
      System.out.println("5. Ordenar pila");
      System.out.println("6. Mostrar pila");
      System.out.println("7. Salir");
      System.out.println("==================================");
      System.out.print("Por favor, ingrese el número de la opción que desea realizar: ");
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          System.out.print("Ingrese el elemento a agregar: ");
          int elemento = scanner.nextInt();
          pila.push(elemento);
          break;
        case 2:
          pila.pop();
          break;
        case 3:
          System.out.println("Elemento superior: " + pila.peek());
          break;
        case 4:
          System.out.print("Ingrese el índice del elemento a modificar: ");
          int indice = scanner.nextInt();
          System.out.print("Ingrese el nuevo valor del elemento: ");
          int nuevoElemento = scanner.nextInt();
          pila.modificar(indice, nuevoElemento);
          break;
        case 5:
          pila.ordenar();
          break;
        case 6:
          pila.mostrar();
          break;
        case 7:
          System.out.println("Saliendo del programa.");
          break;
        default:
          System.out.println("Opción no válida.");
          break;
      }
    } while (opcion != 7);

    scanner.close();
  }
}