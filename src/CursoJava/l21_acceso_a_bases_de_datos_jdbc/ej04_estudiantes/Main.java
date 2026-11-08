package CursoJava.l21_acceso_a_bases_de_datos_jdbc.ej04_estudiantes;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 * Lección 21 – Acceso a Bases de Datos con JDBC y SQL Seguro
 * Objetivo: Administrar los estudiantes de la universidad desde un menú de consola.
 * Concepto: 6. El patrón DAO.
 */
public class Main {

  private static final EstudianteDAO DAO = new EstudianteDAO();
  private static final Scanner TECLADO = new Scanner(System.in);

  public static void main(String[] args) {
    boolean salir = false;
    while (!salir) {
      System.out.println("Menú:");
      System.out.println("1. Mostrar estudiantes");
      System.out.println("2. Agregar estudiante");
      System.out.println("3. Editar estudiante");
      System.out.println("4. Eliminar estudiante");
      System.out.println("5. Mostrar estudiantes mayores de...");
      System.out.println("6. Buscar estudiantes por nombre");
      System.out.println("7. Salir");
      System.out.print("Seleccione una opción: ");

      try {
        switch (leerEntero()) {
          case 1 -> mostrar(DAO.listar());
          case 2 -> agregar();
          case 3 -> editar();
          case 4 -> eliminar();
          case 5 -> {
            System.out.print("Edad mínima: ");
            mostrar(DAO.listarConEdadMinima(leerEntero()));
          }
          case 6 -> {
            System.out.print("Nombre: ");
            mostrar(DAO.buscarPorNombre(TECLADO.nextLine().trim()));
          }
          case 7 -> salir = true;
          default -> System.out.println("Opción no válida. Por favor, elija una opción del menú.");
        }
      } catch (SQLException e) {
        System.out.println("Error al acceder a la base de datos: " + e.getMessage());
      } catch (NumberFormatException e) {
        System.out.println("Debe ingresar un número entero.");
      }
    }
  }

  private static void agregar() throws SQLException {
    Estudiante nuevo = leerEstudiante(0);
    System.out.println(DAO.agregar(nuevo) ? "Estudiante agregado exitosamente." : "No se pudo agregar el estudiante.");
  }

  private static void editar() throws SQLException {
    System.out.print("ID del estudiante a editar: ");
    int id = leerEntero();
    if (!DAO.existe(id)) {
      System.out.println("El estudiante no existe.");
      return;
    }
    System.out.println("Ingrese los nuevos datos del estudiante.");
    Estudiante modificado = leerEstudiante(id);
    System.out.println(DAO.editar(modificado) ? "Estudiante editado exitosamente." : "No se pudo editar el estudiante.");
  }

  private static void eliminar() throws SQLException {
    System.out.print("ID del estudiante a eliminar: ");
    int id = leerEntero();
    if (!DAO.existe(id)) {
      System.out.println("El estudiante no existe.");
      return;
    }
    System.out.println(DAO.eliminar(id) ? "Estudiante eliminado exitosamente." : "No se pudo eliminar el estudiante.");
  }

  private static void mostrar(List<Estudiante> estudiantes) {
    System.out.println("ID\tNombre\tApellido\tLegajo\tDNI\tFecha de nacimiento\tDirección\tTeléfono\tEmail");
    for (Estudiante e : estudiantes) {
      System.out.println(e.id() + "\t" + e.nombre() + "\t" + e.apellido() + "\t" + e.legajo() + "\t" + e.dni()
          + "\t" + e.fechaNacimiento() + "\t" + e.direccion() + "\t" + e.telefono() + "\t" + e.email());
    }
  }

  private static Estudiante leerEstudiante(int id) {
    String nombre = leerTexto("Nombre");
    String apellido = leerTexto("Apellido");
    String legajo = leerTexto("Legajo");
    String dni = leerTexto("DNI");
    String fecha = leerTexto("Fecha de nacimiento (AAAA-MM-DD)");
    String direccion = leerTexto("Dirección");
    String telefono = leerTexto("Teléfono");
    String email = leerTexto("Email");
    return new Estudiante(id, nombre, apellido, legajo, dni, fecha, direccion, telefono, email);
  }

  private static String leerTexto(String etiqueta) {
    System.out.print(etiqueta + ": ");
    return TECLADO.nextLine();
  }

  private static int leerEntero() {
    return Integer.parseInt(TECLADO.nextLine().trim());
  }
}
