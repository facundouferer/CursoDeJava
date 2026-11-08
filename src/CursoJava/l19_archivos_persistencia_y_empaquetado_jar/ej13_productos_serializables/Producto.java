package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.ej13_productos_serializables;

import java.io.Serializable;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Modelar un producto de inventario que puede guardarse en un archivo.
 * Concepto: 3. Serialización: guardar objetos enteros.
 */
public class Producto implements Serializable {

  private static final long serialVersionUID = 1L;

  private final String nombre;
  private final double precio;
  private final int cantidad;

  public Producto(String nombre, double precio, int cantidad) {
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  @Override
  public String toString() {
    return "Producto{nombre='" + nombre + "', precio=" + precio + ", cantidad=" + cantidad + "}";
  }
}
