package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.integrador_p2_tecnologia;

import java.util.Scanner;

/**
 * Integrador – Segundo parcial 2025: Tecnología (Lección 16 – Iteradores, ordenamiento, equals y hashCode)
 *
 * <p>Enunciado: sistema de inventario de computadoras con dos tipos, escritorio y laptop, derivados
 * de una clase abstracta. Permite agregar, listar, buscar, eliminar, contar y actualizar equipos por
 * número de serie. Un escritorio debe tener al menos 5 puertos, de lo contrario se lanza una
 * excepción propia.
 *
 * <p>Concepto: 5. El contrato equals y 6. hashCode (igualdad por número de serie), junto con
 * herencia, clases abstractas, interfaces, excepciones propias y colecciones.
 */
public class Main {

  public static void main(String[] args) {
    InventarioComputadoras inventario = new InventarioComputadoras();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      mostrarMenu();
      int opcion;
      try {
        opcion = Integer.parseInt(scanner.nextLine().trim());
      } catch (NumberFormatException e) {
        System.out.println("\nGracias por usar el sistema de inventario de computadoras.");
        break;
      }

      switch (opcion) {
        case 1 -> agregarEscritorio(inventario, scanner);
        case 2 -> agregarLaptop(inventario, scanner);
        case 3 -> inventario.listarTodasLasComputadoras();
        case 4 -> buscarComputadora(inventario, scanner);
        case 5 -> eliminarComputadora(inventario, scanner);
        case 6 -> System.out.println("Total de computadoras: " + inventario.getCantidadDeComputadoras());
        case 7 -> actualizarEscritorio(inventario, scanner);
        case 8 -> actualizarLaptop(inventario, scanner);
        default -> System.out.println("Opción no válida. Intente nuevamente.");
      }
      System.out.println("\nPresione Enter para continuar...");
      scanner.nextLine();
    }
    scanner.close();
  }

  private static void mostrarMenu() {
    System.out.println("\n" + "=".repeat(50));
    System.out.println("SISTEMA DE INVENTARIO DE COMPUTADORAS");
    System.out.println("=".repeat(50));
    System.out.println("1 - Agregar escritorio");
    System.out.println("2 - Agregar laptop");
    System.out.println("3 - Listar todas las computadoras");
    System.out.println("4 - Buscar computadora por número de serie");
    System.out.println("5 - Eliminar computadora");
    System.out.println("6 - Ver cantidad de computadoras");
    System.out.println("7 - Actualizar escritorio");
    System.out.println("8 - Actualizar laptop");
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

  private static void agregarEscritorio(InventarioComputadoras inventario, Scanner scanner) {
    System.out.println("\nAGREGAR NUEVO AUTO");
    String numeroSerie = leerTexto(scanner, "Ingrese número de serie: ");
    String marca = leerTexto(scanner, "Ingrese marca: ");
    int modelo = leerEntero(scanner, "Ingrese modelo (año): ");
    int horasUso = leerEntero(scanner, "Ingrese horas de uso: ");
    int puertos = leerEntero(scanner, "Ingrese número de puertos: ");

    try {
      Escritorio escritorio = new Escritorio(marca, modelo, numeroSerie, horasUso, puertos);
      if (inventario.agregarEscritorio(escritorio)) {
        System.out.println("Escritorio agregado exitosamente.");
      } else {
        System.out.println("Error: ya existe un escritorio con ese número de serie.");
      }
    } catch (PuertosInsuficientesException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  private static void agregarLaptop(InventarioComputadoras inventario, Scanner scanner) {
    System.out.println("\nAGREGAR NUEVA MOTO");
    String numeroSerie = leerTexto(scanner, "Ingrese número de serie: ");
    String marca = leerTexto(scanner, "Ingrese marca: ");
    int modelo = leerEntero(scanner, "Ingrese modelo (año): ");
    int horasUso = leerEntero(scanner, "Ingrese horas de uso: ");

    if (inventario.agregarLaptop(new Laptop(marca, modelo, numeroSerie, horasUso))) {
      System.out.println("Laptop agregada exitosamente.");
    } else {
      System.out.println("Error: ya existe una laptop con ese número de serie.");
    }
  }

  private static void buscarComputadora(InventarioComputadoras inventario, Scanner scanner) {
    String numeroSerie = leerTexto(scanner, "Ingrese el número de serie de la computadora a buscar: ").toUpperCase();
    Computadora computadora = inventario.buscarComputadora(numeroSerie);
    if (computadora != null) {
      System.out.println("Computadora encontrada:");
      System.out.println("[" + computadora.getTipo() + "] " + computadora);
    } else {
      System.out.println("No se encontró una computadora con ese número de serie.");
    }
  }

  private static void eliminarComputadora(InventarioComputadoras inventario, Scanner scanner) {
    String numeroSerie = leerTexto(scanner, "Ingrese el número de serie de la computadora a eliminar: ").toUpperCase();
    if (inventario.eliminarComputadora(numeroSerie)) {
      System.out.println("Computadora eliminada exitosamente.");
    } else {
      System.out.println("No se encontró una computadora con ese número de serie.");
    }
  }

  private static void actualizarEscritorio(InventarioComputadoras inventario, Scanner scanner) {
    String numeroSerie = leerTexto(scanner, "Ingrese el número de serie del escritorio a actualizar: ").toUpperCase();
    if (!(inventario.buscarComputadora(numeroSerie) instanceof Escritorio)) {
      System.out.println("No se encontró un escritorio con ese número de serie.");
      return;
    }
    System.out.println("Ingrese los nuevos datos:");
    String marca = leerTexto(scanner, "Marca: ");
    int modelo = leerEntero(scanner, "Modelo (año): ");
    int horasUso = leerEntero(scanner, "Horas de uso: ");
    int puertos = leerEntero(scanner, "Número de puertos: ");

    try {
      Escritorio actualizado = new Escritorio(marca, modelo, numeroSerie, horasUso, puertos);
      inventario.actualizarEscritorio(numeroSerie, actualizado);
      System.out.println("Escritorio actualizado exitosamente.");
    } catch (PuertosInsuficientesException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  private static void actualizarLaptop(InventarioComputadoras inventario, Scanner scanner) {
    String numeroSerie = leerTexto(scanner, "Ingrese el número de serie de la laptop a actualizar: ").toUpperCase();
    if (!(inventario.buscarComputadora(numeroSerie) instanceof Laptop)) {
      System.out.println("No se encontró una laptop con ese número de serie.");
      return;
    }
    System.out.println("Ingrese los nuevos datos:");
    String marca = leerTexto(scanner, "Marca: ");
    int modelo = leerEntero(scanner, "Modelo (año): ");
    int horasUso = leerEntero(scanner, "Horas de uso: ");

    inventario.actualizarLaptop(numeroSerie, new Laptop(marca, modelo, numeroSerie, horasUso));
    System.out.println("Laptop actualizada exitosamente.");
  }
}
