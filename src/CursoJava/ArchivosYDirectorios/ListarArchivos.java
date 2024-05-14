package CursoJava.ArchivosYDirectorios;

import java.io.File;

public class ListarArchivos {
  public static void main(String[] args) {
    // Ruta del directorio que queremos listar
    String directorioPath = "nuevo_directorio";

    // Crear un objeto File con la ruta especificada
    File directorio = new File(directorioPath);

    // Obtener la lista de archivos y directorios
    String[] lista = directorio.list();

    if (lista != null) {
      for (String nombre : lista) {
        System.out.println(nombre);
      }
    } else {
      System.out.println("El directorio está vacío o no existe.");
    }
  }
}
