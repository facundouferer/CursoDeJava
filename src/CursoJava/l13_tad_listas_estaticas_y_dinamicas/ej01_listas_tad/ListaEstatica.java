package CursoJava.l13_tad_listas_estaticas_y_dinamicas.ej01_listas_tad;

/*
 * Lección 13 – TAD listas estáticas y dinámicas
 * Objetivo: implementar una lista de enteros de capacidad fija sobre un arreglo.
 * Concepto: §2 Dos formas de guardar lo mismo (lista estática: memoria contigua;
 *           obtener(i) es inmediato, pero eliminar obliga a desplazar elementos).
 */
public class ListaEstatica {

  private final int[] datos;
  private int tamanio;

  public ListaEstatica(int capacidad) {
    datos = new int[capacidad];
    tamanio = 0;
  }

  /** Devuelve false si la lista está llena. */
  public boolean agregar(int valor) {
    if (tamanio >= datos.length) {
      return false;
    }
    datos[tamanio++] = valor;
    return true;
  }

  /** Devuelve false si la posición no existe. */
  public boolean eliminarEn(int indice) {
    if (indice < 0 || indice >= tamanio) {
      return false;
    }
    for (int i = indice; i < tamanio - 1; i++) {
      datos[i] = datos[i + 1]; // desplaza a la izquierda
    }
    tamanio--;
    return true;
  }

  public int obtener(int indice) {
    if (indice < 0 || indice >= tamanio) {
      throw new IndexOutOfBoundsException("Posición inexistente: " + indice);
    }
    return datos[indice];
  }

  public int tamanio() {
    return tamanio;
  }

  public boolean estaVacia() {
    return tamanio == 0;
  }

  public void mostrar() {
    for (int i = 0; i < tamanio; i++) {
      System.out.print(datos[i] + " ");
    }
    System.out.println();
  }
}
