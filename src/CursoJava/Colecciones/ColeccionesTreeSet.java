package CursoJava.Colecciones;

import java.util.Scanner;
import java.util.TreeSet;

class EmpleadoTree implements Comparable<EmpleadoTree> {
  private String nombre;
  private int id;
  private String departamento;

  public EmpleadoTree(String nombre, int id, String departamento) {
    this.nombre = nombre;
    this.id = id;
    this.departamento = departamento;
  }

  public String getNombre() {
    return nombre;
  }

  public int getId() {
    return id;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  @Override
  public String toString() {
    return "Empleado{" +
        "nombre='" + nombre + '\'' +
        ", id=" + id +
        ", departamento='" + departamento + '\'' +
        '}';
  }

  @Override
  public int compareTo(EmpleadoTree otro) {
    return Integer.compare(this.id, otro.id);
  }

  @Override
  public int hashCode() {
    return id;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    EmpleadoTree empleado = (EmpleadoTree) obj;
    return id == empleado.id;
  }
}

public class ColeccionesTreeSet {
  private TreeSet<EmpleadoTree> empleados;
  private Scanner scanner;

  public ColeccionesTreeSet() {
    empleados = new TreeSet<>();
    scanner = new Scanner(System.in);
  }

  public void mostrarMenu() {
    int opcion;
    do {
      System.out.println("\n==================================");
      System.out.println("CRUD DE EMPLEADOS - MENU DE OPCIONES");
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
      scanner.nextLine(); // Limpiar el buffer del scanner

      switch (opcion) {
        case 1:
          agregarEmpleado();
          break;
        case 2:
          buscarEmpleado();
          break;
        case 3:
          eliminarEmpleado();
          break;
        case 4:
          listarEmpleados();
          break;
        case 5:
          editarEmpleado();
          break;
        case 6:
          System.out.println("Saliendo del programa.");
          break;
        default:
          System.out.println("Opción no válida.");
          break;
      }
    } while (opcion != 6);
  }

  private void agregarEmpleado() {
    System.out.print("Ingrese el nombre del empleado: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el ID del empleado: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer del scanner
    System.out.print("Ingrese el departamento del empleado: ");
    String departamento = scanner.nextLine();
    EmpleadoTree empleado = new EmpleadoTree(nombre, id, departamento);
    if (empleados.add(empleado)) {
      System.out.println("Empleado agregado correctamente.");
    } else {
      System.out.println("El empleado con ID " + id + " ya existe.");
    }
  }

  private void buscarEmpleado() {
    System.out.print("Ingrese el ID del empleado a buscar: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer del scanner
    for (EmpleadoTree empleado : empleados) {
      if (empleado.getId() == id) {
        System.out.println("Empleado encontrado: " + empleado);
        return;
      }
    }
    System.out.println("Empleado no encontrado.");
  }

  private void eliminarEmpleado() {
    System.out.print("Ingrese el ID del empleado a eliminar: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer del scanner
    EmpleadoTree empleadoAEliminar = null;
    for (EmpleadoTree empleado : empleados) {
      if (empleado.getId() == id) {
        empleadoAEliminar = empleado;
        break;
      }
    }
    if (empleadoAEliminar != null) {
      empleados.remove(empleadoAEliminar);
      System.out.println("Empleado eliminado correctamente.");
    } else {
      System.out.println("Empleado no encontrado.");
    }
  }

  private void listarEmpleados() {
    if (empleados.isEmpty()) {
      System.out.println("No hay empleados en la lista.");
    } else {
      System.out.println("Listado de empleados:");
      for (EmpleadoTree empleado : empleados) {
        System.out.println(empleado);
      }
    }
  }

  private void editarEmpleado() {
    System.out.print("Ingrese el ID del empleado a editar: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer del scanner
    for (EmpleadoTree empleado : empleados) {
      if (empleado.getId() == id) {
        System.out.print("Ingrese el nuevo nombre del empleado: ");
        String nuevoNombre = scanner.nextLine();
        System.out.print("Ingrese el nuevo departamento del empleado: ");
        String nuevoDepartamento = scanner.nextLine();
        empleado.setNombre(nuevoNombre);
        empleado.setDepartamento(nuevoDepartamento);
        System.out.println("Empleado editado correctamente.");
        return;
      }
    }
    System.out.println("Empleado no encontrado.");
  }

  public static void main(String[] args) {
    ColeccionesTreeSet app = new ColeccionesTreeSet();
    app.mostrarMenu();
  }
}