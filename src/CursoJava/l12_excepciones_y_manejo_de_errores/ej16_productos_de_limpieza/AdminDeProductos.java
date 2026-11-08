package CursoJava.l12_excepciones_y_manejo_de_errores.ej16_productos_de_limpieza;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: administrar una lista de productos de limpieza leyendo los datos por teclado.
 * Concepto: §3 Checked vs unchecked (InputMismatchException sube hasta quien sabe reintentar).
 *
 * Usa un único Scanner recibido por parámetro: cerrar un Scanner de System.in
 * cierra la entrada estándar para todo el programa.
 */
public class AdminDeProductos {

  private final Scanner leer;

  public AdminDeProductos(Scanner leer) {
    this.leer = leer;
  }

  public void nuevoProducto(ArrayList<Producto> productos) {
    System.out.print("Código: ");
    int codigo = leer.nextInt();
    System.out.print("Nombre: ");
    String nombre = leer.next();
    System.out.print("Marca: ");
    String marca = leer.next();
    System.out.print("Precio: ");
    double precio = leer.nextDouble();

    productos.add(new Producto(codigo, nombre, marca, precio));
    System.out.println("Producto agregado.");
  }

  public void listarProductos(ArrayList<Producto> productos) {
    for (Producto producto : productos) {
      System.out.println(producto);
    }
  }

  public void buscarProducto(ArrayList<Producto> productos) {
    System.out.print("Ingrese el código del producto a buscar: ");
    int codigo = leer.nextInt();
    for (Producto producto : productos) {
      if (producto.getCodigo() == codigo) {
        System.out.println("Producto encontrado: " + producto);
        return;
      }
    }
    System.out.println("Producto no encontrado.");
  }

  public void eliminarProducto(ArrayList<Producto> productos) {
    System.out.print("Ingrese el código del producto a eliminar: ");
    int codigo = leer.nextInt();
    boolean eliminado = productos.removeIf(producto -> producto.getCodigo() == codigo);
    System.out.println(eliminado ? "Producto eliminado." : "Producto no encontrado.");
  }

  public void actualizarProducto(ArrayList<Producto> productos) {
    System.out.print("Ingrese el código del producto a actualizar: ");
    int codigo = leer.nextInt();
    for (Producto producto : productos) {
      if (producto.getCodigo() == codigo) {
        System.out.print("Nuevo nombre: ");
        producto.setNombre(leer.next());
        System.out.print("Nueva marca: ");
        producto.setMarca(leer.next());
        System.out.print("Nuevo precio: ");
        producto.setPrecio(leer.nextDouble());
        System.out.println("Producto actualizado: " + producto);
        return;
      }
    }
    System.out.println("Producto no encontrado.");
  }
}
