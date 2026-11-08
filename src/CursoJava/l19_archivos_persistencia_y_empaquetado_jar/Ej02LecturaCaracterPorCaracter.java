package CursoJava.l19_archivos_persistencia_y_empaquetado_jar;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Leer un archivo de texto un carácter a la vez y mostrarlo por consola.
 * Concepto: 1. Las dos familias de I/O, y el patrón decorador.
 */
public class Ej02LecturaCaracterPorCaracter {

  static final String RUTA_ARCHIVO = "operaciones_con_archivos/archivo.txt";

  public static void main(String[] args) {
    try (FileReader lector = new FileReader(RUTA_ARCHIVO, StandardCharsets.UTF_8)) {
      int caracter;
      // read() devuelve -1 al llegar al final del archivo
      while ((caracter = lector.read()) != -1) {
        System.out.print((char) caracter);
      }
      System.out.println();
    } catch (IOException e) {
      System.out.println("No se pudo leer el archivo " + RUTA_ARCHIVO + ": " + e.getMessage());
    }
  }
}
