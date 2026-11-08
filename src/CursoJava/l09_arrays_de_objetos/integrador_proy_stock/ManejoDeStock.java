package CursoJava.l09_arrays_de_objetos.integrador_proy_stock;

/** Stock de productos en un array de objetos que crece según la necesidad. */
public class ManejoDeStock {

  private Producto[] productos = new Producto[4];
  private int cantidad;

  public void agregarProducto(Producto nuevo) {
    if (cantidad == productos.length) {
      Producto[] ampliado = new Producto[productos.length * 2];
      System.arraycopy(productos, 0, ampliado, 0, cantidad);
      productos = ampliado;
    }
    productos[cantidad++] = nuevo;
  }

  /** Devuelve la posición del producto con ese nombre, o -1 si no existe. */
  public int buscarIndice(String nombre) {
    for (int i = 0; i < cantidad; i++) {
      if (productos[i].getNombre().equals(nombre)) {
        return i;
      }
    }
    return -1;
  }

  /** Elimina el producto por nombre; devuelve false si no existe. */
  public boolean eliminarProducto(String nombre) {
    int indice = buscarIndice(nombre);
    if (indice == -1) {
      return false;
    }
    System.arraycopy(productos, indice + 1, productos, indice, cantidad - indice - 1);
    productos[--cantidad] = null;
    return true;
  }

  /** Vende unidades de un producto, mostrando un aviso si no existe o no alcanza el stock. */
  public void venderProducto(String nombre, int unidades) {
    int indice = buscarIndice(nombre);
    if (indice == -1) {
      System.out.println("El producto " + nombre + " no se encuentra en el stock.");
    } else if (productos[indice].getStock() < unidades) {
      System.out.println(
          "No hay suficiente stock para vender " + unidades + " unidades de " + nombre);
    } else {
      productos[indice].descontarStock(unidades);
    }
  }

  @Override
  public String toString() {
    StringBuilder salida = new StringBuilder();
    for (int i = 0; i < cantidad; i++) {
      salida.append(productos[i]).append('\n');
    }
    return salida.toString();
  }
}
