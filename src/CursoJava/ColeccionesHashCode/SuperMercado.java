package CursoJava.ColeccionesHashCode;

import java.util.HashSet;
import java.util.Set;

class SuperMercado {

  public static void main(String[] args) {

    Producto producto1 = new Producto(1, 10, "Manzanas");
    Producto producto2 = new Producto(5, 20, "Naranjas");
    Producto producto3 = new Producto(1, 15, "Peras");
    Producto producto4 = new Producto(4, 12, "Bananas");

    Administrador supermercado = new Administrador();

    supermercado.agregarProducto(producto1);
    supermercado.agregarProducto(producto2);
    supermercado.agregarProducto(producto3);
    supermercado.agregarProducto(producto4);

    supermercado.listarProductos();

    Producto producto5 = new Producto(4, 12, "Ananá");
    System.out.println(supermercado.buscarProducto(producto5));
  }
}

class Producto {
  private int codProducto;
  private int strock;
  private String nombre;

  public Producto(int codProducto, int strock, String nombre) {
    this.codProducto = codProducto;
    this.strock = strock;
    this.nombre = nombre;
  }

  public int getCodProducto() {
    return codProducto;
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(codProducto);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Producto producto = (Producto) obj;
    return codProducto == producto.getCodProducto();
  }

  public String toString() {
    return "\ncodProducto=" + codProducto +
        ", strock=" + strock +
        ", nombre='" + nombre + '\'';
  }

}

class Administrador {

  Set<Producto> listaDeProductos;

  public Administrador() {
    this.listaDeProductos = new HashSet<Producto>();
  }

  public void agregarProducto(Producto productoNuevo) {
    if (listaDeProductos.add(productoNuevo)) {
      System.out.println("Producto agregado");
    } else {
      System.out.println("Ya existe un producto con ese código");
    }
  }

  public String buscarProducto(Producto buscado) {
    return "Respuesta: " + listaDeProductos.contains(buscado);
  }

  public void listarProductos() {
    System.out.println(listaDeProductos.toString());
  }

}
