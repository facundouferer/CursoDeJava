package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_concesionario;

import java.util.Scanner;

/**
 * Integrador – Segundo parcial 2025: Concesionario (Lección 16 – Iteradores, ordenamiento, equals y hashCode)
 *
 * <p>Enunciado: sistema de inventario de un concesionario con dos tipos de vehículo, auto y moto,
 * derivados de una clase abstracta. Permite agregar, listar, buscar, eliminar, contar y actualizar
 * vehículos por patente. Un auto debe tener al menos 3 puertas, de lo contrario se lanza una
 * excepción propia.
 *
 * <p>Concepto: 5. El contrato equals y 6. hashCode (igualdad por patente), junto con herencia,
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
        System.out.println("\nGracias por usar el sistema de inventario.");
        break;
      }

      switch (opcion) {
        case 1 -> agregarAuto(inventario, scanner);
        case 2 -> agregarMoto(inventario, scanner);
        case 3 -> inventario.listarTodosLosVehiculos();
        case 4 -> buscarVehiculo(inventario, scanner);
        case 5 -> eliminarVehiculo(inventario, scanner);
        case 6 -> System.out.println("Total de vehículos: " + inventario.getCantidadDeVehiculos());
        case 7 -> actualizarAuto(inventario, scanner);
        case 8 -> actualizarMoto(inventario, scanner);
        default -> System.out.println("Opción no válida. Intente nuevamente.");
      }
      System.out.println("\nPresione Enter para continuar...");
      scanner.nextLine();
    }
    scanner.close();
  }

  private static void mostrarMenu() {
    System.out.println("\n" + "=".repeat(50));
    System.out.println("SISTEMA DE INVENTARIO DE VEHÍCULOS");
    System.out.println("=".repeat(50));
    System.out.println("1 - Agregar auto");
    System.out.println("2 - Agregar moto");
    System.out.println("3 - Listar todos los vehículos");
    System.out.println("4 - Buscar vehículo por patente");
    System.out.println("5 - Eliminar vehículo");
    System.out.println("6 - Ver cantidad de vehículos");
    System.out.println("7 - Actualizar auto");
    System.out.println("8 - Actualizar moto");
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

  private static void agregarAuto(Inventario inventario, Scanner scanner) {
    System.out.println("\nAGREGAR NUEVO AUTO");
    String patente = leerTexto(scanner, "Ingrese patente: ");
    String marca = leerTexto(scanner, "Ingrese marca: ");
    int modelo = leerEntero(scanner, "Ingrese modelo (año): ");
    int kilometraje = leerEntero(scanner, "Ingrese kilometraje: ");
    int puertas = leerEntero(scanner, "Ingrese número de puertas: ");

    try {
      Auto auto = new Auto(marca, modelo, patente, kilometraje, puertas);
      if (inventario.agregarAuto(auto)) {
        System.out.println("Auto agregado exitosamente.");
      } else {
        System.out.println("Error: ya existe un auto con esa patente.");
      }
    } catch (PuertasInsuficientesException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  private static void agregarMoto(Inventario inventario, Scanner scanner) {
    System.out.println("\nAGREGAR NUEVA MOTO");
    String patente = leerTexto(scanner, "Ingrese patente: ");
    String marca = leerTexto(scanner, "Ingrese marca: ");
    int modelo = leerEntero(scanner, "Ingrese modelo (año): ");
    int kilometraje = leerEntero(scanner, "Ingrese kilometraje: ");

    if (inventario.agregarMoto(new Moto(marca, modelo, patente, kilometraje))) {
      System.out.println("Moto agregada exitosamente.");
    } else {
      System.out.println("Error: ya existe una moto con esa patente.");
    }
  }

  private static void buscarVehiculo(Inventario inventario, Scanner scanner) {
    String patente = leerTexto(scanner, "Ingrese la patente del vehículo a buscar: ").toUpperCase();
    Vehiculo vehiculo = inventario.buscarVehiculo(patente);
    if (vehiculo != null) {
      System.out.println("Vehículo encontrado:");
      System.out.println("[" + vehiculo.getTipo() + "] " + vehiculo);
    } else {
      System.out.println("No se encontró un vehículo con esa patente.");
    }
  }

  private static void eliminarVehiculo(Inventario inventario, Scanner scanner) {
    String patente = leerTexto(scanner, "Ingrese la patente del vehículo a eliminar: ").toUpperCase();
    if (inventario.eliminarVehiculo(patente)) {
      System.out.println("Vehículo eliminado exitosamente.");
    } else {
      System.out.println("No se encontró un vehículo con esa patente.");
    }
  }

  private static void actualizarAuto(Inventario inventario, Scanner scanner) {
    String patente = leerTexto(scanner, "Ingrese la patente del auto a actualizar: ").toUpperCase();
    if (!(inventario.buscarVehiculo(patente) instanceof Auto)) {
      System.out.println("No se encontró un auto con esa patente.");
      return;
    }
    System.out.println("Ingrese los nuevos datos:");
    String marca = leerTexto(scanner, "Marca: ");
    int modelo = leerEntero(scanner, "Modelo (año): ");
    int kilometraje = leerEntero(scanner, "Kilometraje: ");
    int puertas = leerEntero(scanner, "Número de puertas: ");

    try {
      Auto actualizado = new Auto(marca, modelo, patente, kilometraje, puertas);
      inventario.actualizarAuto(patente, actualizado);
      System.out.println("Auto actualizado exitosamente.");
    } catch (PuertasInsuficientesException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  private static void actualizarMoto(Inventario inventario, Scanner scanner) {
    String patente = leerTexto(scanner, "Ingrese la patente de la moto a actualizar: ").toUpperCase();
    if (!(inventario.buscarVehiculo(patente) instanceof Moto)) {
      System.out.println("No se encontró una moto con esa patente.");
      return;
    }
    System.out.println("Ingrese los nuevos datos:");
    String marca = leerTexto(scanner, "Marca: ");
    int modelo = leerEntero(scanner, "Modelo (año): ");
    int kilometraje = leerEntero(scanner, "Kilometraje: ");

    inventario.actualizarMoto(patente, new Moto(marca, modelo, patente, kilometraje));
    System.out.println("Moto actualizada exitosamente.");
  }
}
