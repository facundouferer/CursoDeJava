package CursoJava.l19_archivos_persistencia_y_empaquetado_jar;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Crear un archivo vacío dentro de un directorio existente.
 * Concepto: 2. La forma moderna: Files y Path.
 */
public class Ej06CrearArchivo {

  public static void main(String[] args) {
    Path archivo = Path.of("nuevo_directorio", "nuevo_archivo.txt");

    try {
      Files.createFile(archivo);
      System.out.println("Archivo creado exitosamente.");
    } catch (FileAlreadyExistsException e) {
      System.out.println("El archivo ya existe.");
    } catch (NoSuchFileException e) {
      System.out.println("Error al crear el archivo: no existe el directorio " + archivo.getParent() + ".");
    } catch (IOException e) {
      System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
    }
  }
}
