package CursoJava.l19_archivos_persistencia_y_empaquetado_jar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Escribir texto al final de un archivo usando un flujo de caracteres.
 * Concepto: 1. Las dos familias de I/O, y el patrón decorador.
 */
public class Ej01EscrituraConFileWriter {

  static final String RUTA_ARCHIVO = "operaciones_con_archivos/archivo.txt";

  public static void main(String[] args) {
    File archivo = new File(RUTA_ARCHIVO);
    File carpeta = archivo.getParentFile();
    if (carpeta != null) {
      carpeta.mkdirs();
    }

    // true = agrega al final del archivo; con false se sobrescribe el contenido.
    // La codificación se indica de forma explícita.
    try (FileWriter escritor = new FileWriter(archivo, StandardCharsets.UTF_8, true)) {
      escritor.write("Hola, este es un archivo de prueba.\n");
      escritor.write("Escribiendo más líneas en el archivo.");
      System.out.println("Datos escritos exitosamente en el archivo.");
    } catch (IOException e) {
      System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
    }
  }
}
