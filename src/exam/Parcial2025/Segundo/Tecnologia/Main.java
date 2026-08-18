package exam.Parcial2025.Segundo.Tecnologia;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    InventarioComputadoras inventario = new InventarioComputadoras();
    Menu menu = new Menu();
    Scanner scanner = new Scanner(System.in);

    String input;
    int opcion = 0;

    do {
      menu.mostrarMenuPrincipal();
      input = scanner.nextLine();

      /**
       * Trata de parsear a un entero,
       * si es una letra fallará entonces el error
       * provocará que salga.
       **/
      try {
        opcion = Integer.parseInt(input);
      } catch (NumberFormatException e) {
        System.out.println("\\n👋 ¡Gracias por usar el sistema de inventario de computadoras!");
        break;
      }

      switch (opcion) {
        case 1:
          agregarEscritorio(inventario, scanner);
          System.out.println("\\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 2:
          agregarLaptop(inventario, scanner);
          System.out.println("\\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 3:
          inventario.listarTodasLasComputadoras();
          System.out.println("\\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 4:
          buscarComputadora(inventario, scanner);
          System.out.println("\\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 5:
          eliminarComputadora(inventario, scanner);
          System.out.println("\\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 6:
          System.out.println(inventario.getCantidadDeComputadoras());
          System.out.println("\\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 7:
          actualizarEscritorio(inventario, scanner);
          System.out.println("\\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 8:
          actualizarLaptop(inventario, scanner);
          System.out.println("\\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        default:
          System.out.println("❌ Opción no válida. Intente nuevamente.");
          System.out.println("\\nPresione Enter para continuar...");
          scanner.nextLine();
      }

    } while (true);

    scanner.close();
  }

  private static void agregarEscritorio(InventarioComputadoras inventario, Scanner scanner) {
    System.out.println("\\n🖥️ AGREGAR NUEVA COMPUTADORA DE ESCRITORIO");
    System.out.print("Ingrese número de serie: ");
    String numeroSerie = scanner.nextLine();
    System.out.print("Ingrese marca: ");
    String marca = scanner.nextLine();
    System.out.print("Ingrese modelo (año): ");
    int modelo = scanner.nextInt();
    System.out.print("Ingrese horas de uso: ");
    int horasUso = scanner.nextInt();
    System.out.print("Ingrese cantidad de puertos: ");
    int cantidadPuertos = scanner.nextInt();
    scanner.nextLine();

    try {
      Escritorio escritorio = new Escritorio(marca, modelo, numeroSerie, horasUso, cantidadPuertos);

      if (inventario.agregarEscritorio(escritorio)) {
        System.out.println("✅ Computadora de escritorio agregada exitosamente");
      } else {
        System.out.println("❌ Error: Ya existe una computadora con ese número de serie");
      }
    } catch (PuertosInsuficientesException e) {
      System.out.println("❌ Error: " + e.getMessage());
    }
  }

  private static void agregarLaptop(InventarioComputadoras inventario, Scanner scanner) {
    System.out.println("\\n💻 AGREGAR NUEVA LAPTOP");
    System.out.print("Ingrese número de serie: ");
    String numeroSerie = scanner.nextLine();
    System.out.print("Ingrese marca: ");
    String marca = scanner.nextLine();
    System.out.print("Ingrese modelo (año): ");
    int modelo = scanner.nextInt();
    System.out.print("Ingrese horas de uso: ");
    int horasUso = scanner.nextInt();
    scanner.nextLine();

    Laptop laptop = new Laptop(marca, modelo, numeroSerie, horasUso);

    if (inventario.agregarLaptop(laptop)) {
      System.out.println("✅ Laptop agregada exitosamente");
    } else {
      System.out.println("❌ Error: Ya existe una computadora con ese número de serie");
    }
  }

  private static void buscarComputadora(InventarioComputadoras inventario, Scanner scanner) {
    System.out.print("🔍 Ingrese número de serie de la computadora a buscar: ");
    String numeroSerie = scanner.nextLine();

    Computadora computadora = inventario.buscarComputadora(numeroSerie.toUpperCase());
    if (computadora != null) {
      System.out.println("✅ Computadora encontrada:");
      String emoji = computadora.verTipoDeComputadora();
      System.out.println(emoji + " " + computadora);
    } else {
      System.out.println("❌ No se encontró una computadora con ese número de serie");
    }
  }

  private static void eliminarComputadora(InventarioComputadoras inventario, Scanner scanner) {
    System.out.print("🗑️ Ingrese número de serie de la computadora a eliminar: ");
    String numeroSerie = scanner.nextLine();

    if (inventario.eliminarComputadora(numeroSerie)) {
      System.out.println("✅ Computadora eliminada exitosamente");
    } else {
      System.out.println("❌ No se encontró una computadora con ese número de serie");
    }
  }

  private static void actualizarEscritorio(InventarioComputadoras inventario, Scanner scanner) {
    System.out.print("🔄 Ingrese número de serie del escritorio a actualizar: ");
    String numeroSerie = scanner.nextLine();

    if (inventario.buscarComputadora(numeroSerie) != null) {
      System.out.println("Ingrese los nuevos datos:");
      System.out.print("Marca: ");
      String marca = scanner.nextLine();
      System.out.print("Modelo (año): ");
      int modelo = scanner.nextInt();
      System.out.print("Horas de uso: ");
      int horasUso = scanner.nextInt();
      System.out.print("Cantidad de puertos: ");
      int cantidadPuertos = scanner.nextInt();
      scanner.nextLine();

      try {
        Escritorio escritorioActualizado = new Escritorio(marca, modelo, numeroSerie, horasUso, cantidadPuertos);

        if (inventario.actualizarEscritorio(numeroSerie, escritorioActualizado)) {
          System.out.println("✅ Computadora de escritorio actualizada exitosamente");
        } else {
          System.out.println("❌ Error al actualizar la computadora de escritorio");
        }
      } catch (PuertosInsuficientesException e) {
        System.out.println("❌ Error: " + e.getMessage());
      }
    } else {
      System.out.println("❌ No se encontró una computadora de escritorio con ese número de serie");
    }
  }

  private static void actualizarLaptop(InventarioComputadoras inventario, Scanner scanner) {
    System.out.print("🔄 Ingrese número de serie de la laptop a actualizar: ");
    String numeroSerie = scanner.nextLine();

    if (inventario.buscarComputadora(numeroSerie) != null) {
      System.out.println("Ingrese los nuevos datos:");
      System.out.print("Marca: ");
      String marca = scanner.nextLine();
      System.out.print("Modelo (año): ");
      int modelo = scanner.nextInt();
      System.out.print("Horas de uso: ");
      int horasUso = scanner.nextInt();
      scanner.nextLine();

      Laptop laptopActualizada = new Laptop(marca, modelo, numeroSerie, horasUso);

      if (inventario.actualizarLaptop(numeroSerie, laptopActualizada)) {
        System.out.println("✅ Laptop actualizada exitosamente");
      } else {
        System.out.println("❌ Error al actualizar la laptop");
      }
    } else {
      System.out.println("❌ No se encontró una laptop con ese número de serie");
    }
  }
}