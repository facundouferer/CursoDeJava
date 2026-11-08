package CursoJava.l19_archivos_persistencia_y_empaquetado_jar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Mostrar como árbol el contenido de un directorio y de todos sus subdirectorios.
 * Concepto: 2. La forma moderna: Files y Path (recorrido recursivo de directorios).
 */
public class Ej08ListadoRecursivoDeArchivos {

  public static void main(String[] args) {
    Path raiz = Path.of(args.length > 0 ? args[0] : "src");

    if (!Files.isDirectory(raiz)) {
      System.out.println("El directorio " + raiz + " no existe.");
      return;
    }
    System.out.println("📂 " + raiz);
    try {
      listar(raiz, 1);
    } catch (IOException e) {
      System.out.println("No se pudo recorrer el directorio: " + e.getMessage());
    }
  }

  private static void listar(Path directorio, int nivel) throws IOException {
    List<Path> entradas;
    try (Stream<Path> flujo = Files.list(directorio)) {
      entradas = flujo.sorted().toList();
    }
    for (Path entrada : entradas) {
      String sangria = "\t".repeat(nivel - 1) + " |__";
      if (Files.isDirectory(entrada)) {
        System.out.println(sangria + "📂 " + entrada.getFileName());
        listar(entrada, nivel + 1);
      } else {
        System.out.println(sangria + entrada.getFileName());
      }
    }
  }
}
