package Practica.Unidad05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Automotores {

  static ArrayList<String> autos = new ArrayList<>();

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {

      mostrarMenu();
      opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1:
          System.out.print("Ingrese el nombre del auto: ");
          String nuevoAuto = scanner.nextLine();
          agregarAuto(autos, nuevoAuto);
          break;
        case 2:
          System.out.print("Ingrese el nombre del auto a buscar: ");
          String autoABuscar = scanner.nextLine();
          buscarAuto(autos, autoABuscar);
          break;
        case 3:
          System.out.print("Ingrese el nombre del auto a eliminar: ");
          String autoAEliminar = scanner.nextLine();
          eliminarAuto(autos, autoAEliminar);
          break;
        case 4:
          System.out.println(listarAutos(autos));
          break;
        case 5:
          ordenarAutos(autos);
          break;
        case 6:
          System.out.print("Ingrese el índice del auto a editar: ");
          int indice = scanner.nextInt();
          scanner.nextLine();
          System.out.print("Ingrese el nuevo nombre del auto: ");
          String nuevoNombre = scanner.nextLine();
          editarAuto(autos, indice, nuevoNombre);
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
    System.out.println(" MENU DE OPCIONES");
    System.out.println("==================================");
    System.out.println("1. Agregar auto");
    System.out.println("2. Buscar auto");
    System.out.println("3. Eliminar auto");
    System.out.println("4. Listar autos");
    System.out.println("5. Ordenar autos alfabéticamente");
    System.out.println("6. Editar auto indicando índice");
    System.out.println("7. Salir");
    System.out.println("==================================\n");
    System.out.println("Por favor, ingrese el número de la opción que desea realizar:");
  }

  // agreagar linro
  public static void agregarAuto(ArrayList<String> autos, String nombreauto) {
    autos.add(nombreauto);
    System.out.println("auto agregado correctamente.");
  }

  // buscar auto
  public static void buscarAuto(ArrayList<String> autos, String nombreauto) {
    int indice = autos.indexOf(nombreauto);
    if (indice != -1) {
      System.out.println("auto encontrado en la posición: " + indice);
    } else {
      System.out.println("auto no encontrado.");
    }
  }

  // eliminar auto
  public static void eliminarAuto(ArrayList<String> autos, String nombreauto) {
    if (autos.remove(nombreauto)) {
      System.out.println("auto eliminado correctamente.");
    } else {
      System.out.println("auto no encontrado.");
    }
  }

  // listar autos
  public static String listarAutos(ArrayList<String> autos) {
    System.out.println("Listado de autos:");
    String listaautos = "";
    for (String auto : autos) {
      listaautos += auto + "\n";
    }
    return listaautos;
  }

  // ordenar autos
  public static void ordenarAutos(ArrayList<String> autos) {
    Collections.sort(autos);
    System.out.println("autos ordenados alfabéticamente.");
  }

  // editar auto
  public static void editarAuto(ArrayList<String> autos, int indice, String nuevoNombre) {
    if (indice >= 0 && indice < autos.size()) {
      autos.set(indice, nuevoNombre);
      System.out.println("auto editado correctamente.");
    } else {
      System.out.println("Índice no válido.");
    }
  }

}
