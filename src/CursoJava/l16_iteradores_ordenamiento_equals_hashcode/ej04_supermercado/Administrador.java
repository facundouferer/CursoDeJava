package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.ej04_supermercado;

import java.util.HashSet;
import java.util.Set;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Administrar el catálogo del supermercado sin códigos repetidos.
 * Concepto: 6. hashCode: el que rompe todo cuando falta.
 */
public class Administrador {
  private final Set<Producto> productos = new HashSet<>();

  public void agregarProducto(Producto producto) {
    if (productos.add(producto)) {
      System.out.println("Producto agregado");
    } else {
      System.out.println("Ya existe un producto con ese código");
    }
  }

  public String buscarProducto(Producto buscado) {
    return "Respuesta: " + productos.contains(buscado);
  }

  public void listarProductos() {
    System.out.println(productos);
  }
}
