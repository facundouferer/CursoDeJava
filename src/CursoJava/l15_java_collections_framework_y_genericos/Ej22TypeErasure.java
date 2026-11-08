/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Demostrar que los genéricos existen solo en tiempo de compilación.
 * Concepto: Type erasure (borrado de tipos): en ejecución List<String> y List<Integer> son la
 * misma clase, y por eso no se puede hacer new T[10] ni instanceof List<String>.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.ArrayList;
import java.util.List;

public class Ej22TypeErasure {

  static class Caja<T> {
    private T contenido;

    void guardar(T contenido) {
      this.contenido = contenido;
    }

    T sacar() {
      return contenido;
    }
  }

  @SuppressWarnings({ "unchecked", "rawtypes" })
  public static void main(String[] args) {
    List<String> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();
    System.out.println("a.getClass() == b.getClass(): " + (a.getClass() == b.getClass()));
    System.out.println("Clase en ejecución: " + a.getClass().getName());

    // T[] arreglo = new T[10]; // no se puede: en ejecución no se sabe qué es T
    // if (a instanceof List<String>) // tampoco: el tipo genérico ya no existe

    // Un tipo sin parámetro (raw) deja pasar lo que el compilador normalmente impediría
    List crudo = a;
    crudo.add(123); // el compilador ya no controla el tipo
    System.out.println("\nList<String> con un Integer adentro: " + a);
    try {
      String texto = a.get(0); // el casteo implícito a String falla recién acá
      System.out.println(texto);
    } catch (ClassCastException e) {
      System.out.println("ClassCastException al leer como String");
    }

    Caja<String> caja = new Caja<>();
    caja.guardar("hola");
    System.out.println("\nCaja<String>.sacar() = " + caja.sacar());
    System.out.println("Campo 'contenido' en el bytecode: " + tipoDelCampo());
  }

  private static String tipoDelCampo() {
    try {
      return Caja.class.getDeclaredField("contenido").getType().getSimpleName() + " (T se borró a Object)";
    } catch (NoSuchFieldException e) {
      return "no encontrado";
    }
  }
}
