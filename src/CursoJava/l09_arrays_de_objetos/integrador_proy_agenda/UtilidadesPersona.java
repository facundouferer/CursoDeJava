package CursoJava.l09_arrays_de_objetos.integrador_proy_agenda;

import java.util.Scanner;

/** Menú y entrada de datos por consola de la agenda. */
public final class UtilidadesPersona {

  private UtilidadesPersona() {
  }

  public static void mostrarMenu() {
    System.out.println("1) Listar personas");
    System.out.println("2) Agregar persona");
    System.out.println("3) Eliminar persona");
    System.out.println("4) Editar persona");
    System.out.println("5) Buscar persona");
    System.out.println("6) Salir");
  }

  public static void agregarPersona(Agenda agenda, Scanner scanner) {
    System.out.print("Ingrese el nombre: ");
    String nombre = scanner.nextLine();
    int dni = leerEntero(scanner, "Ingrese el DNI: ");
    if (agenda.existeDni(dni)) {
      System.out.println("Error: ya existe una persona registrada con el DNI " + dni + ".");
      return;
    }
    System.out.print("Ingrese el teléfono: ");
    String telefono = scanner.nextLine();
    agenda.agregarPersona(new Persona(nombre, dni, telefono));
    System.out.println("Persona agregada correctamente.");
  }

  public static void eliminarPersona(Agenda agenda, Scanner scanner) {
    System.out.print("Ingrese el nombre de la persona a eliminar: ");
    String nombre = scanner.nextLine();
    if (agenda.eliminarPersona(nombre)) {
      System.out.println("Persona eliminada correctamente.");
    } else {
      System.out.println("Persona no encontrada.");
    }
  }

  public static void editarPersona(Agenda agenda, Scanner scanner) {
    agenda.listarPersonas();
    int posicion = leerEntero(scanner, "Ingrese el número de la persona a editar: ");
    System.out.print("Ingrese el nuevo nombre: ");
    String nuevoNombre = scanner.nextLine();
    int nuevoDni = leerEntero(scanner, "Ingrese el nuevo DNI: ");
    agenda.editarPersona(posicion, nuevoNombre, nuevoDni);
  }

  public static void buscarPersona(Agenda agenda, Scanner scanner) {
    System.out.print("Ingrese el texto a buscar: ");
    agenda.buscarPersona(scanner.nextLine());
  }

  /** Lee un entero; repite la consulta mientras el texto ingresado no sea válido. */
  public static int leerEntero(Scanner scanner, String mensaje) {
    while (true) {
      System.out.print(mensaje);
      try {
        return Integer.parseInt(scanner.nextLine().trim());
      } catch (NumberFormatException e) {
        System.out.println("Ingrese un número entero válido.");
      }
    }
  }
}
