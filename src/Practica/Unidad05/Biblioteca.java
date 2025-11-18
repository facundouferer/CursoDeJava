package Practica.Unidad05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Biblioteca {

  // Declaration of the libros ArrayList
  static ArrayList<String> libros = new ArrayList<>();

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {

      mostrarMenu();
      opcion = scanner.nextInt();
      scanner.nextLine(); // Limpiar el buffer del scanner

      switch (opcion) {
        case 1:
          System.out.print("Ingrese el nombre del libro: ");
          String nuevoLibro = scanner.nextLine();
          agregarLibro(libros, nuevoLibro);
          break;
        case 2:
          System.out.print("Ingrese el nombre del libro a buscar: ");
          String libroABuscar = scanner.nextLine();
          buscarLibro(libros, libroABuscar);
          break;
        case 3:
          System.out.print("Ingrese el nombre del libro a eliminar: ");
          String libroAEliminar = scanner.nextLine();
          eliminarLibro(libros, libroAEliminar);
          break;
        case 4:
          System.out.println(listarLibros(libros));
          break;
        case 5:
          ordenarLibros(libros);
          break;
        case 6:
          System.out.print("Ingrese el índice del libro a editar: ");
          int indice = scanner.nextInt();
          scanner.nextLine(); // Limpiar el buffer del scanner
          System.out.print("Ingrese el nuevo nombre del libro: ");
          String nuevoNombre = scanner.nextLine();
          editarLibro(libros, indice, nuevoNombre);
          break;
        case 7:
          System.out.println("Saliendo del programa.");
          break;
        default:
          System.out.println("Opción no válida.\n");
          break;
      }
    } while (opcion != 7);

    scanner.close();
  }

  // mostrar menu
  public static void mostrarMenu() {
    System.out.println("\n==================================");
    System.out.println("BIBLIOTECA - MENU DE OPCIONES");
    System.out.println("==================================");
    System.out.println("1. Agregar libro");
    System.out.println("2. Buscar libro");
    System.out.println("3. Eliminar libro");
    System.out.println("4. Listar libros");
    System.out.println("5. Ordenar libros alfabéticamente");
    System.out.println("6. Editar libro indicando índice");
    System.out.println("7. Salir");
    System.out.println("==================================\n");
    System.out.println("Por favor, ingrese el número de la opción que desea realizar:");
  }

  // agreagar linro
  public static void agregarLibro(ArrayList<String> libros, String nombreLibro) {
    libros.add(nombreLibro);
    System.out.println("Libro agregado correctamente.");
  }

  // buscar libro
  public static void buscarLibro(ArrayList<String> libros, String nombreLibro) {
    int indice = libros.indexOf(nombreLibro);
    if (indice != -1) {
      System.out.println("Libro encontrado en la posición: " + indice);
    } else {
      System.out.println("Libro no encontrado.");
    }
  }

  // eliminar libro
  public static void eliminarLibro(ArrayList<String> libros, String nombreLibro) {
    if (libros.remove(nombreLibro)) {
      System.out.println("Libro eliminado correctamente.");
    } else {
      System.out.println("Libro no encontrado.");
    }
  }

  // listar libros
  public static String listarLibros(ArrayList<String> libros) {
    System.out.println("Listado de libros:");
    String listaLibros = "";
    for (String libro : libros) {
      listaLibros += libro + "\n";
    }
    return listaLibros;
  }

  // ordenar libros
  public static void ordenarLibros(ArrayList<String> libros) {
    Collections.sort(libros);
    System.out.println("Libros ordenados alfabéticamente.");
  }

  // editar libro
  public static void editarLibro(ArrayList<String> libros, int indice, String nuevoNombre) {
    if (indice >= 0 && indice < libros.size()) {
      libros.set(indice, nuevoNombre);
      System.out.println("Libro editado correctamente.");
    } else {
      System.out.println("Índice no válido.");
    }
  }
}