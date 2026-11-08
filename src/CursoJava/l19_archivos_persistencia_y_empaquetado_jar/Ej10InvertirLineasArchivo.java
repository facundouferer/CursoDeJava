package CursoJava.l19_archivos_persistencia_y_empaquetado_jar;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Leer un archivo de texto y generar otro con sus líneas en orden inverso.
 * Concepto: 2. La forma moderna: Files y Path (readAllLines y write con UTF-8 explícito).
 */
public class Ej10InvertirLineasArchivo {

  static final Path ENTRADA = Path.of("operaciones_con_archivos", "archivo.txt");
  static final Path SALIDA = Path.of("operaciones_con_archivos", "salida.txt");

  public static void main(String[] args) {
    try {
      List<String> lineas = new ArrayList<>(Files.readAllLines(ENTRADA, StandardCharsets.UTF_8));
      Collections.reverse(lineas);
      Files.write(SALIDA, lineas, StandardCharsets.UTF_8);
      System.out.println("Se escribieron " + lineas.size() + " líneas invertidas en " + SALIDA + ".");
    } catch (NoSuchFileException e) {
      System.out.println("No existe el archivo " + e.getFile() + ".");
    } catch (IOException e) {
      System.out.println("Error de entrada/salida: " + e.getMessage());
    }
  }
}
