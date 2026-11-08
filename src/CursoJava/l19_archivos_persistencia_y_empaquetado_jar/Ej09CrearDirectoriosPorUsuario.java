package CursoJava.l19_archivos_persistencia_y_empaquetado_jar;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Crear una carpeta y un archivo de texto con los nombres y el contenido que ingresa el usuario.
 * Concepto: 2. La forma moderna: Files y Path (codificación UTF-8 explícita).
 */
public class Ej09CrearDirectoriosPorUsuario {

  /** Carpeta base, relativa al directorio de trabajo, donde se crea todo. */
  static final Path CARPETA_BASE = Path.of("datos_usuario");

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Nombre de la carpeta: ");
    String nombreCarpeta = teclado.nextLine().trim();
    System.out.print("Nombre del archivo: ");
    String nombreArchivo = teclado.nextLine().trim();
    System.out.print("Contenido: ");
    String contenido = teclado.nextLine();

    Path carpeta = CARPETA_BASE.resolve(nombreCarpeta);
    Path archivo = carpeta.resolve(nombreArchivo + ".txt");

    try {
      Files.createDirectories(carpeta);
      Files.writeString(archivo, contenido, StandardCharsets.UTF_8,
          StandardOpenOption.CREATE, StandardOpenOption.APPEND);
      System.out.println("Archivo guardado en " + archivo.toAbsolutePath());
    } catch (IOException e) {
      System.out.println("No se pudo guardar el archivo: " + e.getMessage());
    }
  }
}
