package CursoJava.l19_archivos_persistencia_y_empaquetado_jar;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Crear un directorio cuya ruta ingresa el usuario.
 * Concepto: 2. La forma moderna: Files y Path.
 */
public class Ej05CrearDirectorio {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese la ruta del directorio que desea crear: ");
    Path directorio = Path.of(teclado.nextLine().trim());

    try {
      Files.createDirectory(directorio);
      System.out.println("Directorio creado exitosamente.");
    } catch (FileAlreadyExistsException e) {
      System.out.println("El directorio ya existe.");
    } catch (IOException e) {
      System.out.println("Error al crear el directorio: " + e.getMessage());
    }
  }
}
