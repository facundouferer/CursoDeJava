/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Iniciar el registro de empleados eligiendo cómo se almacenan en memoria.
 * Concepto: Cuál elegir: ArrayList, LinkedList, HashSet, TreeSet o ArrayDeque detrás de una misma interfaz.
 */
package CursoJava.l15_java_collections_framework_y_genericos.ej10_empleados;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Almacenamiento de empleados:");
    System.out.println("1. Lista (ArrayList): conserva el orden de carga y admite repetidos");
    System.out.println("2. Lista enlazada (LinkedList): conserva el orden de carga y admite repetidos");
    System.out.println("3. Conjunto (HashSet): no admite IDs repetidos ni garantiza orden");
    System.out.println("4. Conjunto ordenado (TreeSet): no admite IDs repetidos y lista por ID");
    System.out.println("5. Cola (ArrayDeque): atiende en orden de llegada");
    System.out.print("Seleccione una opción: ");
    int opcion = Integer.parseInt(scanner.nextLine().trim());

    Collection<Empleado> empleados = switch (opcion) {
      case 2 -> new LinkedList<>();
      case 3 -> new HashSet<>();
      case 4 -> new TreeSet<>();
      case 5 -> new ArrayDeque<>();
      default -> new ArrayList<>();
    };

    new RegistroEmpleados(empleados, scanner).mostrarMenu();
  }
}
