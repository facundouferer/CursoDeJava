package CursoJava.Arbol;

import java.util.ArrayList;
import java.util.List;

class NodoNarioArbol {
  int valor;
  List<NodoNario> hijos;

  // Constructor para crear un nodo con un valor.
  public NodoNarioArbol(int valor) {
    this.valor = valor;
    this.hijos = new ArrayList<>();
  }

  // Método para agregar un hijo a este nodo.
  public void agregarHijo(NodoNario hijo) {
    hijos.add(hijo);
  }

  // Método recursivo para imprimir el árbol en preorden (raíz, hijos).
  public void imprimirPreorden() {
    System.out.print(valor + " ");
    for (NodoNario hijo : hijos) {
      hijo.imprimirPreorden();
    }
  }
}

public class ArbolNario {
  public static void main(String[] args) {
    // Crear un árbol N-ario con la raíz
    NodoNario raiz = new NodoNario(1);

    // Crear hijos de la raíz
    NodoNario hijo1 = new NodoNario(2);
    NodoNario hijo2 = new NodoNario(3);
    NodoNario hijo3 = new NodoNario(4);

    // Agregar hijos a la raíz
    raiz.agregarHijo(hijo1);
    raiz.agregarHijo(hijo2);
    raiz.agregarHijo(hijo3);

    // Agregar nietos (hijos de los hijos)
    hijo1.agregarHijo(new NodoNario(5));
    hijo1.agregarHijo(new NodoNario(6));
    hijo2.agregarHijo(new NodoNario(7));
    hijo3.agregarHijo(new NodoNario(8));
    hijo3.agregarHijo(new NodoNario(9));
    hijo3.agregarHijo(new NodoNario(10));

    // Imprimir el árbol en preorden
    System.out.print("Recorrido en preorden: ");
    raiz.imprimirPreorden(); // Salida: 1 2 5 6 3 7 4 8 9 10
  }
}
