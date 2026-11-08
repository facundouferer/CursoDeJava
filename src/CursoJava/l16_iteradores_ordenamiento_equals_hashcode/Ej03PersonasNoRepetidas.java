package CursoJava.l16_iteradores_ordenamiento_equals_hashcode;

import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Cargar personas por consola rechazando las que repiten un DNI ya cargado.
 * Concepto: 6. hashCode: el que rompe todo cuando falta.
 */
public class Ej03PersonasNoRepetidas {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    Set<Persona> personas = new LinkedHashSet<>();

    try {
      int opcion;
      do {
        mostrarMenu();
        opcion = leerOpcion(leer);
        switch (opcion) {
          case 1 -> cargarPersona(leer, personas);
          case 2 -> listarPersonas(personas);
          case 0 -> System.out.println("Fin del programa");
          default -> System.out.println("Opción inválida.");
        }
      } while (opcion != 0);
    } catch (NoSuchElementException e) {
      System.out.println("\nSe cortó la entrada. Fin del programa.");
    } finally {
      leer.close();
    }
  }

  private static void mostrarMenu() {
    System.out.println("\n1 - Cargar persona");
    System.out.println("2 - Listar personas");
    System.out.println("0 - Salir");
    System.out.print("Opción: ");
  }

  private static int leerOpcion(Scanner leer) {
    try {
      return Integer.parseInt(leer.nextLine().trim());
    } catch (NumberFormatException e) {
      return -1;
    }
  }

  private static void cargarPersona(Scanner leer, Set<Persona> personas) {
    try {
      System.out.print("Nombre: ");
      String nombre = leer.nextLine();
      System.out.print("Apellido: ");
      String apellido = leer.nextLine();
      System.out.print("DNI: ");
      int dni = leerDni(leer.nextLine());

      Persona persona = new Persona(nombre, apellido, dni);
      if (personas.add(persona)) {
        System.out.println("Persona cargada: " + persona);
      } else {
        System.out.println("No se cargó: ya existe una persona con el DNI " + dni + ".");
      }
    } catch (IllegalArgumentException e) {
      System.out.println("Error de carga: " + e.getMessage());
    }
  }

  private static int leerDni(String texto) {
    String dniIngresado = texto.trim();
    if (dniIngresado.isEmpty()) {
      throw new IllegalArgumentException("el DNI no puede estar vacío.");
    }
    try {
      return Integer.parseInt(dniIngresado);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("el DNI debe contener solo números, sin puntos ni letras.");
    }
  }

  private static void listarPersonas(Set<Persona> personas) {
    System.out.println("Personas cargadas (" + personas.size() + "):");
    for (Persona persona : personas) {
      System.out.println(" - " + persona);
    }
  }

  /** Dos personas son la misma si comparten DNI; equals y hashCode usan solo ese campo. */
  static class Persona {
    private final String nombre;
    private final String apellido;
    private final int dni;

    Persona(String nombre, String apellido, int dni) {
      this.nombre = nombre.trim();
      this.apellido = apellido.trim();
      this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof Persona otra)) {
        return false;
      }
      return dni == otra.dni;
    }

    @Override
    public int hashCode() {
      return Integer.hashCode(dni);
    }

    @Override
    public String toString() {
      return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
    }
  }
}
