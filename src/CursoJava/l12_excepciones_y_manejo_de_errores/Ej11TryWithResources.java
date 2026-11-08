package CursoJava.l12_excepciones_y_manejo_de_errores;

import java.io.FileWriter;
import java.io.IOException;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: escribir un texto en un archivo y avisar si no se pudo.
 * Concepto: §6 try-with-resources (el FileWriter se cierra solo, incluso si falla).
 */
public class Ej11TryWithResources {

  public static void main(String[] args) {
    String rutaArchivo = "nuevo_directorio/nuevo_archivo.txt";

    try (FileWriter escritor = new FileWriter(rutaArchivo)) {
      escritor.write("Hola, este es un archivo de prueba.");
      System.out.println("Datos escritos correctamente en el archivo.");
    } catch (IOException e) {
      System.err.println("No se pudo escribir en el archivo: " + e.getMessage());
    }
  }
}
