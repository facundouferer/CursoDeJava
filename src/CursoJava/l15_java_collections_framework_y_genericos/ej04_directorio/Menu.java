/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Ofrecer por consola el menú de operaciones del directorio.
 * Concepto: Familia List: uso de un Directorio respaldado por una List.
 */
package CursoJava.l15_java_collections_framework_y_genericos.ej04_directorio;

import java.util.List;
import java.util.Scanner;

public class Menu {
  private final Directorio directorio = new Directorio();
  private final Scanner scanner = new Scanner(System.in);

  public void mostrarMenu() {
    int opcion;
    do {
      System.out.println("\n==================================");
      System.out.println("DIRECTORIO - MENÚ DE OPCIONES");
      System.out.println("==================================");
      System.out.println("1. Agregar persona");
      System.out.println("2. Buscar persona por nombre");
      System.out.println("3. Buscar persona por DNI");
      System.out.println("4. Eliminar persona por nombre");
      System.out.println("5. Eliminar persona por DNI");
      System.out.println("6. Listar personas");
      System.out.println("7. Editar persona");
      System.out.println("8. Salir");
      System.out.println("==================================");
      System.out.print("Por favor, ingrese el número de la opción que desea realizar: ");
      opcion = scanner.nextInt();
      scanner.nextLine(); // descarta el salto de línea pendiente

      switch (opcion) {
        case 1 -> agregarPersona();
        case 2 -> buscarPorNombre();
        case 3 -> buscarPorDni();
        case 4 -> eliminarPorNombre();
        case 5 -> eliminarPorDni();
        case 6 -> listarPersonas();
        case 7 -> editarPersona();
        case 8 -> System.out.println("Saliendo del programa.");
        default -> System.out.println("Opción no válida.");
      }
    } while (opcion != 8);
  }

  private void agregarPersona() {
    System.out.print("Ingrese el nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el DNI: ");
    int dni = scanner.nextInt();
    System.out.print("Ingrese el teléfono: ");
    int telefono = scanner.nextInt();
    scanner.nextLine();
    directorio.agregarPersona(new Persona(nombre, dni, telefono));
    System.out.println("Persona agregada correctamente.");
  }

  private void buscarPorNombre() {
    System.out.print("Ingrese el nombre: ");
    mostrarResultado(directorio.buscarPorNombre(scanner.nextLine()));
  }

  private void buscarPorDni() {
    System.out.print("Ingrese el DNI: ");
    int dni = scanner.nextInt();
    scanner.nextLine();
    mostrarResultado(directorio.buscarPorDni(dni));
  }

  private void mostrarResultado(Persona persona) {
    if (persona != null) {
      System.out.println("Persona encontrada: " + persona);
    } else {
      System.out.println("Persona no encontrada.");
    }
  }

  private void eliminarPorNombre() {
    System.out.print("Ingrese el nombre: ");
    informarEliminacion(directorio.eliminarPorNombre(scanner.nextLine()));
  }

  private void eliminarPorDni() {
    System.out.print("Ingrese el DNI: ");
    int dni = scanner.nextInt();
    scanner.nextLine();
    informarEliminacion(directorio.eliminarPorDni(dni));
  }

  private void informarEliminacion(boolean eliminada) {
    System.out.println(eliminada ? "Persona eliminada correctamente." : "Persona no encontrada.");
  }

  private void listarPersonas() {
    List<Persona> personas = directorio.getPersonas();
    System.out.println("Listado de personas:");
    for (Persona persona : personas) {
      System.out.println(persona);
    }
  }

  private void editarPersona() {
    System.out.print("Ingrese el DNI de la persona a editar: ");
    int dni = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Ingrese el nuevo nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el nuevo teléfono: ");
    int telefono = scanner.nextInt();
    scanner.nextLine();
    if (directorio.editarPersona(nombre, dni, telefono)) {
      System.out.println("Persona editada correctamente.");
    } else {
      System.out.println("Persona no encontrada.");
    }
  }
}
