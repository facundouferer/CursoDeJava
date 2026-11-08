/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Modelar un producto de limpieza identificado por su código.
 * Concepto: Familia List: elemento con equals y hashCode coherentes por código.
 */
package CursoJava.l15_java_collections_framework_y_genericos.ej05_productos_de_limpieza;

import java.util.Objects;

public class Producto {
  private final int codigo;
  private final String nombre;
  private String marca;
  private double precio;

  public Producto(int codigo, String nombre, String marca, double precio) {
    this.codigo = codigo;
    this.nombre = nombre;
    this.marca = marca;
    this.precio = precio;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    return codigo == ((Producto) obj).codigo;
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo);
  }

  @Override
  public String toString() {
    return codigo + "\t" + nombre + "\t" + marca + "\t$ " + precio;
  }
}
