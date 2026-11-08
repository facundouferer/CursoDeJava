/*
 * Integrador – Parcial 2 Programación II (Lección 17 – TAD Árbol: recorridos y árbol binario de búsqueda)
 * Enunciado: Dado un árbol binario de búsqueda, determinar si cada valor de una lista (7, 12, 1 y
 *            10) se encuentra en el árbol.
 * Concepto: 4. El Árbol Binario de Búsqueda y búsqueda recursiva.
 */
package CursoJava.l17_tad_arboles_binarios_y_busqueda.integrador_p1_arbol_binario;

public class BusquedaEnArbol {
  public static void main(String[] args) {
    NodoArbol raiz = new NodoArbol(10);
    raiz.izquierdo = new NodoArbol(5);
    raiz.derecho = new NodoArbol(15);
    raiz.izquierdo.izquierdo = new NodoArbol(2);
    raiz.izquierdo.derecho = new NodoArbol(7);
    raiz.derecho.izquierdo = new NodoArbol(12);
    raiz.derecho.derecho = new NodoArbol(20);

    int[] clavesABuscar = {7, 12, 1, 10};
    for (int clave : clavesABuscar) {
      String resultado = ArbolBinario.buscar(raiz, clave) ? "se encuentra" : "NO se encuentra";
      System.out.println("El valor " + clave + " " + resultado + " en el árbol.");
    }
  }
}
