package CursoJava.l19_archivos_persistencia_y_empaquetado_jar;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Eliminar un archivo y luego el directorio que lo contenía.
 * Concepto: 2. La forma moderna: Files y Path.
 */
public class Ej11EliminarArchivoDirectorio {

  public static void main(String[] args) {
    Path directorio = Path.of("nuevo_directorio");
    Path archivo = directorio.resolve("nuevo_archivo.txt");

    eliminar(archivo, "Archivo");
    eliminar(directorio, "Directorio");
  }

  private static void eliminar(Path ruta, String tipo) {
    try {
      Files.delete(ruta);
      System.out.println(tipo + " eliminado exitosamente.");
    } catch (NoSuchFileException e) {
      System.out.println("Error al eliminar: " + ruta + " no existe.");
    } catch (DirectoryNotEmptyException e) {
      System.out.println("Error al eliminar: el directorio " + ruta + " no está vacío.");
    } catch (IOException e) {
      System.out.println("Error al eliminar " + ruta + ": " + e.getMessage());
    }
  }
}
