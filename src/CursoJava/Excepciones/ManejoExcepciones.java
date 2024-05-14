package CursoJava.Excepciones;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ManejoExcepciones {
  public static void main(String[] args) {
    String archivoPath = "nuevo_directorio/nuevo_archivo.txt";

    // Intentar escribir en un archivo
    try (FileWriter writer = new FileWriter(archivoPath)) {
      writer.write("Hola, este es un archivo de prueba.");
      System.out.println("Datos escritos exitosamente en el archivo.");
    } catch (IOException e) {
      // Manejar la excepción
      System.out.println("Ocurrió un error al escribir en el archivo.");
      e.printStackTrace();
    }
  }
}
