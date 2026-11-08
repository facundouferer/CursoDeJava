package CursoJava.l09_arrays_de_objetos.integrador_proy_stock;

import java.util.Scanner;

/** Menú y entrada de datos por consola del manejo de stock. */
public final class TuiManager {

  private TuiManager() {
  }

  public static void menu() {
    System.out.println("-----MENU PRINCIPAL------");
    System.out.println("1- Agregar productos");
    System.out.println("2- Eliminar productos");
    System.out.println("3- Vender productos");
    System.out.println("4- Listar productos");
    System.out.println("0- Salir");
  }

  public static void agregarProducto(ManejoDeStock stock, Scanner scanner) {
    System.out.print("Ingrese el nombre del producto: ");
    String nombre = scanner.nextLine();
    double precio = leerDecimal(scanner, "Ingrese el precio: ");
    int stockInicial = leerEntero(scanner, "Ingrese el stock inicial: ");
    stock.agregarProducto(new Producto(nombre, precio, stockInicial));
    System.out.println("¡Producto agregado con éxito!");
  }

  public static void eliminarProducto(ManejoDeStock stock, Scanner scanner) {
    System.out.print("Ingrese el nombre del producto a eliminar: ");
    String nombre = scanner.nextLine();
    if (stock.eliminarProducto(nombre)) {
      System.out.println("¡Producto eliminado con éxito!");
    } else {
      System.out.println("El producto " + nombre + " no se encuentra en el stock.");
    }
  }

  public static void venderProducto(ManejoDeStock stock, Scanner scanner) {
    System.out.print("Ingrese el nombre del producto a vender: ");
    String nombre = scanner.nextLine();
    int unidades = leerEntero(scanner, "Ingrese la cantidad a vender: ");
    stock.venderProducto(nombre, unidades);
  }

  public static void listarProductos(ManejoDeStock stock) {
    System.out.println("Listado de productos:");
    System.out.println(stock);
  }

  /** Lee un entero; repite la consulta mientras el texto ingresado no sea válido. */
  public static int leerEntero(Scanner scanner, String mensaje) {
    while (true) {
      System.out.print(mensaje);
      try {
        return Integer.parseInt(scanner.nextLine().trim());
      } catch (NumberFormatException e) {
        System.out.println("Ingrese un número entero válido.");
      }
    }
  }

  private static double leerDecimal(Scanner scanner, String mensaje) {
    while (true) {
      System.out.print(mensaje);
      try {
        return Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));
      } catch (NumberFormatException e) {
        System.out.println("Ingrese un número válido.");
      }
    }
  }
}
