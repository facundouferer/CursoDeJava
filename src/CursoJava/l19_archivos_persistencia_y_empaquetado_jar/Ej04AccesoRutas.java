package CursoJava.l19_archivos_persistencia_y_empaquetado_jar;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Obtener la ruta absoluta de un archivo y comprobar si existe.
 * Concepto: 2. La forma moderna: Files y Path.
 */
public class Ej04AccesoRutas {

  public static void main(String[] args) {
    Path ruta = Path.of("gatito.png");

    System.out.println("Ruta: " + ruta.toAbsolutePath());
    if (Files.exists(ruta)) {
      System.out.println("Existe");
    } else {
      System.out.println("No existe");
    }
  }
}
