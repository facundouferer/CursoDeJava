package CursoJava.l13_tad_listas_estaticas_y_dinamicas.ej01_listas_tad;

/*
 * Lección 13 – TAD listas estáticas y dinámicas
 * Objetivo: implementar una lista doblemente enlazada que se recorre en ambos sentidos.
 * Concepto: §5 Variantes: doble y circular (cada nodo guarda también su anterior).
 */
public class ListaDoblementeEnlazada<T> {

  private static class NodoDoble<T> {
    T dato;
    NodoDoble<T> anterior;
    NodoDoble<T> siguiente;

    NodoDoble(T dato) {
      this.dato = dato;
    }
  }

  private NodoDoble<T> cabeza;
  private NodoDoble<T> cola;
  private int tamanio;

  public void agregarAlFinal(T dato) {
    NodoDoble<T> nuevo = new NodoDoble<>(dato);
    if (cola == null) {
      cabeza = nuevo;
    } else {
      cola.siguiente = nuevo;
      nuevo.anterior = cola;
    }
    cola = nuevo;
    tamanio++;
  }

  /** Elimina la primera aparición del dato. Devuelve false si no estaba. */
  public boolean eliminar(T dato) {
    NodoDoble<T> actual = cabeza;
    while (actual != null && !actual.dato.equals(dato)) {
      actual = actual.siguiente;
    }
    if (actual == null) {
      return false;
    }
    if (actual.anterior != null) {
      actual.anterior.siguiente = actual.siguiente;
    } else {
      cabeza = actual.siguiente;
    }
    if (actual.siguiente != null) {
      actual.siguiente.anterior = actual.anterior;
    } else {
      cola = actual.anterior;
    }
    tamanio--;
    return true;
  }

  public void mostrarAdelante() {
    NodoDoble<T> actual = cabeza;
    while (actual != null) {
      System.out.print(actual.dato + " ");
      actual = actual.siguiente;
    }
    System.out.println();
  }

  public void mostrarAtras() {
    NodoDoble<T> actual = cola;
    while (actual != null) {
      System.out.print(actual.dato + " ");
      actual = actual.anterior;
    }
    System.out.println();
  }

  public int tamanio() {
    return tamanio;
  }
}
