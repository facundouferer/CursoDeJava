package CursoJava.l13_tad_listas_estaticas_y_dinamicas.ej01_listas_tad;

/*
 * Lección 13 – TAD listas estáticas y dinámicas
 * Objetivo: implementar una lista circular donde el último nodo apunta al primero.
 * Concepto: §5 Variantes: doble y circular (se guarda solo la cola: cola.siguiente es la cabeza).
 */
public class ListaCircular<T> {

  private Nodo<T> cola; // si es null, la lista está vacía
  private int tamanio;

  public void agregarAlFinal(T dato) {
    agregarAlInicio(dato);
    cola = cola.siguiente; // el nodo recién insertado pasa a ser la cola
  }

  public void agregarAlInicio(T dato) {
    Nodo<T> nuevo = new Nodo<>(dato);
    if (cola == null) {
      nuevo.siguiente = nuevo; // un único nodo se apunta a sí mismo
      cola = nuevo;
    } else {
      nuevo.siguiente = cola.siguiente; // cola.siguiente es la cabeza
      cola.siguiente = nuevo;
    }
    tamanio++;
  }

  public void mostrar() {
    if (cola == null) {
      System.out.println("vacía");
      return;
    }
    Nodo<T> actual = cola.siguiente; // cabeza
    do {
      System.out.print(actual.dato + " ");
      actual = actual.siguiente;
    } while (actual != cola.siguiente);
    System.out.println();
  }

  public int tamanio() {
    return tamanio;
  }
}
