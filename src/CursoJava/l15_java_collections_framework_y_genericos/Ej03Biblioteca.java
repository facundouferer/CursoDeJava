/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Administrar el catálogo de una biblioteca con un menú de altas, búsquedas, bajas y ediciones.
 * Concepto: Familia List: add, indexOf, remove, set y Collections.sort sobre una List<String>.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ej03Biblioteca {

  public static void main(String[] args) {
    List<String> libros = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
      mostrarMenu();
      opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1 -> {
          System.out.print("Ingrese el título del libro: ");
          agregarLibro(libros, scanner.nextLine());
        }
        case 2 -> {
          System.out.print("Ingrese el título del libro a buscar: ");
          buscarLibro(libros, scanner.nextLine());
        }
        case 3 -> {
          System.out.print("Ingrese el título del libro a eliminar: ");
          eliminarLibro(libros, scanner.nextLine());
        }
        case 4 -> listarLibros(libros);
        case 5 -> ordenarLibros(libros);
        case 6 -> {
          System.out.print("Ingrese la posición del libro a editar: ");
          int indice = scanner.nextInt();
          scanner.nextLine();
          System.out.print("Ingrese el nuevo título del libro: ");
          editarLibro(libros, indice, scanner.nextLine());
        }
        case 7 -> System.out.println("Saliendo del programa.");
        default -> System.out.println("Opción no válida.");
      }
    } while (opcion != 7);

    scanner.close();
  }

  private static void mostrarMenu() {
    System.out.println("\n==================================");
    System.out.println("BIBLIOTECA - MENÚ DE OPCIONES");
    System.out.println("==================================");
    System.out.println("1. Agregar libro");
    System.out.println("2. Buscar libro");
    System.out.println("3. Eliminar libro");
    System.out.println("4. Listar libros");
    System.out.println("5. Ordenar libros alfabéticamente");
    System.out.println("6. Editar libro indicando su posición");
    System.out.println("7. Salir");
    System.out.println("==================================");
    System.out.print("Por favor, ingrese el número de la opción que desea realizar: ");
  }

  private static void agregarLibro(List<String> libros, String titulo) {
    libros.add(titulo);
    System.out.println("Libro agregado correctamente.");
  }

  private static void buscarLibro(List<String> libros, String titulo) {
    int indice = libros.indexOf(titulo);
    if (indice != -1) {
      System.out.println("Libro encontrado en la posición: " + indice);
    } else {
      System.out.println("Libro no encontrado.");
    }
  }

  private static void eliminarLibro(List<String> libros, String titulo) {
    if (libros.remove(titulo)) {
      System.out.println("Libro eliminado correctamente.");
    } else {
      System.out.println("Libro no encontrado.");
    }
  }

  private static void listarLibros(List<String> libros) {
    System.out.println("Listado de libros:");
    for (String libro : libros) {
      System.out.println(libro);
    }
  }

  private static void ordenarLibros(List<String> libros) {
    Collections.sort(libros);
    System.out.println("Libros ordenados alfabéticamente.");
  }

  private static void editarLibro(List<String> libros, int indice, String nuevoTitulo) {
    if (indice >= 0 && indice < libros.size()) {
      libros.set(indice, nuevoTitulo);
      System.out.println("Libro editado correctamente.");
    } else {
      System.out.println("Posición no válida.");
    }
  }
}
