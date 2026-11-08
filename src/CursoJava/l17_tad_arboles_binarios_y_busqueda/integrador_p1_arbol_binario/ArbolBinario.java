package CursoJava.l17_tad_arboles_binarios_y_busqueda.integrador_p1_arbol_binario;

public final class ArbolBinario {
  private ArbolBinario() {
  }

  // Recorrido inorden: subárbol izquierdo, nodo actual, subárbol derecho.
  public static void recorrerEnOrden(NodoArbol nodo) {
    if (nodo == null) {
      return;
    }
    recorrerEnOrden(nodo.izquierdo);
    System.out.print(nodo.valor + " ");
    recorrerEnOrden(nodo.derecho);
  }

  // Búsqueda en un árbol binario de búsqueda: descarta un subárbol en cada paso.
  public static boolean buscar(NodoArbol nodo, int clave) {
    if (nodo == null) {
      return false;
    }
    if (nodo.valor == clave) {
      return true;
    }
    return clave < nodo.valor ? buscar(nodo.izquierdo, clave) : buscar(nodo.derecho, clave);
  }
}
