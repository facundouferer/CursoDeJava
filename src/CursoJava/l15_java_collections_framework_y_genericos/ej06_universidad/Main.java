/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Administrar por consola el profesor y los estudiantes de un curso.
 * Concepto: Familia List: menú interactivo sobre un curso respaldado por una List.
 */
package CursoJava.l15_java_collections_framework_y_genericos.ej06_universidad;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Curso curso = new Curso();

    while (true) {
      System.out.println("\n1. Asignar profesor al curso");
      System.out.println("2. Agregar estudiante al curso");
      System.out.println("3. Editar estudiante");
      System.out.println("4. Eliminar estudiante");
      System.out.println("5. Mostrar detalles del curso");
      System.out.println("6. Salir");
      System.out.print("Seleccione una opción: ");
      int opcion = Integer.parseInt(scanner.nextLine().trim());

      switch (opcion) {
        case 1 -> {
          System.out.print("Ingrese el nombre del profesor: ");
          String nombre = scanner.nextLine();
          System.out.print("Ingrese el apellido del profesor: ");
          String apellido = scanner.nextLine();
          System.out.print("Ingrese el DNI del profesor: ");
          String dni = scanner.nextLine();
          System.out.print("Ingrese el sueldo del profesor: ");
          double sueldo = Double.parseDouble(scanner.nextLine().trim());
          curso.setProfesor(new Profesor(nombre, apellido, dni, sueldo));
        }
        case 2 -> {
          System.out.print("Ingrese el nombre del estudiante: ");
          String nombre = scanner.nextLine();
          System.out.print("Ingrese el apellido del estudiante: ");
          String apellido = scanner.nextLine();
          System.out.print("Ingrese el DNI del estudiante: ");
          String dni = scanner.nextLine();
          System.out.print("Ingrese el legajo del estudiante: ");
          String legajo = scanner.nextLine();
          curso.agregarEstudiante(new Estudiante(nombre, apellido, dni, legajo));
        }
        case 3 -> {
          System.out.print("Ingrese el DNI del estudiante a editar: ");
          String dni = scanner.nextLine();
          System.out.print("Ingrese el nuevo nombre del estudiante: ");
          String nombre = scanner.nextLine();
          System.out.print("Ingrese el nuevo apellido del estudiante: ");
          String apellido = scanner.nextLine();
          System.out.print("Ingrese el nuevo legajo del estudiante: ");
          String legajo = scanner.nextLine();
          if (!curso.editarEstudiante(dni, nombre, apellido, legajo)) {
            System.out.println("No hay ningún estudiante con ese DNI.");
          }
        }
        case 4 -> {
          System.out.print("Ingrese el DNI del estudiante a eliminar: ");
          if (!curso.eliminarEstudiante(scanner.nextLine())) {
            System.out.println("No hay ningún estudiante con ese DNI.");
          }
        }
        case 5 -> System.out.println(curso);
        case 6 -> {
          scanner.close();
          return;
        }
        default -> System.out.println("Opción inválida. Por favor, intente de nuevo.");
      }
    }
  }
}
