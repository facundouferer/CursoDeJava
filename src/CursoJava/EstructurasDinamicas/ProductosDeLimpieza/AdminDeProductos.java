package CursoJava.EstructurasDinamicas.ProductosDeLimpieza;

import java.util.ArrayList;

public class AdminDeProductos {

  public static void main(String[] args) {

    ArrayList<Producto> productos = new ArrayList<>();
    productos.add(new Producto(1001, "Detergente", "MarcaA", 150.0));
    productos.add(new Producto(1002, "Lavandina", "MarcaB", 120.0));
    productos.add(new Producto(1003, "Desinfectante", "MarcaC", 200.0));

    System.out.println("Lista de productos:");
    for (Producto p : productos) {
      System.out.println(p);
    }

    System.out.println("Buscando producto con código 1002...");

    for (Producto p : productos) {
      if (p.getCodigo() == 1002) {
        System.out.println("Producto encontrado: " + p);
      }
    }

    System.out.println("Eliminar un producto con código 1001...");
    productos.removeIf(p -> p.getCodigo() == 1001);

    System.out.println("Eliminar un producto con código 1002...");

    for (Producto p : productos) {
      if (p.getCodigo() == 1002) {
        productos.remove(p);
        break;
      }
    }

    System.out.println("Agregar un nuevo producto...");
    productos.add(new Producto(1004, "Jabón Líquido", "MarcaD", 180.0));

    for (Producto p : productos) {
      if (p.getCodigo() == 1003) {
        p.setMarca("Magistral");
        p.setPrecio(220.0);
      }
    }

    System.out.println("Lista actualizada de productos:");
    for (Producto p : productos) {
      System.out.println(p);
    }
  }

}
