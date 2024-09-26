package CursoJava.Nodo;

class NodoSimple {

  int valor;
  NodoSimple siguiente;

  public NodoSimple(int valor) {
    this.valor = valor;
    this.siguiente = null;
  }

  public void NuevoNodo(int valor, NodoSimple siguiente) {
    this.valor = valor;
    this.siguiente = siguiente;
  }

}
