package CursoJava.l13_tad_listas_estaticas_y_dinamicas.ej01_listas_tad;

/*
 * Lección 13 – TAD listas estáticas y dinámicas
 * Objetivo: definir el nodo, la pieza básica de las listas enlazadas.
 * Concepto: §3 El nodo (un dato y una referencia al nodo siguiente).
 */
public class Nodo<T> {

  T dato;
  Nodo<T> siguiente; // referencia a otro nodo del mismo tipo; null si no hay siguiente

  public Nodo(T dato) {
    this.dato = dato;
    this.siguiente = null;
  }
}
