package CursoJava.ArchivosYDirectorios;

import java.io.File;
import java.util.Scanner;

public class CrearDirectorio {
  public static void main(String[] args) {
    // Ruta del directorio que queremos crear
    System.out.println("Ingrese la ruta del directorio que desea crear: ");
    Scanner scanner = new Scanner(System.in);
    String urlDirectorio = scanner.nextLine();
    String directorioPath = urlDirectorio;
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
