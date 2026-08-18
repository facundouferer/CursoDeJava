package exam.Parcial2025.Segundo.Veterinaria;

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
       * Trata de parsear a un integer,
       * si es una letra fallará entonces el error
       * provocará que salga.
       **/
      try {
        opcion = Integer.parseInt(input);
      } catch (NumberFormatException e) {
        System.out.println("\n👋 ¡Gracias por usar el sistema veterinario!");
        break;
      }

      switch (opcion) {
        case 1:
          agregarAvicola(inventario, scanner);
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 2:
          agregarCacera(inventario, scanner);
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 3:
          inventario.listarTodosLosAnimales();
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 4:
          buscarAnimal(inventario, scanner);
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 5:
          eliminarAnimal(inventario, scanner);
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 6:
          System.out.println("Total de animales: " + inventario.getCantidadDeAnimales());
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 7:
          actualizarAvicola(inventario, scanner);
          System.out.println("\nPresione Enter para continuar...");
          scanner.nextLine();
          break;
        case 8:
          actualizarCacera(inventario, scanner);
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

  private static void agregarAvicola(Inventario inventario, Scanner scanner) {
    System.out.println("\n📝 AGREGAR NUEVO ANIMAL AVÍCOLA");
    System.out.print("Ingrese nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese especie: ");
    String especie = scanner.nextLine();
    System.out.print("Ingrese edad: ");
    int edad = scanner.nextInt();
    System.out.print("Ingrese peso (kg): ");
    double peso = scanner.nextDouble();
    System.out.print("Ingrese tipo de plumaje (EXOTICO/COLORIDO/COMUN): ");
    scanner.nextLine(); // Limpiar buffer
    String tipoPlumaje = scanner.nextLine();

    try {
      Avicolas avicola = new Avicolas(especie, edad, nombre, peso, tipoPlumaje);

      if (inventario.agregarAvicola(avicola)) {
        System.out.println("✅ Animal avícola agregado exitosamente");
      } else {
        System.out.println("❌ Error: Ya existe un animal con ese nombre");
      }
    } catch (PesoInsuficienteException e) {
      System.out.println("❌ Error: " + e.getMessage());
    }
  }

  private static void agregarCacera(Inventario inventario, Scanner scanner) {
    System.out.println("\n📝 AGREGAR NUEVO ANIMAL CAZADOR");
    System.out.print("Ingrese nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese especie: ");
    String especie = scanner.nextLine();
    System.out.print("Ingrese edad: ");
    int edad = scanner.nextInt();
    System.out.print("Ingrese peso (kg): ");
    double peso = scanner.nextDouble();
    scanner.nextLine(); // Limpiar buffer

    Caceras cacera = new Caceras(especie, edad, nombre, peso);

    if (inventario.agregarCacera(cacera)) {
      System.out.println("✅ Animal cazador agregado exitosamente");
    } else {
      System.out.println("❌ Error: Ya existe un animal con ese nombre");
    }
  }

  private static void buscarAnimal(Inventario inventario, Scanner scanner) {
    System.out.print("🔍 Ingrese nombre del animal a buscar: ");
    String nombre = scanner.nextLine();

    Animalito animal = inventario.buscarAnimal(nombre.toUpperCase());
    if (animal != null) {
      System.out.println("✅ Animal encontrado:");
      String emoji = animal.verTipoDeAnimal();
      System.out.println(emoji + " " + animal);
    } else {
      System.out.println("❌ No se encontró un animal con ese nombre");
    }
  }

  private static void eliminarAnimal(Inventario inventario, Scanner scanner) {
    System.out.print("🗑️ Ingrese nombre del animal a eliminar: ");
    String nombre = scanner.nextLine();

    if (inventario.eliminarAnimal(nombre.toUpperCase())) {
      System.out.println("✅ Animal eliminado exitosamente");
    } else {
      System.out.println("❌ No se encontró un animal con ese nombre");
    }
  }

  private static void actualizarAvicola(Inventario inventario, Scanner scanner) {
    System.out.print("🔄 Ingrese nombre del animal avícola a actualizar: ");
    String nombre = scanner.nextLine();

    if (inventario.buscarAnimal(nombre.toUpperCase()) != null) {
      System.out.println("Ingrese los nuevos datos:");
      System.out.print("Especie: ");
      String especie = scanner.nextLine();
      System.out.print("Edad: ");
      int edad = scanner.nextInt();
      System.out.print("Peso (kg): ");
      double peso = scanner.nextDouble();
      System.out.print("Tipo de plumaje: ");
      scanner.nextLine(); // Limpiar buffer
      String tipoPlumaje = scanner.nextLine();

      try {
        Avicolas avicolaActualizada = new Avicolas(especie, edad, nombre, peso, tipoPlumaje);

        if (inventario.actualizarAvicola(nombre.toUpperCase(), avicolaActualizada)) {
          System.out.println("✅ Animal avícola actualizado exitosamente");
        } else {
          System.out.println("❌ Error al actualizar el animal avícola");
        }
      } catch (PesoInsuficienteException e) {
        System.out.println("❌ Error: " + e.getMessage());
      }
    } else {
      System.out.println("❌ No se encontró un animal avícola con ese nombre");
    }
  }

  private static void actualizarCacera(Inventario inventario, Scanner scanner) {
    System.out.print("🔄 Ingrese nombre del animal cazador a actualizar: ");
    String nombre = scanner.nextLine();

    if (inventario.buscarAnimal(nombre.toUpperCase()) != null) {
      System.out.println("Ingrese los nuevos datos:");
      System.out.print("Especie: ");
      String especie = scanner.nextLine();
      System.out.print("Edad: ");
      int edad = scanner.nextInt();
      System.out.print("Peso (kg): ");
      double peso = scanner.nextDouble();
      scanner.nextLine(); // Limpiar buffer

      Caceras caceraActualizada = new Caceras(especie, edad, nombre, peso);

      if (inventario.actualizarCacera(nombre.toUpperCase(), caceraActualizada)) {
        System.out.println("✅ Animal cazador actualizado exitosamente");
      } else {
        System.out.println("❌ Error al actualizar el animal cazador");
      }
    } else {
      System.out.println("❌ No se encontró un animal cazador con ese nombre");
    }
  }
}