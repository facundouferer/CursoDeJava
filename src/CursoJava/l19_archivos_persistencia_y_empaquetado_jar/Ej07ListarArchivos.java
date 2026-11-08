package CursoJava.l19_archivos_persistencia_y_empaquetado_jar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Listar el contenido de un directorio.
 * Concepto: 2. La forma moderna: Files y Path (Files.list devuelve un stream que hay que cerrar).
 */
public class Ej07ListarArchivos {

  public static void main(String[] args) {
    Path directorio = Path.of("nuevo_directorio");

    try (Stream<Path> entradas = Files.list(directorio)) {
      entradas.map(entrada -> entrada.getFileName().toString())
          .sorted()
          .forEach(System.out::println);
    } catch (NoSuchFileException e) {
      System.out.println("El directorio no existe.");
    } catch (IOException e) {
      System.out.println("No se pudo listar el directorio: " + e.getMessage());
    }
  }
}
