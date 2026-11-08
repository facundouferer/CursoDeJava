package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_veterinaria;

import java.util.Scanner;

/**
 * Integrador – Segundo parcial 2025: Veterinaria (Lección 16 – Iteradores, ordenamiento, equals y hashCode)
 *
 * <p>Enunciado: sistema de inventario de una veterinaria con dos tipos de animal, avícola y
 * cazador, derivados de una clase abstracta. Permite agregar, listar, buscar, eliminar, contar y
 * actualizar animales por nombre. Un animal avícola debe pesar al menos 1 kg, de lo contrario se
 * lanza una excepción propia.
 *
 * <p>Concepto: 5. El contrato equals y 6. hashCode (igualdad por nombre), junto con herencia,
 * clases abstractas, interfaces, excepciones propias y colecciones.
 */
public class Main {

  public static void main(String[] args) {
    Inventario inventario = new Inventario();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      mostrarMenu();
      int opcion;
      try {
        opcion = Integer.parseInt(scanner.nextLine().trim());
      } catch (NumberFormatException e) {
        System.out.println("\nGracias por usar el sistema veterinario.");
        break;
      }

      switch (opcion) {
        case 1 -> agregarAvicola(inventario, scanner);
        case 2 -> agregarCazador(inventario, scanner);
        case 3 -> inventario.listarTodosLosAnimales();
        case 4 -> buscarAnimal(inventario, scanner);
        case 5 -> eliminarAnimal(inventario, scanner);
        case 6 -> System.out.println("Total de animales: " + inventario.getCantidadDeAnimales());
        case 7 -> actualizarAvicola(inventario, scanner);
        case 8 -> actualizarCazador(inventario, scanner);
        default -> System.out.println("Opción no válida. Intente nuevamente.");
      }
      System.out.println("\nPresione Enter para continuar...");
      scanner.nextLine();
    }
    scanner.close();
  }

  private static void mostrarMenu() {
    System.out.println("\n" + "=".repeat(50));
    System.out.println("SISTEMA DE INVENTARIO DE ANIMALES");
    System.out.println("=".repeat(50));
    System.out.println("1 - Agregar animal avícola");
    System.out.println("2 - Agregar animal cazador");
    System.out.println("3 - Listar todos los animales");
    System.out.println("4 - Buscar animal por nombre");
    System.out.println("5 - Eliminar animal");
    System.out.println("6 - Ver cantidad de animales");
    System.out.println("7 - Actualizar animal avícola");
    System.out.println("8 - Actualizar animal cazador");
    System.out.print("Seleccione una opción (cualquier letra para finalizar): ");
  }

  private static String leerTexto(Scanner scanner, String mensaje) {
    System.out.print(mensaje);
    return scanner.nextLine().trim();
  }

  private static int leerEntero(Scanner scanner, String mensaje) {
    while (true) {
      try {
        return Integer.parseInt(leerTexto(scanner, mensaje));
      } catch (NumberFormatException e) {
        System.out.println("Debe ingresar un número entero.");
      }
    }
  }

  private static double leerDecimal(Scanner scanner, String mensaje) {
    while (true) {
      try {
        return Double.parseDouble(leerTexto(scanner, mensaje).replace(',', '.'));
      } catch (NumberFormatException e) {
        System.out.println("Debe ingresar un número.");
      }
    }
  }

  private static void agregarAvicola(Inventario inventario, Scanner scanner) {
    System.out.println("\nAGREGAR NUEVO ANIMAL AVÍCOLA");
    String nombre = leerTexto(scanner, "Ingrese nombre: ");
    String especie = leerTexto(scanner, "Ingrese especie: ");
    int edad = leerEntero(scanner, "Ingrese edad: ");
    double peso = leerDecimal(scanner, "Ingrese peso (kg): ");
    String plumaje = leerTexto(scanner, "Ingrese tipo de plumaje (EXOTICO/COLORIDO/COMUN): ");

    try {
      Avicola avicola = new Avicola(especie, edad, nombre, peso, plumaje);
      if (inventario.agregarAvicola(avicola)) {
        System.out.println("Animal avícola agregado exitosamente.");
      } else {
        System.out.println("Error: ya existe un animal con ese nombre.");
      }
    } catch (PesoInsuficienteException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  private static void agregarCazador(Inventario inventario, Scanner scanner) {
    System.out.println("\nAGREGAR NUEVO ANIMAL CAZADOR");
    String nombre = leerTexto(scanner, "Ingrese nombre: ");
    String especie = leerTexto(scanner, "Ingrese especie: ");
    int edad = leerEntero(scanner, "Ingrese edad: ");
    double peso = leerDecimal(scanner, "Ingrese peso (kg): ");

    if (inventario.agregarCazador(new Cazador(especie, edad, nombre, peso))) {
      System.out.println("Animal cazador agregado exitosamente.");
    } else {
      System.out.println("Error: ya existe un animal con ese nombre.");
    }
  }

  private static void buscarAnimal(Inventario inventario, Scanner scanner) {
    String nombre = leerTexto(scanner, "Ingrese el nombre del animal a buscar: ").toUpperCase();
    Animalito animal = inventario.buscarAnimal(nombre);
    if (animal != null) {
      System.out.println("Animal encontrado:");
      System.out.println("[" + animal.getTipo() + "] " + animal);
    } else {
      System.out.println("No se encontró un animal con ese nombre.");
    }
  }

  private static void eliminarAnimal(Inventario inventario, Scanner scanner) {
    String nombre = leerTexto(scanner, "Ingrese el nombre del animal a eliminar: ").toUpperCase();
    if (inventario.eliminarAnimal(nombre)) {
      System.out.println("Animal eliminado exitosamente.");
    } else {
      System.out.println("No se encontró un animal con ese nombre.");
    }
  }

  private static void actualizarAvicola(Inventario inventario, Scanner scanner) {
    String nombre =
        leerTexto(scanner, "Ingrese el nombre del animal avícola a actualizar: ").toUpperCase();
    if (!(inventario.buscarAnimal(nombre) instanceof Avicola)) {
      System.out.println("No se encontró un animal avícola con ese nombre.");
      return;
    }
    System.out.println("Ingrese los nuevos datos:");
    String especie = leerTexto(scanner, "Especie: ");
    int edad = leerEntero(scanner, "Edad: ");
    double peso = leerDecimal(scanner, "Peso (kg): ");
    String plumaje = leerTexto(scanner, "Tipo de plumaje (EXOTICO/COLORIDO/COMUN): ");

    try {
      Avicola actualizada = new Avicola(especie, edad, nombre, peso, plumaje);
      inventario.actualizarAvicola(nombre, actualizada);
      System.out.println("Animal avícola actualizado exitosamente.");
    } catch (PesoInsuficienteException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  private static void actualizarCazador(Inventario inventario, Scanner scanner) {
    String nombre =
        leerTexto(scanner, "Ingrese el nombre del animal cazador a actualizar: ").toUpperCase();
    if (!(inventario.buscarAnimal(nombre) instanceof Cazador)) {
      System.out.println("No se encontró un animal cazador con ese nombre.");
      return;
    }
    System.out.println("Ingrese los nuevos datos:");
    String especie = leerTexto(scanner, "Especie: ");
    int edad = leerEntero(scanner, "Edad: ");
    double peso = leerDecimal(scanner, "Peso (kg): ");

    inventario.actualizarCazador(nombre, new Cazador(especie, edad, nombre, peso));
    System.out.println("Animal cazador actualizado exitosamente.");
  }
}
