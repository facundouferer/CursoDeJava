package CursoJava.Arreglos;

import java.util.ArrayList;
import java.util.Scanner;

class Persona {
  private String nombre;
  private int dni;
  private int tel;

  public Persona(String nombre, int dni, int tel) {
    this.nombre = nombre;
    this.dni = dni;
    this.tel = tel;
  }

  public int getDni() {
    return dni;
  }

  public String getNombre() {
    return nombre;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + ", DNI: " + dni + ", Teléfono: " + tel;
  }
}

class Directorio {
  ArrayList<Persona> personas;

  public Directorio() {
    personas = new ArrayList<>();
  }

  public void agregarPersona(Persona persona) {
    personas.add(persona);
  }

  public void listarPersonas() {
    System.out.println("Listado de personas:");
    for (Persona persona : personas) {
      System.out.println(persona);
    }
  }

  public Persona buscarPorNombre(String nombre) {
    for (Persona persona : personas) {
      if (persona.getNombre().equals(nombre)) {
        return persona;
      }
    }
    return null;
  }

  public Persona buscarPorDni(int dni) {
    for (Persona persona : personas) {
      if (persona.getDni() == dni) {
        return persona;
      }
    }
    return null;
  }

  public void editarPersona(String nombre, int dni, int tel) {
    for (Persona persona : personas) {
      if (persona.getDni() == dni) {
        Persona personaAEditar = new Persona(nombre, dni, tel);
        personas.set(personas.indexOf(persona), personaAEditar);
        break;
      }
    }
  }

  public void eliminarPorNombre(String nombre) {
    Persona personaAEliminar = this.buscarPorNombre(nombre);
    if (personaAEliminar != null) {
      personas.remove(personaAEliminar);
    }
  }

  public void eliminarPorDni(int dni) {
    Persona personaAEliminar = this.buscarPorDni(dni);
    if (personaAEliminar != null) {
      personas.remove(personaAEliminar);
    }
  }
}

class Menu {
  private Directorio directorio;
  private Scanner scanner;

  public Menu() {
    directorio = new Directorio();
    scanner = new Scanner(System.in);
  }

  public void mostrarMenu() {
    int opcion;
    do {
      System.out.println("\n==================================");
      System.out.println("DIRECTORIO - MENU DE OPCIONES");
      System.out.println("==================================");
      System.out.println("1. Agregar persona");
      System.out.println("2. Buscar persona por nombre");
      System.out.println("3. Buscar persona por DNI");
      System.out.println("4. Eliminar persona por nombre");
      System.out.println("5. Eliminar persona por DNI");
      System.out.println("6. Listar personas");
      System.out.println("7. Editar persona");
      System.out.println("8. Salir");
      System.out.println("==================================");
      System.out.print("Por favor, ingrese el número de la opción que desea realizar: ");
      opcion = scanner.nextInt();
      scanner.nextLine(); // MUY IMPORTANTE PARA QUE no haga doble salto de lína -> Limpiar el buffer del
                          // scanner

      switch (opcion) {
        case 1:
          agregarPersona();
          break;
        case 2:
          buscarPorNombre();
          break;
        case 3:
          buscarPorDni();
          break;
        case 4:
          eliminarPorNombre();
          break;
        case 5:
          eliminarPorDni();
          break;
        case 6:
          directorio.listarPersonas();
          break;
        case 7:
          editarPersona();
          break;
        case 8:
          System.out.println("Saliendo del programa.");
          break;
        default:
          System.out.println("Opción no válida.");
          break;
      }
    } while (opcion != 8);
  }

  private void agregarPersona() {
    System.out.print("Ingrese el nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el DNI: ");
    int dni = scanner.nextInt();
    System.out.print("Ingrese el teléfono: ");
    int tel = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer del scanner
    Persona persona = new Persona(nombre, dni, tel);
    directorio.agregarPersona(persona);
    System.out.println("Persona agregada correctamente.");
  }

  private void buscarPorNombre() {
    System.out.print("Ingrese el nombre: ");
    String nombre = scanner.nextLine();
    Persona persona = directorio.buscarPorNombre(nombre);
    if (persona != null) {
      System.out.println("Persona encontrada: " + persona);
    } else {
      System.out.println("Persona no encontrada.");
    }
  }

  private void buscarPorDni() {
    System.out.print("Ingrese el DNI: ");
    int dni = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer del scanner
    Persona persona = directorio.buscarPorDni(dni);
    if (persona != null) {
      System.out.println("Persona encontrada: " + persona);
    } else {
      System.out.println("Persona no encontrada.");
    }
  }

  private void eliminarPorNombre() {
    System.out.print("Ingrese el nombre: ");
    String nombre = scanner.nextLine();
    directorio.eliminarPorNombre(nombre);
    System.out.println("Persona eliminada correctamente.");
  }

  private void eliminarPorDni() {
    System.out.print("Ingrese el DNI: ");
    int dni = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer del scanner
    directorio.eliminarPorDni(dni);
    System.out.println("Persona eliminada correctamente.");
  }

  private void editarPersona() {
    System.out.print("Ingrese el DNI de la persona a editar: ");
    int dni = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer del scanner
    System.out.print("Ingrese el nuevo nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el nuevo teléfono: ");
    int tel = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer del scanner
    directorio.editarPersona(nombre, dni, tel);
    System.out.println("Persona editada correctamente.");
  }
}

public class OperacionesBasicas {
  public static void main(String[] args) {
    Menu menu = new Menu();
    menu.mostrarMenu();
  }
}