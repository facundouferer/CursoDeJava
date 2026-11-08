package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.ej04_supermercado;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Modelar un producto cuya identidad es su código.
 * Concepto: 6. hashCode: el que rompe todo cuando falta.
 */
public class Producto {
  private final int codigo;
  private final int stock;
  private final String nombre;

  public Producto(int codigo, int stock, String nombre) {
    this.codigo = codigo;
    this.stock = stock;
    this.nombre = nombre;
  }

  public int getCodigo() {
    return codigo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return codigo == ((Producto) o).codigo;
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(codigo);
  }

  @Override
  public String toString() {
    return "\ncodigo=" + codigo + ", stock=" + stock + ", nombre='" + nombre + "'";
  }
}
