/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Escribir clases genéricas propias con uno y con dos parámetros de tipo.
 * Concepto: Una clase genérica declara sus parámetros de tipo entre <>: T (type), K y V
 * (key, value). El compilador evita el casteo y rechaza tipos incorrectos.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

public class Ej20ClaseGenericaPropia {

  static class Caja<T> {
    private T contenido;

    public void guardar(T contenido) {
      this.contenido = contenido;
    }

    public T sacar() {
      return contenido;
    }
  }

  static class Par<K, V> {
    private final K clave;
    private final V valor;

    Par(K clave, V valor) {
      this.clave = clave;
      this.valor = valor;
    }

    K getClave() {
      return clave;
    }

    V getValor() {
      return valor;
    }

    @Override
    public String toString() {
      return "(" + clave + ", " + valor + ")";
    }
  }

  public static void main(String[] args) {
    Caja<String> cajaTexto = new Caja<>();
    cajaTexto.guardar("hola");
    String s = cajaTexto.sacar(); // sin casteo
    System.out.println("Caja<String>: " + s + " (longitud " + s.length() + ")");

    Caja<Integer> cajaNumero = new Caja<>();
    cajaNumero.guardar(42);
    int n = cajaNumero.sacar() + 8;
    System.out.println("Caja<Integer>: " + n);

    // cajaTexto.guardar(42); // no compila: el compilador detecta el error

    Par<String, Integer> par = new Par<>("edad", 30);
    System.out.println("Par<String, Integer>: " + par);
    System.out.println("clave = " + par.getClave() + ", valor = " + par.getValor());

    Par<Integer, Caja<String>> anidado = new Par<>(1, cajaTexto);
    System.out.println("Par anidado, contenido de la caja: " + anidado.getValor().sacar());
  }
}
