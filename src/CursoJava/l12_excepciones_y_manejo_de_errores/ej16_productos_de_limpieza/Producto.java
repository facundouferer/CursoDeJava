package CursoJava.l12_excepciones_y_manejo_de_errores.ej16_productos_de_limpieza;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: representar un producto de limpieza identificado por su código.
 * Concepto: §10 Ejercicio práctico guiado (clase de dominio que carga AdminDeProductos).
 */
public class Producto {

  private final int codigo;
  private String nombre;
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

  public void setNombre(String nombre) {
    this.nombre = nombre;
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
    Producto otro = (Producto) obj;
    return codigo == otro.codigo;
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(codigo);
  }

  @Override
  public String toString() {
    return codigo + "\t" + nombre + "\t" + marca + "\t$ " + precio;
  }
}
