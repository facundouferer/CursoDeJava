package CursoJava.l15_java_collections_framework_y_genericos.integrador_p1_heladera;

import java.util.ArrayList;
import java.util.List;

public class AdministradorHeladera {
  private final List<Producto> productos = new ArrayList<>();

  public void agregarProducto(Producto producto) {
    productos.add(producto);
  }

  public void removerProducto(Producto producto) {
    productos.remove(producto);
  }

  // Descuenta la cantidad consumida; si se agota el producto, lo quita de la heladera.
  public void consumirProducto(Producto producto, int cantidadConsumida) {
    if (!productos.contains(producto)) {
      return;
    }
    int cantidadActual = producto.getCantidad();
    if (cantidadConsumida >= cantidadActual) {
      removerProducto(producto);
    } else {
      producto.setCantidad(cantidadActual - cantidadConsumida);
    }
  }

  public void modificarProducto(Producto producto, String nuevoNombre, int nuevaCantidad,
      String nuevaMarca) {
    if (productos.contains(producto)) {
      producto.setNombre(nuevoNombre);
      producto.setCantidad(nuevaCantidad);
      producto.setMarca(nuevaMarca);
    }
  }

  public void listarProductos() {
    System.out.println("Productos en la heladera:");
    for (Producto producto : productos) {
      System.out.println(producto);
    }
    System.out.println("Total de productos: " + productos.size());
  }

  public int getCantidadTotalProductos() {
    return productos.size();
  }
}
