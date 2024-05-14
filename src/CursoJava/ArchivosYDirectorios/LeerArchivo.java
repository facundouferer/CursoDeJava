package CursoJava.ArchivosYDirectorios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
  public static void main(String[] args) {
    // Ruta del archivo que queremos leer
    String archivoPath = "nuevo_directorio/nuevo_archivo.txt";

    try (BufferedReader reader = new BufferedReader(new FileReader(archivoPath))) {
      String linea;
      while ((linea = reader.readLine()) != null) {
        System.out.println(linea);
      }
    } catch (IOException e) {
      System.out.println("Ocurrió un error al leer el archivo.");
      e.printStackTrace();
    }
  }
}
