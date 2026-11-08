/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Administrar el inventario de productos de limpieza (alta, búsqueda, baja y modificación).
 * Concepto: Familia List: removeIf, remove y recorrido sobre una List<Producto>.
 */
package CursoJava.l15_java_collections_framework_y_genericos.ej05_productos_de_limpieza;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Producto> productos = new ArrayList<>();
    productos.add(new Producto(1001, "Detergente", "MarcaA", 150.0));
    productos.add(new Producto(1002, "Lavandina", "MarcaB", 120.0));
    productos.add(new Producto(1003, "Desinfectante", "MarcaC", 200.0));

    System.out.println("Lista de productos:");
    productos.forEach(System.out::println);

    System.out.println("Buscando producto con código 1002...");
    for (Producto producto : productos) {
      if (producto.getCodigo() == 1002) {
        System.out.println("Producto encontrado: " + producto);
      }
    }

    System.out.println("Eliminando el producto con código 1001...");
    productos.removeIf(producto -> producto.getCodigo() == 1001);

    System.out.println("Eliminando el producto con código 1002...");
    productos.remove(new Producto(1002, "", "", 0)); // equals compara solo el código

    System.out.println("Agregando un nuevo producto...");
    productos.add(new Producto(1004, "Jabón Líquido", "MarcaD", 180.0));

    System.out.println("Actualizando el producto con código 1003...");
    for (Producto producto : productos) {
      if (producto.getCodigo() == 1003) {
        producto.setMarca("Magistral");
        producto.setPrecio(220.0);
      }
    }

    System.out.println("Lista actualizada de productos:");
    productos.forEach(System.out::println);
  }
}
