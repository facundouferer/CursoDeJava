package CursoJava.Excepciones.ProductosDeLimpieza;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class AdminDeProductos {

  public void nuevoProducto(ArrayList<Producto> productos) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Codigo:");
    int codigo = scanner.nextInt();
    System.out.print("Nombre:");
    String nombre = scanner.next();
    System.out.print("Marca:");
    String marca = scanner.next();
    System.out.print("Precio:");
    scanner.nextLine(); // limpieza de Bufer
    double precio = scanner.nextDouble();
    productos.add(new Producto(codigo, nombre, marca, precio));
    System.out.println("Producto agregado.");
    scanner.close();
  }

  public void listarProductos(ArrayList<Producto> productos) {
    for (Producto p : productos) {
      System.out.println(p);
    }
  }

  public void buscarProducto(ArrayList<Producto> productos) {

    System.out.print("Ingrese el código del producto a buscar: ");
    Scanner scanner = new Scanner(System.in);
    int codigo = scanner.nextInt();
    for (Producto p : productos) {
      if (p.getCodigo() == codigo) {
        System.out.println("Producto encontrado: " + p);
        scanner.close();
        return;
      }
    }
    System.out.println("Producto no encontrado.");
    scanner.close();
  }

  public void eliminarProducto(ArrayList<Producto> productos) {
    System.out.print("Ingrese el código del producto a eliminar: ");
    Scanner scanner = new Scanner(System.in);
    int codigo = scanner.nextInt();
    productos.removeIf(p -> p.getCodigo() == codigo);
    System.out.println("Producto eliminado si existía.");
    scanner.close();
  }

  public void actualizarProducto(ArrayList<Producto> productos) {
    System.out.print("Ingrese el código del producto a actualizar: ");
    Scanner scanner = new Scanner(System.in);
    int codigo = scanner.nextInt();
    for (Producto p : productos) {
      if (p.getCodigo() == codigo) {
        System.out.println("Nuevo Nombre:");
        String nuevoNombre = scanner.next();
        p.setNombre(nuevoNombre);
        System.out.print("Nueva marca:");
        String nuevaMarca = scanner.next();
        System.out.print("Nuevo precio:");
        double nuevoPrecio = scanner.nextDouble();
        p.setMarca(nuevaMarca);
        p.setPrecio(nuevoPrecio);
        System.out.println("Producto actualizado: " + p);
        scanner.close();
        return;
      }
    }
    System.out.println("Producto no encontrado.");
    scanner.close();
  }

  public static void main(String[] args) {

    ArrayList<Producto> productos = new ArrayList<>();
    AdminDeProductos admin = new AdminDeProductos();
    boolean error = false;
    do {
      try {
        admin.nuevoProducto(productos);
        error = false;
      } catch (InputMismatchException e) {
        System.out.println("Error al ingresar el código o el precio ");
        error = true;
      } finally {
        System.out.println("--------------------- ");
      }
    } while (error);
    admin.listarProductos(productos);
  }

}
