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

  // Sumar los valores de todos los nodos del árbol
  public int sumarValores() {
    int suma = valor;
    for (NodoNario hijo : hijos) {
      suma += hijo.sumarValores();
    }
    return suma;
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

    // Buscar un valor en el árbol
    int valorBuscado = 9;
    boolean encontrado = raiz.buscar(valorBuscado);
    if (encontrado) {
      System.out.println("El valor " + valorBuscado + " está en el árbol.");
    } else {
      System.out.println("El valor " + valorBuscado + " no está en el árbol.");
    }

    // Sumar los valores de todos los nodos del árbol
    int sumaValores = raiz.sumarValores();
    System.out.println("La suma de todos los valores en el árbol es: " + sumaValores);
  }
}