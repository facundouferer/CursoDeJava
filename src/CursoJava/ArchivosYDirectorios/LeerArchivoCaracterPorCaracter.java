package CursoJava.ArchivosYDirectorios;

import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoCaracterPorCaracter {

  public static void main(String[] args) {
    // Ruta del archivo que se va a leer
    String nombreArchivo = "operaciones_con_archivos/archivo.txt";

    FileReader lector = null;

    try {
      // Crear un FileReader para el archivo especificado
      lector = new FileReader(nombreArchivo);

      int caracter; // Variable para almacenar cada carácter leído

      // Leer el archivo carácter por carácter
      while ((caracter = lector.read()) != -1) {
        // Convertir el valor int a char y mostrarlo
        System.out.print((char) caracter);
      }
    } catch (IOException e) {
      // Manejar cualquier excepción de entrada/salida
      e.printStackTrace();
    } finally {
      // Cerrar el lector en el bloque finally para asegurar que se cierra
      if (lector != null) {
        try {
          lector.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
