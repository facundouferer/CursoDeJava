package CursoJava.ArchivosYDirectorios;

import java.io.File;

public class CrearDirectorio {
  public static void main(String[] args) {
    // Ruta del directorio que queremos crear
    String directorioPath = "nuevo_directorio";

    // Crear un objeto File con la ruta especificada
    File directorio = new File(directorioPath);

    // Crear el directorio
    if (directorio.mkdir()) {
      System.out.println("Directorio creado exitosamente.");
    } else {
      System.out.println("Error al crear el directorio.");
    }
  }
}
