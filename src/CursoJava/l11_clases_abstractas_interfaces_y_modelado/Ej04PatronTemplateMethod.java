/*
 * Lección 11 – Clases abstractas, interfaces y modelado
 * Objetivo: Preparar un té y un café siguiendo los mismos pasos de la cocina.
 * Concepto: Clase abstracta con un método plantilla (Template Method) que fija el algoritmo
 *           y delega los pasos variables en las subclases.
 */
package CursoJava.l11_clases_abstractas_interfaces_y_modelado;

public class Ej04PatronTemplateMethod {

  abstract static class BebidaCaliente {
    // Método plantilla: define el orden y no puede ser sobrescrito.
    public final void prepararBebida() {
      hervirAgua();
      prepararIngrediente();
      verterEnTaza();
      agregarCondimentos();
    }

    // Pasos que cada bebida resuelve a su manera.
    protected abstract void prepararIngrediente();

    protected abstract void agregarCondimentos();

    // Pasos comunes, ya resueltos.
    protected void hervirAgua() {
      System.out.println("Hirviendo agua.");
    }

    protected void verterEnTaza() {
      System.out.println("Vertiendo en la taza.");
    }
  }

  static class Te extends BebidaCaliente {
    @Override
    protected void prepararIngrediente() {
      System.out.println("Colocando una bolsita de té.");
    }

    @Override
    protected void agregarCondimentos() {
      System.out.println("Agregando limón.");
    }
  }

  static class Cafe extends BebidaCaliente {
    @Override
    protected void prepararIngrediente() {
      System.out.println("Moliendo granos de café.");
    }

    @Override
    protected void agregarCondimentos() {
      System.out.println("Agregando azúcar y leche.");
    }
  }

  public static void main(String[] args) {
    System.out.println("Preparando té:");
    BebidaCaliente te = new Te();
    te.prepararBebida();

    System.out.println("\nPreparando café:");
    BebidaCaliente cafe = new Cafe();
    cafe.prepararBebida();
  }
}
