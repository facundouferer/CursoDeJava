package CursoJava.Cola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ColaDinamica {
  private ArrayList<Integer> cola;

  // Constructor para inicializar la cola
  public ColaDinamica() {
    cola = new ArrayList<>();
  }

  // Método para agregar un elemento a la cola (enqueue)
  public void enqueue(int elemento) {
    cola.add(elemento);
    System.out.println("Elemento " + elemento + " agregado a la cola.");
  }

  // Método para eliminar el elemento frontal de la cola (dequeue)
  public int dequeue() {
    if (cola.isEmpty()) {
      System.out.println("La cola está vacía. No se puede eliminar ningún elemento.");
      return -1; // Indicador de que la cola está vacía
    } else {
      int elemento = cola.remove(0);
      System.out.println("Elemento " + elemento + " eliminado de la cola.");
      return elemento;
    }
  }

  // Método para ver el elemento frontal de la cola sin eliminarlo (peek)
  public int peek() {
    if (cola.isEmpty()) {
      System.out.println("La cola está vacía.");
      return -1; // Indicador de que la cola está vacía
    } else {
      return cola.get(0);
    }
  }

  // Método para modificar un elemento en una posición específica de la cola
  public void modificar(int indice, int nuevoElemento) {
    if (indice < 0 || indice >= cola.size()) {
      System.out.println("Índice fuera de rango.");
    } else {
      cola.set(indice, nuevoElemento);
      System.out.println("Elemento en el índice " + indice + " modificado a " + nuevoElemento);
    }
  }

  // Método para ordenar la cola
  public void ordenar() {
    Collections.sort(cola);
    System.out.println("Cola ordenada: " + cola);
  }

  // Método para mostrar todos los elementos de la cola
  public void mostrar() {
    if (cola.isEmpty()) {
      System.out.println("La cola está vacía.");
    } else {
      System.out.println("Elementos en la cola: " + cola);
    }
  }

  public static void main(String[] args) {
    ColaDinamica cola = new ColaDinamica();
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
      System.out.println("\n==================================");
      System.out.println("COLA DINÁMICA - MENU DE OPCIONES");
      System.out.println("==================================");
      System.out.println("1. Agregar elemento");
      System.out.println("2. Eliminar elemento");
      System.out.println("3. Ver elemento frontal");
      System.out.println("4. Modificar elemento");
      System.out.println("5. Ordenar cola");
      System.out.println("6. Mostrar cola");
      System.out.println("7. Salir");
      System.out.println("==================================");
      System.out.print("Por favor, ingrese el número de la opción que desea realizar: ");
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          System.out.print("Ingrese el elemento a agregar: ");
          int elemento = scanner.nextInt();
          cola.enqueue(elemento);
          break;
        case 2:
          cola.dequeue();
          break;
        case 3:
          System.out.println("Elemento frontal: " + cola.peek());
          break;
        case 4:
          System.out.print("Ingrese el índice del elemento a modificar: ");
          int indice = scanner.nextInt();
          System.out.print("Ingrese el nuevo valor del elemento: ");
          int nuevoElemento = scanner.nextInt();
          cola.modificar(indice, nuevoElemento);
          break;
        case 5:
          cola.ordenar();
          break;
        case 6:
          cola.mostrar();
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