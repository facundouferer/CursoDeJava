package CursoJava.Arbol.CursoJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Nodo {
  int valor;
  List<Nodo> conexiones;

  public Nodo(int valor) {
    this.valor = valor;
    this.conexiones = new ArrayList<>();
  }

  public void agregarConexion(Nodo nodo) {
    conexiones.add(nodo);
  }

  @Override
  public String toString() {
    return valor + "(" + conexiones.size() + ")";
  }

  public void imprimirPreorden() {
    System.out.print(valor + " ");
    for (Nodo conexion : conexiones) {
      conexion.imprimirPreorden();
    }
  }

}

class Grafo {
  List<Nodo> nodos;

  public Grafo() {
    this.nodos = new ArrayList<>();
  }

  public void agregarNodo(Nodo nodo) {
    nodos.add(nodo);
  }

  public void crearGrafo() {
    Scanner scanner = new Scanner(System.in);
    List<Nodo> lista = new ArrayList<>();

    System.out.print("Valor del nodo inicial: ");
    int valorInicial = scanner.nextInt();
    Nodo nodoInicial = new Nodo(valorInicial);
    agregarNodo(nodoInicial);
    lista.add(nodoInicial);

    int index = 0;
    while (index < lista.size()) {
      Nodo nodoActual = lista.get(index);
      System.out.print("cantidad de nodos de " + nodoActual.valor + ": ");
      int cantidadConexiones = scanner.nextInt();

      for (int i = 0; i < cantidadConexiones; i++) {
        System.out.print(nodoActual.valor + ") Valor del nodo conectado " + (i + 1) + ": ");
        int valorConexion = scanner.nextInt();
        Nodo nodoConexion = new Nodo(valorConexion);
        nodoActual.agregarConexion(nodoConexion);
        agregarNodo(nodoConexion);
        lista.add(nodoConexion);
      }
      index++;
    }
  }

  public void imprimirGrafo() {
    if (!nodos.isEmpty()) {
      Nodo raiz = nodos.get(0); // Asumimos que el primer nodo agregado es la raíz
      imprimirEstructura(raiz, "", true);
    }
  }

  private void imprimirEstructura(Nodo nodo, String prefijo, boolean esUltimo) {
    // Imprime el nodo actual
    System.out.println(prefijo + (esUltimo ? "└── " : "├── ") + nodo.valor);

    // Prefijo adicional para las conexiones
    String nuevoPrefijo = prefijo + (esUltimo ? "    " : "│   ");

    // Recorre las conexiones del nodo
    for (int i = 0; i < nodo.conexiones.size(); i++) {
      Nodo conexion = nodo.conexiones.get(i);
      boolean esUltimaConexion = i == nodo.conexiones.size() - 1;
      imprimirEstructura(conexion, nuevoPrefijo, esUltimaConexion);
    }
  }

}

public class Grafos {
  public static void main(String[] args) {
    Grafo grafo = new Grafo();
    grafo.crearGrafo();
    System.out.println("Estructura del grafo:");
    grafo.imprimirGrafo();
  }
}