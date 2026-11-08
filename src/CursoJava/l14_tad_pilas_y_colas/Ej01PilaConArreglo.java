package CursoJava.l14_tad_pilas_y_colas;

import java.util.Arrays;

/**
 * Lección 14 – TAD Pila y TAD Cola: Estructuras Lineales
 * Objetivo: Implementar una pila de capacidad fija sobre un arreglo y probar sus operaciones.
 * Concepto: 1. La Pila (LIFO): el último en entrar es el primero en salir.
 */
public class Ej01PilaConArreglo {
  private static final int VACIA = -1;

  private final int[] elementos;
  private int tope;

  public Ej01PilaConArreglo(int capacidad) {
    this.elementos = new int[capacidad];
    this.tope = VACIA;
  }

  public boolean estaVacia() {
    return tope == VACIA;
  }

  public boolean estaLlena() {
    return tope == elementos.length - 1;
  }

  public void push(int elemento) {
    if (estaLlena()) {
      System.out.println("La pila está llena. No se puede agregar el elemento.");
      return;
    }
    elementos[++tope] = elemento;
    System.out.println("Elemento " + elemento + " agregado a la pila.");
  }

  public int pop() {
    if (estaVacia()) {
      System.out.println("La pila está vacía. No se puede eliminar ningún elemento.");
      return -1;
    }
    int elemento = elementos[tope--];
    System.out.println("Elemento " + elemento + " eliminado de la pila.");
    return elemento;
  }

  public int peek() {
    if (estaVacia()) {
      System.out.println("La pila está vacía.");
      return -1;
    }
    return elementos[tope];
  }

  public void modificar(int indice, int nuevoElemento) {
    if (indice < 0 || indice > tope) {
      System.out.println("Índice fuera de rango.");
      return;
    }
    elementos[indice] = nuevoElemento;
    System.out.println("Elemento en el índice " + indice + " modificado a " + nuevoElemento);
  }

  /** Ordena de menor a mayor con el método de la burbuja. */
  public void ordenar() {
    for (int i = 0; i <= tope; i++) {
      for (int j = 0; j < tope - i; j++) {
        if (elementos[j] > elementos[j + 1]) {
          int temporal = elementos[j];
          elementos[j] = elementos[j + 1];
          elementos[j + 1] = temporal;
        }
      }
    }
    System.out.println("Pila ordenada: " + contenido());
  }

  public void mostrar() {
    if (estaVacia()) {
      System.out.println("La pila está vacía.");
    } else {
      System.out.println("Elementos en la pila: " + contenido());
    }
  }

  private String contenido() {
    return Arrays.toString(Arrays.copyOfRange(elementos, 0, tope + 1));
  }

  public static void main(String[] args) {
    Ej01PilaConArreglo pila = new Ej01PilaConArreglo(5);

    pila.push(10);
    pila.push(20);
    pila.push(30);
    pila.push(40);
    pila.push(50);
    pila.mostrar();

    pila.pop();
    pila.mostrar();

    System.out.println("Elemento superior: " + pila.peek());

    pila.modificar(1, 25);
    pila.mostrar();

    pila.ordenar();
    pila.mostrar();
  }
}
