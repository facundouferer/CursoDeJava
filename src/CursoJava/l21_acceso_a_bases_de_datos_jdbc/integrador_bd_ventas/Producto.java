package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_ventas;

/** Producto en stock con su precio por unidad. */
public class Producto {

  private final int productoId;
  private final String nombre;
  private final double precioPorUnidad;
  private final int stock;

  public Producto(int productoId, String nombre, double precioPorUnidad, int stock) {
    this.productoId = productoId;
    this.nombre = nombre;
    this.precioPorUnidad = precioPorUnidad;
    this.stock = stock;
  }

  @Override
  public String toString() {
    return "Producto{productoId=" + productoId + ", nombre='" + nombre + "', precioPorUnidad="
        + precioPorUnidad + ", stock=" + stock + "}";
  }
}
