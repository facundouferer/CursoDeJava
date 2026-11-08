package CursoJava.l09_arrays_de_objetos.integrador_proy_stock;

/** Producto del stock con su precio y cantidad disponible. */
public class Producto {

  private final String nombre;
  private final double precio;
  private int stock;

  public Producto(String nombre, double precio, int stock) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
  }

  public String getNombre() {
    return nombre;
  }

  public int getStock() {
    return stock;
  }

  /** Descuenta del stock la cantidad vendida. */
  public void descontarStock(int cantidad) {
    this.stock -= cantidad;
  }

  @Override
  public String toString() {
    return stock + " " + nombre + " $" + precio;
  }
}
