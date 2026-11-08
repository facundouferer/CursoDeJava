package CursoJava.l16_iteradores_ordenamiento_equals_hashcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Administrar empleados recorriendo, buscando y eliminando con un Iterator.
 * Concepto: 1. Qué hay realmente detrás de un for-each.
 */
public class Ej01IteradorEmpleados {

  static class Empleado {
    private String nombre;
    private final int id;
    private String departamento;

    Empleado(String nombre, int id, String departamento) {
      this.nombre = nombre;
      this.id = id;
      this.departamento = departamento;
    }

    int getId() {
      return id;
    }

    void setNombre(String nombre) {
      this.nombre = nombre;
    }

    void setDepartamento(String departamento) {
      this.departamento = departamento;
    }

    @Override
    public String toString() {
      return "Empleado{nombre='" + nombre + "', id=" + id + ", departamento='" + departamento + "'}";
    }
  }

  private final List<Empleado> empleados = new ArrayList<>();
  private final Scanner scanner = new Scanner(System.in);

  public void mostrarMenu() {
    int opcion;
    do {
      System.out.println("\n==================================");
      System.out.println("GESTIÓN DE EMPLEADOS - MENÚ DE OPCIONES");
      System.out.println("==================================");
      System.out.println("1. Agregar empleado");
      System.out.println("2. Buscar empleado por ID");
      System.out.println("3. Eliminar empleado por ID");
      System.out.println("4. Listar empleados");
      System.out.println("5. Editar empleado por ID");
      System.out.println("6. Salir");
      System.out.println("==================================");
      System.out.print("Ingrese el número de la opción que desea realizar: ");
      opcion = scanner.nextInt();
      scanner.nextLine();

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

  private int leerId(String mensaje) {
    System.out.print(mensaje);
    int id = scanner.nextInt();
    scanner.nextLine();
    return id;
  }

  private void agregarEmpleado() {
    System.out.print("Ingrese el nombre del empleado: ");
    String nombre = scanner.nextLine();
    int id = leerId("Ingrese el ID del empleado: ");
    System.out.print("Ingrese el departamento del empleado: ");
    String departamento = scanner.nextLine();
    empleados.add(new Empleado(nombre, id, departamento));
    System.out.println("Empleado agregado correctamente.");
  }

  private void buscarEmpleado() {
    int id = leerId("Ingrese el ID del empleado a buscar: ");
    Iterator<Empleado> iterador = empleados.iterator();
    while (iterador.hasNext()) {
      Empleado empleado = iterador.next();
      if (empleado.getId() == id) {
        System.out.println("Empleado encontrado: " + empleado);
        return;
      }
    }
    System.out.println("Empleado no encontrado.");
  }

  /** Eliminar mientras se recorre solo es seguro con Iterator.remove(). */
  private void eliminarEmpleado() {
    int id = leerId("Ingrese el ID del empleado a eliminar: ");
    Iterator<Empleado> iterador = empleados.iterator();
    while (iterador.hasNext()) {
      if (iterador.next().getId() == id) {
        iterador.remove();
        System.out.println("Empleado eliminado correctamente.");
        return;
      }
    }
    System.out.println("Empleado no encontrado.");
  }

  private void listarEmpleados() {
    if (empleados.isEmpty()) {
      System.out.println("No hay empleados en la lista.");
      return;
    }
    System.out.println("Listado de empleados:");
    for (Empleado empleado : empleados) {
      System.out.println(empleado);
    }
  }

  private void editarEmpleado() {
    int id = leerId("Ingrese el ID del empleado a editar: ");
    Iterator<Empleado> iterador = empleados.iterator();
    while (iterador.hasNext()) {
      Empleado empleado = iterador.next();
      if (empleado.getId() == id) {
        System.out.print("Ingrese el nuevo nombre del empleado: ");
        empleado.setNombre(scanner.nextLine());
        System.out.print("Ingrese el nuevo departamento del empleado: ");
        empleado.setDepartamento(scanner.nextLine());
        System.out.println("Empleado editado correctamente.");
        return;
      }
    }
    System.out.println("Empleado no encontrado.");
  }

  public static void main(String[] args) {
    new Ej01IteradorEmpleados().mostrarMenu();
  }
}
