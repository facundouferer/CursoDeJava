package CursoJava.Arbol;

public class ArbolBinario {
  Nodo raiz;

  public ArbolBinario() {
    raiz = null;
  }

  // Método para insertar un nuevo valor en el árbol
  public void insertar(int valor) {
    raiz = insertarRecursivo(raiz, valor);
  }

  // Método auxiliar recursivo para insertar un valor en el árbol
  private Nodo insertarRecursivo(Nodo raiz, int valor) {
    if (raiz == null) {
      return new Nodo(valor);
    }

    if (valor < raiz.valor) {
      raiz.izquierdo = insertarRecursivo(raiz.izquierdo, valor);
    } else if (valor > raiz.valor) {
      raiz.derecho = insertarRecursivo(raiz.derecho, valor);
    }

    return raiz;
  }

  // Método para imprimir el árbol en orden
  public void imprimirEnOrden() {
    imprimirEnOrdenRecursivo(raiz);
  }

  // Método auxiliar recursivo para imprimir el árbol en orden
  private void imprimirEnOrdenRecursivo(Nodo nodo) {
    if (nodo != null) {
      imprimirEnOrdenRecursivo(nodo.izquierdo);
      System.out.print(nodo.valor + " ");
      imprimirEnOrdenRecursivo(nodo.derecho);
    }
  }

  public static void main(String[] args) {
    ArbolBinario arbol = new ArbolBinario();
    arbol.insertar(50);
    arbol.insertar(30);
    arbol.insertar(70);
    arbol.insertar(20);
    arbol.insertar(40);
    arbol.insertar(60);
    arbol.insertar(80);

    System.out.println("Árbol en orden:");
    arbol.imprimirEnOrden();
  }
}

class Nodo {
  int valor;
  Nodo izquierdo;
  Nodo derecho;

  public Nodo(int valor) {
    this.valor = valor;
    this.izquierdo = null;
    this.derecho = null;
  }
}
