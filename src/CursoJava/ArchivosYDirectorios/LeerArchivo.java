package CursoJava.ArchivosYDirectorios;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LeerArchivo {
  public static void main(String[] args) {
    String rutaArchivo = "operaciones_con_archivos/archivo.txt"; // Ruta del archivo a leer
    BufferedReader bufferDelArchivo = null;

    try {
      // Crear un FileReader para leer el archivo
      FileReader lectorDeArchivo = new FileReader(rutaArchivo);

      // Envolver FileReader con BufferedReader para una lectura más eficiente
      bufferDelArchivo = new BufferedReader(lectorDeArchivo);

      // Leer el archivo línea por línea
      String linea;
      while ((linea = bufferDelArchivo.readLine()) != null) {
        System.out.println(linea); // Imprimir cada línea leída
      }
    } catch (IOException e) {
      e.printStackTrace(); // Manejar posibles excepciones de E/S
    } finally {
      try {
        if (bufferDelArchivo != null) {
          bufferDelArchivo.close(); // Cerrar el BufferedReader
        }
      } catch (IOException e) {
        e.printStackTrace(); // Manejar posibles excepciones al cerrar
      }
    }
  }
}
