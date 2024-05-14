package CursoJava.ArchivosYDirectorios;

import java.io.File;
import java.io.IOException;

public class CrearArchivo {
  public static void main(String[] args) {
    // Ruta del archivo que queremos crear
    String archivoPath = "nuevo_directorio/nuevo_archivo.txt";

    // Crear un objeto File con la ruta especificada
    File archivo = new File(archivoPath);

    try {
      // Crear el archivo
      if (archivo.createNewFile()) {
        System.out.println("Archivo creado exitosamente.");
      } else {
        System.out.println("Error al crear el archivo.");
      }
    } catch (IOException e) {
      System.out.println("Ocurrió un error al crear el archivo.");
      e.printStackTrace();
    }
  }
}
