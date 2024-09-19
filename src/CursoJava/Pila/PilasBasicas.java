package CursoJava.Pila;

import java.util.Arrays;

public class PilasBasicas {
  private int[] pila;
  private int tope;
  private int capacidad;

  // Constructor para inicializar la pila con una capacidad específica
  public PilasBasicas(int capacidad) {
    this.capacidad = capacidad;
    pila = new int[capacidad];
    tope = -1; // La pila está vacía inicialmente
  }

  // Método para agregar un elemento a la pila (push)
  public void push(int elemento) {
    if (tope == capacidad - 1) {
      System.out.println("La pila está llena. No se puede agregar el elemento.");
    } else {
      pila[++tope] = elemento;
      System.out.println("Elemento " + elemento + " agregado a la pila.");
    }
  }

  // Método para eliminar el elemento superior de la pila (pop)
  public int pop() {
    if (tope == -1) {
      System.out.println("La pila está vacía. No se puede eliminar ningún elemento.");
      return -1; // Indicador de que la pila está vacía
    } else {
      int elemento = pila[tope--];
      System.out.println("Elemento " + elemento + " eliminado de la pila.");
      return elemento;
    }
  }

  // Método para ver el elemento superior de la pila sin eliminarlo (peek)
  public int peek() {
    if (tope == -1) {
      System.out.println("La pila está vacía.");
      return -1; // Indicador de que la pila está vacía
    } else {
      return pila[tope];
    }
  }

  // Método para modificar un elemento en una posición específica de la pila
  public void modificar(int indice, int nuevoElemento) {
    if (indice < 0 || indice > tope) {
      System.out.println("Índice fuera de rango.");
    } else {
      pila[indice] = nuevoElemento;
      System.out.println("Elemento en el índice " + indice + " modificado a " + nuevoElemento);
    }
  }

  // Método para ordenar la pila (usando el algoritmo de burbuja)
  public void ordenar() {
    for (int i = 0; i <= tope; i++) {
      for (int j = 0; j < tope - i; j++) {
        if (pila[j] > pila[j + 1]) {
          int temp = pila[j];
          pila[j] = pila[j + 1];
          pila[j + 1] = temp;
        }
      }
    }
    System.out.println("Pila ordenada: " + Arrays.toString(Arrays.copyOfRange(pila, 0, tope + 1)));
  }

  // Método para mostrar todos los elementos de la pila
  public void mostrar() {
    if (tope == -1) {
      System.out.println("La pila está vacía.");
    } else {
      System.out.println("Elementos en la pila: " + Arrays.toString(Arrays.copyOfRange(pila, 0, tope + 1)));
    }
  }

  public static void main(String[] args) {
    PilasBasicas pila = new PilasBasicas(5);

    // Agregar elementos a la pila
    pila.push(10);
    pila.push(20);
    pila.push(30);
    pila.push(40);
    pila.push(50);

    // Mostrar elementos de la pila
    pila.mostrar();

    // Eliminar el elemento superior de la pila
    pila.pop();

    // Mostrar elementos de la pila
    pila.mostrar();

    // Ver el elemento superior de la pila sin eliminarlo
    System.out.println("Elemento superior: " + pila.peek());

    // Modificar un elemento en la pila
    pila.modificar(1, 25);

    // Mostrar elementos de la pila
    pila.mostrar();

    // Ordenar la pila
    pila.ordenar();

    // Mostrar elementos de la pila
    pila.mostrar();
  }
}