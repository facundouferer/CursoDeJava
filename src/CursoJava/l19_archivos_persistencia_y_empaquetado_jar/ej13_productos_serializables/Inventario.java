package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.ej13_productos_serializables;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Guardar y cargar la lista completa de productos de un inventario.
 * Concepto: 3. Serialización: guardar objetos enteros.
 */
public class Inventario {

  private Inventario() {
  }

  /** Serializa la lista completa de productos en el archivo indicado. */
  public static void guardarProductos(List<Producto> productos, Path archivo) {
    try (ObjectOutputStream salida = new ObjectOutputStream(Files.newOutputStream(archivo))) {
      salida.writeObject(new ArrayList<>(productos));
      System.out.println("Lista de productos guardada en " + archivo);
    } catch (IOException e) {
      System.out.println("No se pudo guardar el inventario: " + e.getMessage());
    }
  }

  /** Recupera la lista de productos guardada; devuelve una lista vacía si no pudo leerse. */
  @SuppressWarnings("unchecked")
  public static List<Producto> cargarProductos(Path archivo) {
    try (ObjectInputStream entrada = new ObjectInputStream(Files.newInputStream(archivo))) {
      List<Producto> productos = (List<Producto>) entrada.readObject();
      System.out.println("Lista de productos cargada desde " + archivo);
      return productos;
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("No se pudo cargar el inventario: " + e.getMessage());
      return new ArrayList<>();
    }
  }
}
