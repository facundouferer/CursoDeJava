/*
 * Integrador – Parcial 2 Programación II (Lección 17 – TAD Árbol: recorridos y árbol binario de búsqueda)
 * Enunciado: Construir un árbol binario con los valores 20, 10, 30 y 15 y mostrar su recorrido en
 *            orden (inorden).
 * Concepto: 4. El Árbol Binario de Búsqueda y recorridos recursivos.
 */
package CursoJava.l17_tad_arboles_binarios_y_busqueda.integrador_p1_arbol_binario;

public class RecorridoEnOrden {
  public static void main(String[] args) {
    NodoArbol raiz = new NodoArbol(20);
    raiz.izquierdo = new NodoArbol(10);
    raiz.derecho = new NodoArbol(30);
    raiz.izquierdo.derecho = new NodoArbol(15);

    System.out.println("Recorrido en orden:");
    ArbolBinario.recorrerEnOrden(raiz);
    System.out.println();
  }
}
