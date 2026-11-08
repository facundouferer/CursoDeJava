package CursoJava.l19_archivos_persistencia_y_empaquetado_jar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Leer un archivo de texto línea por línea de forma eficiente.
 * Concepto: 1. Las dos familias de I/O, y el patrón decorador
 * (BufferedReader decora a FileReader).
 */
public class Ej03LecturaPorLineasConBuffer {

  static final String RUTA_ARCHIVO = "operaciones_con_archivos/archivo.txt";

  public static void main(String[] args) {
    // Al cerrar el decorador (BufferedReader) también se cierra el FileReader que envuelve.
    try (BufferedReader lector = new BufferedReader(new FileReader(RUTA_ARCHIVO, StandardCharsets.UTF_8))) {
      String linea;
      while ((linea = lector.readLine()) != null) {
        System.out.println(linea);
      }
    } catch (IOException e) {
      System.out.println("No se pudo leer el archivo " + RUTA_ARCHIVO + ": " + e.getMessage());
    }
  }
}
