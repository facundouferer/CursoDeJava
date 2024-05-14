package CursoJava.ArchivosYDirectorios;

import java.io.File;

public class EliminarArchivoDirectorio {
  public static void main(String[] args) {
    // Ruta del archivo que queremos eliminar
    String archivoPath = "nuevo_directorio/nuevo_archivo.txt";

    // Crear un objeto File con la ruta especificada
    File archivo = new File(archivoPath);

    // Eliminar el archivo
    if (archivo.delete()) {
      System.out.println("Archivo eliminado exitosamente.");
    } else {
      System.out.println("Error al eliminar el archivo.");
    }

    // Ruta del directorio que queremos eliminar
    String directorioPath = "nuevo_directorio";

    // Crear un objeto File con la ruta especificada
    File directorio = new File(directorioPath);

    // Eliminar el directorio
    if (directorio.delete()) {
      System.out.println("Directorio eliminado exitosamente.");
    } else {
      System.out.println("Error al eliminar el directorio.");
    }
  }
}
