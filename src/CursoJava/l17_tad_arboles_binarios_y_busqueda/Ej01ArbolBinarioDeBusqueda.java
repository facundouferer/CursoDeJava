package CursoJava.l17_tad_arboles_binarios_y_busqueda;

/**
 * Lección 17 – TAD Árbol: Recorridos y Árbol Binario de Búsqueda
 * Objetivo: Construir un ABB de enteros por inserción y mostrar su recorrido inorden.
 * Concepto: 4. El Árbol Binario de Búsqueda.
 */
public class Ej01ArbolBinarioDeBusqueda {

  private static class NodoArbol {
    final int valor;
    NodoArbol izquierdo;
    NodoArbol derecho;

    NodoArbol(int valor) {
      this.valor = valor;
    }
  }

  private NodoArbol raiz;

  public void insertar(int valor) {
    raiz = insertar(raiz, valor);
  }

  private NodoArbol insertar(NodoArbol nodo, int valor) {
    if (nodo == null) {
      return new NodoArbol(valor);
    }
    if (valor < nodo.valor) {
      nodo.izquierdo = insertar(nodo.izquierdo, valor);
    } else if (valor > nodo.valor) {
      nodo.derecho = insertar(nodo.derecho, valor);
    }
    // Si el valor ya existe no se hace nada: un ABB no admite duplicados.
    return nodo;
  }

  public void imprimirEnOrden() {
    imprimirEnOrden(raiz);
  }

  private void imprimirEnOrden(NodoArbol nodo) {
    if (nodo != null) {
      imprimirEnOrden(nodo.izquierdo);
      System.out.print(nodo.valor + " ");
      imprimirEnOrden(nodo.derecho);
    }
  }

  public static void main(String[] args) {
    Ej01ArbolBinarioDeBusqueda arbol = new Ej01ArbolBinarioDeBusqueda();
    for (int valor : new int[] {50, 30, 70, 20, 40, 60, 80}) {
      arbol.insertar(valor);
    }

    System.out.println("Árbol en orden:");
    arbol.imprimirEnOrden();
  }
}
