package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.ej14_universidad_serializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Guardar un curso con sus estudiantes en un archivo y recuperarlo.
 * Concepto: 3. Serialización: guardar objetos enteros.
 */
public class Serializador {

  private final Path archivo;

  public Serializador(Path archivo) {
    this.archivo = archivo;
  }

  public void serializar(Curso curso) throws IOException {
    try (ObjectOutputStream salida = new ObjectOutputStream(Files.newOutputStream(archivo))) {
      salida.writeObject(curso);
    }
  }

  public Curso deserializar() throws IOException, ClassNotFoundException {
    try (ObjectInputStream entrada = new ObjectInputStream(Files.newInputStream(archivo))) {
      return (Curso) entrada.readObject();
    }
  }
}
