package CursoJava.l26_arboles_n_arios_y_representacion_con_vectores;

import java.util.ArrayList;
import java.util.List;

/**
 * Lección 26 – Árboles N-arios y representación con vectores
 * Objetivo: Construir un árbol n-ario de enteros y recorrerlo, buscar un valor y calcular su altura y suma.
 * Concepto: 1. Vocabulario e invariantes (raíz, hijos, hojas, altura y recorrido en preorden).
 */
public class Ej01ArbolNario {

  /** Nodo con cero o más hijos, mantenidos en orden de izquierda a derecha. */
  static class NodoNario {
    private final int valor;
    private final List<NodoNario> hijos = new ArrayList<>();

    NodoNario(int valor) {
      this.valor = valor;
    }

    NodoNario agregarHijo(NodoNario hijo) {
      if (hijo == null) {
        throw new IllegalArgumentException("Un hijo no puede ser null");
      }
      hijos.add(hijo);
      return hijo;
    }

    /** Preorden: primero el nodo y luego cada subárbol hijo. */
    void imprimirPreorden() {
      System.out.print(valor + " ");
      for (NodoNario hijo : hijos) {
        hijo.imprimirPreorden();
      }
    }

    /** Posorden: primero los subárboles hijos y al final el nodo. */
    void imprimirPosorden() {
      for (NodoNario hijo : hijos) {
        hijo.imprimirPosorden();
      }
      System.out.print(valor + " ");
    }

    /** Altura: cantidad de aristas del camino descendente más largo (una hoja tiene altura 0). */
    int altura() {
      int alturaMaxima = -1;
      for (NodoNario hijo : hijos) {
        alturaMaxima = Math.max(alturaMaxima, hijo.altura());
      }
      return alturaMaxima + 1;
    }

    boolean buscar(int valorBuscado) {
      if (valor == valorBuscado) {
        return true;
      }
      for (NodoNario hijo : hijos) {
        if (hijo.buscar(valorBuscado)) {
          return true;
        }
      }
      return false;
    }

    int sumarValores() {
      int suma = valor;
      for (NodoNario hijo : hijos) {
        suma += hijo.sumarValores();
      }
      return suma;
    }
  }

  public static void main(String[] args) {
    NodoNario raiz = new NodoNario(1);

    NodoNario hijo1 = raiz.agregarHijo(new NodoNario(2));
    NodoNario hijo2 = raiz.agregarHijo(new NodoNario(3));
    NodoNario hijo3 = raiz.agregarHijo(new NodoNario(4));

    hijo1.agregarHijo(new NodoNario(5));
    hijo1.agregarHijo(new NodoNario(6));
    hijo2.agregarHijo(new NodoNario(7));
    hijo3.agregarHijo(new NodoNario(8));
    hijo3.agregarHijo(new NodoNario(9));
    hijo3.agregarHijo(new NodoNario(10));

    System.out.print("Recorrido en preorden: ");
    raiz.imprimirPreorden(); // 1 2 5 6 3 7 4 8 9 10
    System.out.println();

    System.out.print("Recorrido en posorden: ");
    raiz.imprimirPosorden(); // 5 6 2 7 3 8 9 10 4 1
    System.out.println();

    System.out.println("Altura del árbol: " + raiz.altura());

    int valorBuscado = 9;
    if (raiz.buscar(valorBuscado)) {
      System.out.println("El valor " + valorBuscado + " está en el árbol.");
    } else {
      System.out.println("El valor " + valorBuscado + " no está en el árbol.");
    }

    System.out.println("La suma de todos los valores en el árbol es: " + raiz.sumarValores());
  }
}
