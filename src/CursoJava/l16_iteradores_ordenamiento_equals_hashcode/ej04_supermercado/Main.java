package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.ej04_supermercado;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Cargar productos en el supermercado y consultar si un código ya existe.
 * Concepto: 6. hashCode: el que rompe todo cuando falta.
 */
public class Main {
  public static void main(String[] args) {
    Administrador supermercado = new Administrador();

    supermercado.agregarProducto(new Producto(1, 10, "Manzanas"));
    supermercado.agregarProducto(new Producto(5, 20, "Naranjas"));
    supermercado.agregarProducto(new Producto(1, 15, "Peras"));
    supermercado.agregarProducto(new Producto(4, 12, "Bananas"));

    supermercado.listarProductos();

    Producto buscado = new Producto(4, 12, "Ananá");
    System.out.println(supermercado.buscarProducto(buscado));
  }
}
