package Parciales.Parcial2025.Primero;

import java.util.Scanner;

class Persona {
  private String nombre, apellido;
  private int dni;

  public Persona(String nombre, String apellido, int dni) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
  }

  @Override
  public String toString() {
    return "- " + this.apellido + ", " + this.nombre + " (DNI: " + this.dni + ")";
  }
}

class Estudiantes extends Persona {
  private String carrera;

  public Estudiantes(String nombre, String apellido, int dni, String carrera) {
    super(nombre, apellido, dni);
    this.carrera = carrera;
  }

  public Estudiantes(String nombre, String apellido, int dni) {
    super(nombre, apellido, dni);
    this.carrera = "Sin definir";
  }

  public void modificarCarrera(String nuevaCarrera) {
    this.carrera = nuevaCarrera;
  }

  @Override
  public String toString() {
    return super.toString() + " - Carrera: " + this.carrera;
  }

}

class Materia {
  private String nombre;

  public Materia(String nombre) {
    this.nombre = nombre;
  }

  public String toString() {
    return "- " + this.nombre;
  }
}

class Docentes extends Persona implements InformeDeDatos {
  private Materia[] materias;

  public Docentes(String nombre, String apellido, int dni, Materia[] materias) {
    super(nombre, apellido, dni);
    this.materias = materias;
  }

  @Override
  public String informe() {
    return "El docente " + super.toString() + " dicta materias:";
  }

  public void mostrarMaterias() {
    for (Materia materia : materias) {
      System.out.println(materia.toString());
    }
  }

  @Override
  public String toString() {
    return super.toString();
  }

  /*
   * 2) CODEAR:
   * Desarrolla una función que reciba un objeto que implemente la interfaz
   * InformeDeDatos y muestre en pantalla el informe generado. Además,
   * si se trata de un docente, también deben mostrarse todas las materias que
   * dicta.
   */
  @Override
  public void mostrarInforme(InformeDeDatos objeto) {
    System.out.println(objeto.informe());
    this.mostrarMaterias();
  }

}

interface InformeDeDatos {
  public String informe();

  public void mostrarInforme(InformeDeDatos objeto);
}

class Universidad {
  Estudiantes[] estudiantes = new Estudiantes[10];
  Docentes[] docentes = new Docentes[10];

  /*
   * 1) CODEAR:
   * Desarrolla una función que permita registrar un docente.
   * El programa debe solicitar al usuario el nombre, apellido, DNI y la cantidad
   * de materias que dicta,
   * para luego pedir el nombre de cada materia. Finalmente debe devolver
   * un objeto Docentes con esas materias asignadas.
   */

  public Docentes registrarDocente() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el nombre del docente: ");
    String nombre = scanner.nextLine();

    System.out.print("Ingrese el apellido del docente: ");
    String apellido = scanner.nextLine();

    System.out.print("Ingrese el DNI del docente: ");
    int dni = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer

    System.out.print("Ingrese la cantidad de materias que dicta: ");
    int cantidadMaterias = scanner.nextInt();
    scanner.nextLine(); // Limpiar el buffer

    Materia[] materias = new Materia[cantidadMaterias];

    for (int i = 0; i < cantidadMaterias; i++) {
      System.out.print("Ingrese el nombre de la materia " + (i + 1) + ": ");
      String nombreMateria = scanner.nextLine();
      materias[i] = new Materia(nombreMateria);
    }
    scanner.close();
    return new Docentes(nombre, apellido, dni, materias);

  }

  /*
   * 3) CODEAR:
   * Desarrolla una función que reciba un arreglo de estudiantes y muestre en
   * pantalla los datos de cada uno.
   * En caso de que existan posiciones vacías en el arreglo, estas no deben
   * mostrarse.
   */
  public void mostrarEstudiantes(Estudiantes[] estudiantes) {
    System.out.println("=== Lista de Estudiantes ===");

    boolean hayEstudiantes = false;

    for (int i = 0; i < estudiantes.length; i++) {
      if (estudiantes[i] != null) {
        System.out.println(estudiantes[i].toString());
        hayEstudiantes = true;
      }
    }

    if (!hayEstudiantes) {
      System.out.println("No hay estudiantes registrados.");
    }
  }

  private Estudiantes registrarEstudiante() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el nombre del estudiante: ");
    String nombre = scanner.nextLine();

    System.out.print("Ingrese el apellido del estudiante: ");
    String apellido = scanner.nextLine();

    System.out.print("Ingrese el DNI del estudiante: ");
    int dni = scanner.nextInt();
    scanner.nextLine(); // Limpiar buffer

    System.out.print("Ingrese la carrera (o presione Enter para 'Sin definir'): ");
    String carrera = scanner.nextLine();

    if (carrera.trim().isEmpty()) {
      return new Estudiantes(nombre, apellido, dni);
    } else {
      return new Estudiantes(nombre, apellido, dni, carrera);
    }
  }

  /*
   * 4) CODEAR:
   * Desarrolla una función que implemente un menú principal con distintas
   * opciones
   * (por ejemplo: registrar estudiante, registrar docente, mostrar informe,
   * salir).
   * El menú debe permitir al usuario ejecutar varias acciones hasta que elija
   * salir del programa.
   */
  public void menuPrincipal() {
    Scanner scanner = new Scanner(System.in);
    int contadorEstudiantes = 0;
    int contadorDocentes = 0;
    int opcion;

    do {
      System.out.println("\n=== MENÚ PRINCIPAL - UNIVERSIDAD ===");
      System.out.println("1. Registrar estudiante");
      System.out.println("2. Registrar docente");
      System.out.println("3. Mostrar estudiantes");
      System.out.println("4. Mostrar informe de docente");
      System.out.println("5. Salir");
      System.out.print("Seleccione una opción: ");

      opcion = scanner.nextInt();
      scanner.nextLine(); // Limpiar buffer

      switch (opcion) {
        case 1:
          if (contadorEstudiantes < estudiantes.length) {
            estudiantes[contadorEstudiantes] = registrarEstudiante();
            contadorEstudiantes++;
          }
          break;
        case 2:
          if (contadorDocentes < docentes.length) {
            docentes[contadorDocentes] = registrarDocente();
            contadorDocentes++;
          }
          break;
        case 3:
          mostrarEstudiantes(estudiantes);
          break;
        case 4:
          for (Docentes docenteExistente : docentes) {
            if (docenteExistente != null) {
              docenteExistente.mostrarInforme(docenteExistente);
            }
          }
          break;
        case 5:
          System.out.println("¡Chau!");
          break;
        default:
          System.out.println("Opción inválida.");
      }

    } while (opcion != 5);

    scanner.close();
  }

}

public class PrimerExamenParcial {
  public static void main(String[] args) {
    Estudiantes estudiante = new Estudiantes("María", "Gómez", 87654321, "ISI");
    estudiante.modificarCarrera("TUP");
    Materia isi = new Materia("ISI");
    Materia tup = new Materia("TUP");
    Materia[] materias = { isi, tup };
    Docentes docente = new Docentes("Facundo", "Uferer", 12345678, materias);

    System.out.println(estudiante.toString());
    System.out.println(docente.toString());
    docente.mostrarMaterias();
  }

}
