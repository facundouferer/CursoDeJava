package CursoJava.l11_clases_abstractas_interfaces_y_modelado.integrador_p1_universidad;

import java.util.Scanner;

public class Universidad {
  private static final int CAPACIDAD = 10;

  private final Estudiante[] estudiantes = new Estudiante[CAPACIDAD];
  private final Docente[] docentes = new Docente[CAPACIDAD];
  private int cantidadEstudiantes = 0;
  private int cantidadDocentes = 0;

  // Muestra el informe de cualquier InformeDeDatos; si es un docente, agrega sus materias.
  public static void mostrarInforme(InformeDeDatos objeto) {
    System.out.println(objeto.informe());
    if (objeto instanceof Docente docente) {
      docente.mostrarMaterias();
    }
  }

  // Muestra los estudiantes del arreglo, omitiendo las posiciones vacías.
  public static void mostrarEstudiantes(Estudiante[] estudiantes) {
    System.out.println("=== Lista de Estudiantes ===");
    boolean hayEstudiantes = false;
    for (Estudiante estudiante : estudiantes) {
      if (estudiante != null) {
        System.out.println(estudiante);
        hayEstudiantes = true;
      }
    }
    if (!hayEstudiantes) {
      System.out.println("No hay estudiantes registrados.");
    }
  }

  // Solicita los datos de un docente y las materias que dicta.
  public static Docente registrarDocente(Scanner scanner) {
    System.out.print("Ingrese el nombre del docente: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el apellido del docente: ");
    String apellido = scanner.nextLine();
    System.out.print("Ingrese el DNI del docente: ");
    int dni = Integer.parseInt(scanner.nextLine().trim());
    System.out.print("Ingrese la cantidad de materias que dicta: ");
    int cantidadMaterias = Integer.parseInt(scanner.nextLine().trim());

    Materia[] materias = new Materia[cantidadMaterias];
    for (int i = 0; i < cantidadMaterias; i++) {
      System.out.print("Ingrese el nombre de la materia " + (i + 1) + ": ");
      materias[i] = new Materia(scanner.nextLine());
    }
    return new Docente(nombre, apellido, dni, materias);
  }

  private static Estudiante registrarEstudiante(Scanner scanner) {
    System.out.print("Ingrese el nombre del estudiante: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese el apellido del estudiante: ");
    String apellido = scanner.nextLine();
    System.out.print("Ingrese el DNI del estudiante: ");
    int dni = Integer.parseInt(scanner.nextLine().trim());
    System.out.print("Ingrese la carrera (o presione Enter para 'Sin definir'): ");
    String carrera = scanner.nextLine();

    if (carrera.isBlank()) {
      return new Estudiante(nombre, apellido, dni);
    }
    return new Estudiante(nombre, apellido, dni, carrera);
  }

  // Menú principal: se repite hasta que el usuario elige salir.
  public void menuPrincipal(Scanner scanner) {
    int opcion;
    do {
      System.out.println("\n=== MENÚ PRINCIPAL - UNIVERSIDAD ===");
      System.out.println("1. Registrar estudiante");
      System.out.println("2. Registrar docente");
      System.out.println("3. Mostrar estudiantes");
      System.out.println("4. Mostrar informe de docentes");
      System.out.println("5. Salir");
      System.out.print("Seleccione una opción: ");
      opcion = Integer.parseInt(scanner.nextLine().trim());

      switch (opcion) {
        case 1 -> {
          if (cantidadEstudiantes < estudiantes.length) {
            estudiantes[cantidadEstudiantes++] = registrarEstudiante(scanner);
          } else {
            System.out.println("No hay lugar para más estudiantes.");
          }
        }
        case 2 -> {
          if (cantidadDocentes < docentes.length) {
            docentes[cantidadDocentes++] = registrarDocente(scanner);
          } else {
            System.out.println("No hay lugar para más docentes.");
          }
        }
        case 3 -> mostrarEstudiantes(estudiantes);
        case 4 -> {
          for (int i = 0; i < cantidadDocentes; i++) {
            mostrarInforme(docentes[i]);
          }
        }
        case 5 -> System.out.println("¡Hasta luego!");
        default -> System.out.println("Opción inválida.");
      }
    } while (opcion != 5);
  }
}
