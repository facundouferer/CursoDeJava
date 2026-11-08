package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.ej12_serializacion_simple;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Lección 19 – Archivos, Serialización y Empaquetado JAR
 * Objetivo: Guardar un objeto en un archivo y recuperarlo como un objeto nuevo.
 * Concepto: 3. Serialización: guardar objetos enteros.
 */
public class Main {

  static final String ARCHIVO = "persona.ser";

  public static void main(String[] args) {
    guardar(new Persona("Juan", 123), ARCHIVO);

    Persona recuperada = cargar(ARCHIVO);
    if (recuperada != null) {
      System.out.println("Persona recuperada: " + recuperada);
    }
  }

  static void guardar(Persona persona, String archivo) {
    try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
      salida.writeObject(persona);
      System.out.println("Persona guardada en " + archivo);
    } catch (IOException e) {
      System.out.println("No se pudo guardar la persona: " + e.getMessage());
    }
  }

  static Persona cargar(String archivo) {
    try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
      return (Persona) entrada.readObject();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("No se pudo leer la persona: " + e.getMessage());
      return null;
    }
  }
}
