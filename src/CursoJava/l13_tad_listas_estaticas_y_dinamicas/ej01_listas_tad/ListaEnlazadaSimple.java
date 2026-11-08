package CursoJava.l13_tad_listas_estaticas_y_dinamicas.ej01_listas_tad;

/*
 * Lección 13 – TAD listas estáticas y dinámicas
 * Objetivo: implementar una lista enlazada simple genérica con referencia a la cabeza y a la cola.
 * Concepto: §4 Lista enlazada simple, paso a paso (agregarAlInicio, agregarAlFinal,
 *           recorrer y el ejercicio guiado eliminar).
 */
public class ListaEnlazadaSimple<T> {

  private Nodo<T> cabeza; // si es null, la lista está vacía
  private Nodo<T> cola; // evita recorrer toda la lista para agregar al final
  private int tamanio;

  public ListaEnlazadaSimple() {
    cabeza = null;
    cola = null;
    tamanio = 0;
  }

  public void agregarAlInicio(T dato) {
    Nodo<T> nuevo = new Nodo<>(dato);
    nuevo.siguiente = cabeza; // 1. el nodo nuevo engancha la cadena existente
    cabeza = nuevo; // 2. recién ahora la lista lo reconoce como primero
    if (cola == null) {
      cola = nuevo;
    }
    tamanio++;
  }

  public void agregarAlFinal(T dato) {
    Nodo<T> nuevo = new Nodo<>(dato);
    if (cola == null) {
      cabeza = nuevo;
    } else {
      cola.siguiente = nuevo;
    }
    cola = nuevo;
    tamanio++;
  }

  /** Elimina la primera aparición del dato. Devuelve false si no estaba. */
  public boolean eliminar(T dato) {
    if (cabeza == null) {
      return false;
    }
    if (cabeza.dato.equals(dato)) {
      cabeza = cabeza.siguiente;
      if (cabeza == null) {
        cola = null;
      }
      tamanio--;
      return true;
    }

    Nodo<T> actual = cabeza;
    while (actual.siguiente != null && !actual.siguiente.dato.equals(dato)) {
      actual = actual.siguiente;
    }
    if (actual.siguiente == null) {
      return false;
    }
    actual.siguiente = actual.siguiente.siguiente;
    if (actual.siguiente == null) {
      cola = actual; // se eliminó el último
    }
    tamanio--;
    return true;
  }

  public boolean contiene(T dato) {
    Nodo<T> actual = cabeza;
    while (actual != null) {
      if (actual.dato.equals(dato)) {
        return true;
      }
      actual = actual.siguiente;
    }
    return false;
  }

  public boolean estaVacia() {
    return cabeza == null;
  }

  public int tamanio() {
    return tamanio;
  }

  public void mostrar() {
    Nodo<T> actual = cabeza;
    while (actual != null) {
      System.out.print(actual.dato + " ");
      actual = actual.siguiente;
    }
    System.out.println();
  }
}
