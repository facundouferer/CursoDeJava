package CursoJava.Arbol;

import java.util.ArrayList;
import java.util.List;

// Clase que representa un nodo del árbol N-ario
class NodoNario {
  int valor;
  List<NodoNario> hijos;

  // Constructor para inicializar un nodo con un valor
  public NodoNario(int valor) {
    this.valor = valor;
    this.hijos = new ArrayList<>();
  }

  // Método para agregar un hijo al nodo
  public void agregarHijo(NodoNario hijo) {
    hijos.add(hijo);
  }

  // Recorrido en preorden (padre, luego hijos)
  public void imprimirPreorden() {
    System.out.print(valor + " ");
    for (NodoNario hijo : hijos) {
      hijo.imprimirPreorden();
    }
  }

  // Recorrido en posorden (hijos, luego padre)
  public void imprimirPosorden() {
    for (NodoNario hijo : hijos) {
      hijo.imprimirPosorden();
    }
    System.out.print(valor + " ");
  }

  // Calcular la altura del árbol
  public int altura() {
    if (hijos.isEmpty()) {
      return 1; // Un nodo sin hijos tiene altura 1
    }
    int alturaMax = 0;
    for (NodoNario hijo : hijos) {
      alturaMax = Math.max(alturaMax, hijo.altura());
    }
    return alturaMax + 1;
  }

  // Buscar un valor en el árbol
  public boolean buscar(int valorBuscado) {
    if (this.valor == valorBuscado) {
      return true;
    }
    for (NodoNario hijo : hijos) {
      if (hijo.buscar(valorBuscado)) {
        return true;
      }
    }
    return false;
  }
}

public class ArbolNarioOperaciones {
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
    System.out.println();

    // Imprimir el árbol en posorden
    System.out.print("Recorrido en posorden: ");
    raiz.imprimirPosorden(); // Salida: 5 6 2 7 3 8 9 10 4 1
    System.out.println();

    // Calcular e imprimir la altura del árbol
    System.out.println("Altura del árbol: " + raiz.altura()); // Salida: 3

    // Buscar un valor en el árbol
    int valorBuscado = 9;
    if (raiz.buscar(valorBuscado)) {
      System.out.println("El valor " + valorBuscado + " está en el árbol."); // Salida: El valor 9 está en el árbol.
    } else {
      System.out.println("El valor " + valorBuscado + " no está en el árbol.");
    }
  }
}

/**
 * Clase NodoNario:
 * 
 * Contiene un valor entero y una lista de nodos hijos.
 * 
 * agregarHijo(NodoNario hijo): Agrega un hijo a la lista de hijos.
 * 
 * imprimirPreorden(): Recorre el árbol en preorden, es decir, primero imprime
 * el nodo actual y luego recorre recursivamente los hijos.
 * 
 * imprimirPosorden(): Recorre el árbol en posorden, es decir, primero recorre
 * recursivamente los hijos y luego imprime el nodo actual.
 * 
 * altura(): Calcula la altura del árbol de forma recursiva. La altura de un
 * nodo es 1 más la altura del hijo más alto.
 * 
 * buscar(int valorBuscado): Busca un valor en el árbol de forma recursiva.
 * Devuelve true si el valor se encuentra en algún nodo, y false en caso
 * contrario.
 * 
 * Clase ArbolNarioOperaciones:
 * 
 * Se construye un árbol con varios nodos y relaciones entre ellos.
 * 
 * Se realizan tres operaciones principales:
 * 
 * Recorrido en preorden.
 * Recorrido en posorden.
 * Cálculo de la altura del árbol.
 * 
 * Búsqueda de un valor específico en el árbol.
 * 
 */