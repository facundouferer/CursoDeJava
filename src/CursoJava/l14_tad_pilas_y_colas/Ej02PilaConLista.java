package CursoJava.l14_tad_pilas_y_colas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Lección 14 – TAD Pila y TAD Cola: Estructuras Lineales
 * Objetivo: Gestionar una pila dinámica de enteros desde un menú interactivo.
 * Concepto: 1. La Pila (LIFO): el último en entrar es el primero en salir.
 */
public class Ej02PilaConLista {
  private final List<Integer> elementos = new ArrayList<>();

  public boolean estaVacia() {
    return elementos.isEmpty();
  }

  public void push(int elemento) {
    elementos.add(elemento);
    System.out.println("Elemento " + elemento + " agregado a la pila.");
  }

  public int pop() {
    if (estaVacia()) {
      System.out.println("La pila está vacía. No se puede eliminar ningún elemento.");
      return -1;
    }
    int elemento = elementos.remove(elementos.size() - 1);
    System.out.println("Elemento " + elemento + " eliminado de la pila.");
    return elemento;
  }

  public int peek() {
    if (estaVacia()) {
      System.out.println("La pila está vacía.");
      return -1;
    }
    return elementos.get(elementos.size() - 1);
  }

  public void modificar(int indice, int nuevoElemento) {
    if (indice < 0 || indice >= elementos.size()) {
      System.out.println("Índice fuera de rango.");
      return;
    }
    elementos.set(indice, nuevoElemento);
    System.out.println("Elemento en el índice " + indice + " modificado a " + nuevoElemento);
  }

  public void ordenar() {
    Collections.sort(elementos);
    System.out.println("Pila ordenada: " + elementos);
  }

  public void mostrar() {
    if (estaVacia()) {
      System.out.println("La pila está vacía.");
    } else {
      System.out.println("Elementos en la pila: " + elementos);
    }
  }

  public static void main(String[] args) {
    Ej02PilaConLista pila = new Ej02PilaConLista();
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
      System.out.println("\n==================================");
      System.out.println("PILA DINÁMICA - MENÚ DE OPCIONES");
      System.out.println("==================================");
      System.out.println("1. Agregar elemento");
      System.out.println("2. Eliminar elemento");
      System.out.println("3. Ver elemento superior");
      System.out.println("4. Modificar elemento");
      System.out.println("5. Ordenar pila");
      System.out.println("6. Mostrar pila");
      System.out.println("7. Salir");
      System.out.println("==================================");
      System.out.print("Ingrese el número de la opción que desea realizar: ");
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1 -> {
          System.out.print("Ingrese el elemento a agregar: ");
          pila.push(scanner.nextInt());
        }
        case 2 -> pila.pop();
        case 3 -> System.out.println("Elemento superior: " + pila.peek());
        case 4 -> {
          System.out.print("Ingrese el índice del elemento a modificar: ");
          int indice = scanner.nextInt();
          System.out.print("Ingrese el nuevo valor del elemento: ");
          pila.modificar(indice, scanner.nextInt());
        }
        case 5 -> pila.ordenar();
        case 6 -> pila.mostrar();
        case 7 -> System.out.println("Saliendo del programa.");
        default -> System.out.println("Opción no válida.");
      }
    } while (opcion != 7);

    scanner.close();
  }
}
