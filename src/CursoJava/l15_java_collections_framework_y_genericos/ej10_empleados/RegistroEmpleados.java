/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Ofrecer un menú para dar de alta, buscar, eliminar, listar y editar empleados.
 * Concepto: Cuál elegir: el registro depende de Collection<Empleado> y no de la implementación concreta.
 */
package CursoJava.l15_java_collections_framework_y_genericos.ej10_empleados;

import java.util.Collection;
import java.util.Scanner;

public class RegistroEmpleados {
  private final Collection<Empleado> empleados;
  private final Scanner scanner;

  public RegistroEmpleados(Collection<Empleado> empleados, Scanner scanner) {
    this.empleados = empleados;
    this.scanner = scanner;
  }

  public void mostrarMenu() {
    int opcion;
    do {
      System.out.println("\n==================================");
      System.out.println("CRUD DE EMPLEADOS - MENÚ DE OPCIONES");
      System.out.println("==================================");
      System.out.println("1. Agregar empleado");
      System.out.println("2. Buscar empleado por ID");
      System.out.println("3. Eliminar empleado por ID");
      System.out.println("4. Listar empleados");
      System.out.println("5. Editar empleado por ID");
      System.out.println("6. Salir");
      System.out.println("==================================");
      System.out.print("Por favor, ingrese el número de la opción que desea realizar: ");
      opcion = scanner.nextInt();
      scanner.nextLine(); // descarta el salto de línea pendiente

      switch (opcion) {
        case 1 -> agregarEmpleado();
        case 2 -> buscarEmpleado();
        case 3 -> eliminarEmpleado();
        case 4 -> listarEmpleados();
        case 5 -> editarEmpleado();
        case 6 -> System.out.println("Saliendo del programa.");
        default -> System.out.println("Opción no válida.");
      }
    } while (opcion != 6);
  }

  private void agregarEmpleado() {
    System.out.print("Ingrese el nombre del empleado: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el ID del empleado: ");
    int id = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Ingrese el departamento del empleado: ");
    String departamento = scanner.nextLine();
    // add() devuelve false cuando la colección rechaza el elemento (Set y TreeSet con ID repetido)
    if (empleados.add(new Empleado(nombre, id, departamento))) {
      System.out.println("Empleado agregado correctamente.");
    } else {
      System.out.println("El empleado con ID " + id + " ya existe.");
    }
  }

  private Empleado buscarPorId(int id) {
    for (Empleado empleado : empleados) {
      if (empleado.getId() == id) {
        return empleado;
      }
    }
    return null;
  }

  private void buscarEmpleado() {
    System.out.print("Ingrese el ID del empleado a buscar: ");
    int id = scanner.nextInt();
    scanner.nextLine();
    Empleado empleado = buscarPorId(id);
    if (empleado != null) {
      System.out.println("Empleado encontrado: " + empleado);
    } else {
      System.out.println("Empleado no encontrado.");
    }
  }

  private void eliminarEmpleado() {
    System.out.print("Ingrese el ID del empleado a eliminar: ");
    int id = scanner.nextInt();
    scanner.nextLine();
    Empleado empleado = buscarPorId(id);
    if (empleado != null) {
      empleados.remove(empleado);
      System.out.println("Empleado eliminado correctamente.");
    } else {
      System.out.println("Empleado no encontrado.");
    }
  }

  private void listarEmpleados() {
    if (empleados.isEmpty()) {
      System.out.println("No hay empleados registrados.");
    } else {
      System.out.println("Listado de empleados:");
      empleados.forEach(System.out::println);
    }
  }

  private void editarEmpleado() {
    System.out.print("Ingrese el ID del empleado a editar: ");
    int id = scanner.nextInt();
    scanner.nextLine();
    Empleado empleado = buscarPorId(id);
    if (empleado == null) {
      System.out.println("Empleado no encontrado.");
      return;
    }
    System.out.print("Ingrese el nuevo nombre del empleado: ");
    empleado.setNombre(scanner.nextLine());
    System.out.print("Ingrese el nuevo departamento del empleado: ");
    empleado.setDepartamento(scanner.nextLine());
    System.out.println("Empleado editado correctamente.");
  }
}
