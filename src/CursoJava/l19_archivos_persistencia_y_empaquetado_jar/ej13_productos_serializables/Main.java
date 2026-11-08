package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.ej13_productos_serializables;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Persistir un inventario de productos y comprobar que se recupera completo.
 * Concepto: 3. Serialización: guardar objetos enteros.
 */
public class Main {

  public static void main(String[] args) {
    List<Producto> productos = new ArrayList<>();
    productos.add(new Producto("Laptop", 750.99, 10));
    productos.add(new Producto("Smartphone", 450.50, 25));
    productos.add(new Producto("Auriculares", 29.99, 100));

    Path archivo = Path.of("productos.ser");
    Inventario.guardarProductos(productos, archivo);

    List<Producto> productosCargados = Inventario.cargarProductos(archivo);
    System.out.println("Productos cargados desde el archivo:");
    for (Producto producto : productosCargados) {
      System.out.println(producto);
    }
  }
}
