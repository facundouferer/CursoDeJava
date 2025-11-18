package Parciales.Parcial2025.Segundo.Concesionario;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Inventario inventario = new Inventario();
    Menu menu = new Menu();
    Scanner scanner = new Scanner(System.in);

    String input;
    int opcion = 0;

    do {
      menu.mostrarMenuPrincipal();
      input = scanner.nextLine();

      /**
       * Trata de parseas a un integer,
       * si es una letra fallará entonces el error
       * provocará que salga.
       **/
      try {
        opcion = Integer.parseInt(input);
      } catch (NumberFormatException e) {
        System.out.println("\n👋 ¡Gracias por usar el sistema de inventario!");
        break;
      }

      switch (opcion) {
        case 1:
          agregarAuto(inventario, scanner);
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 2:
          agregarMoto(inventario, scanner);
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 3:
          inventario.listarTodosLosVehiculos();
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 4:
          buscarVehiculo(inventario, scanner);
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 5:
          eliminarVehiculo(inventario, scanner);
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 6:
          System.out.println("Total de vehículos: " + inventario.getCantidadDeVehiculos());
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 7:
          actualizarAuto(inventario, scanner);
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 8:
          actualizarMoto(inventario, scanner);
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        default:
          System.out.println("❌ Opción no válida. Intente nuevamente.");
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
      }

    } while (true);

    scanner.close();
  }

  private static void agregarAuto(Inventario inventario, Scanner scanner) {
    System.out.println("\n📝 AGREGAR NUEVO AUTO");
    System.out.print("Ingrese patente: ");
    String patente = scanner.nextLine();
    System.out.print("Ingrese marca: ");
    String marca = scanner.nextLine();
    System.out.print("Ingrese modelo: ");
    int modelo = scanner.nextInt();
    System.out.print("Ingrese kilometraje: ");
    int kilometraje = scanner.nextInt();
    System.out.print("Ingrese número de puertas: ");
    int puertas = scanner.nextInt();
    scanner.nextLine();

    try {
      Auto auto = new Auto(marca, modelo, patente, kilometraje, puertas);

      if (inventario.agregarAuto(auto)) {
        System.out.println("✅ Auto agregado exitosamente");
      } else {
        System.out.println("❌ Error: Ya existe un auto con esa patente");
      }
    } catch (PuertasInsuficientesException e) {
      System.out.println("❌ Error: " + e.getMessage());
    }
  }

  private static void agregarMoto(Inventario inventario, Scanner scanner) {
    System.out.println("\n📝 AGREGAR NUEVA MOTO");
    System.out.print("Ingrese patente: ");
    String patente = scanner.nextLine();
    System.out.print("Ingrese marca: ");
    String marca = scanner.nextLine();
    System.out.print("Ingrese modelo: ");
    int modelo = scanner.nextInt();
    System.out.print("Ingrese kilometraje: ");
    int kilometraje = scanner.nextInt();
    scanner.nextLine();

    Moto moto = new Moto(marca, modelo, patente, kilometraje);

    if (inventario.agregarMoto(moto)) {
      System.out.println("✅ Moto agregada exitosamente");
    } else {
      System.out.println("❌ Error: Ya existe una moto con esa patente");
    }
  }

  private static void buscarVehiculo(Inventario inventario, Scanner scanner) {
    System.out.print("🔍 Ingrese patente del vehículo a buscar: ");
    String patente = scanner.nextLine();

    Vehiculo vehiculo = inventario.buscarVehiculo(patente.toUpperCase());
    if (vehiculo != null) {
      System.out.println("✅ Vehículo encontrado:");
      String emoji = vehiculo.verTipoDeVehiculo();
      System.out.println(emoji + " " + vehiculo);
    } else {
      System.out.println("❌ No se encontró un vehículo con esa patente");
    }
  }

  private static void eliminarVehiculo(Inventario inventario, Scanner scanner) {
    System.out.print("🗑️ Ingrese patente del vehículo a eliminar: ");
    String patente = scanner.nextLine();

    if (inventario.eliminarVehiculo(patente)) {
      System.out.println("✅ Vehículo eliminado exitosamente");
    } else {
      System.out.println("❌ No se encontró un vehículo con esa patente");
    }
  }

  private static void actualizarAuto(Inventario inventario, Scanner scanner) {
    System.out.print("🔄 Ingrese patente del auto a actualizar: ");
    String patente = scanner.nextLine();

    if (inventario.buscarVehiculo(patente) != null) {
      System.out.println("Ingrese los nuevos datos:");
      System.out.print("Marca: ");
      String marca = scanner.nextLine();
      System.out.print("Modelo: ");
      int modelo = scanner.nextInt();
      System.out.print("Kilometraje: ");
      int kilometraje = scanner.nextInt();
      System.out.print("Número de puertas: ");
      int puertas = scanner.nextInt();
      scanner.nextLine();

      try {
        Auto autoActualizado = new Auto(marca, modelo, patente, kilometraje, puertas);

        if (inventario.actualizarAuto(patente, autoActualizado)) {
          System.out.println("✅ Auto actualizado exitosamente");
        } else {
          System.out.println("❌ Error al actualizar el auto");
        }
      } catch (PuertasInsuficientesException e) {
        System.out.println("❌ Error: " + e.getMessage());
      }
    } else {
      System.out.println("❌ No se encontró un auto con esa patente");
    }
  }

  private static void actualizarMoto(Inventario inventario, Scanner scanner) {
    System.out.print("🔄 Ingrese patente de la moto a actualizar: ");
    String patente = scanner.nextLine();

    if (inventario.buscarVehiculo(patente) != null) {
      System.out.println("Ingrese los nuevos datos:");
      System.out.print("Marca: ");
      String marca = scanner.nextLine();
      System.out.print("Modelo: ");
      int modelo = scanner.nextInt();
      System.out.print("Kilometraje: ");
      int kilometraje = scanner.nextInt();
      scanner.nextLine();

      Moto motoActualizada = new Moto(marca, modelo, patente, kilometraje);

      if (inventario.actualizarMoto(patente, motoActualizada)) {
        System.out.println("✅ Moto actualizada exitosamente");
      } else {
        System.out.println("❌ Error al actualizar la moto");
      }
    } else {
      System.out.println("❌ No se encontró una moto con esa patente");
    }
  }
}
