/*
 * Integrador – Recuperatorio Parcial 2025, versión avanzada (Lección 15 – Java Collections Framework y genéricos)
 * Enunciado: Sistema de encuestas con menú: registrar una encuesta, ver los resultados, eliminar el
 *            último registro y salir; sin límite de capacidad.
 * Concepto: ArrayList<T> en lugar de arreglos, interfaz Informable y herencia.
 */
package CursoJava.l15_java_collections_framework_y_genericos.integrador_p1_encuestadora_avanzada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EncuestadoraAvanzada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Encuesta> encuestas = new ArrayList<>();
    int opcion;

    do {
      System.out.println("\n===== SISTEMA DE ENCUESTAS =====");
      System.out.println("1. Registrar encuesta");
      System.out.println("2. Ver resultados");
      System.out.println("3. Eliminar último registro");
      System.out.println("4. Salir");
      System.out.print("Elija una opción: ");
      opcion = Integer.parseInt(sc.nextLine().trim());

      switch (opcion) {
        case 1 -> {
          encuestas.add(registrarEncuesta(sc));
          System.out.println("Encuesta registrada exitosamente.");
        }
        case 2 -> mostrarResultados(encuestas);
        case 3 -> eliminarUltimoRegistro(encuestas);
        case 4 -> System.out.println("Saliendo...");
        default -> System.out.println("Opción inválida.");
      }
    } while (opcion != 4);

    sc.close();
  }

  static Encuesta registrarEncuesta(Scanner sc) {
    System.out.print("Ingrese nombre: ");
    String nombre = sc.nextLine();
    System.out.print("Ingrese puntaje (1 a 5): ");
    int puntaje = Integer.parseInt(sc.nextLine().trim());
    return new Encuesta(nombre.toUpperCase(), puntaje);
  }

  static void eliminarUltimoRegistro(List<Encuesta> encuestas) {
    if (encuestas.isEmpty()) {
      System.out.println("No hay encuestas para eliminar.");
      return;
    }
    Encuesta ultima = encuestas.remove(encuestas.size() - 1);
    System.out.println("Se eliminó la encuesta de: " + ultima.getNombre());
    System.out.println("Total de encuestas restantes: " + encuestas.size());
  }

  static void mostrarResultados(List<Encuesta> encuestas) {
    System.out.println("\n=== RESULTADOS DE ENCUESTAS ===");
    if (encuestas.isEmpty()) {
      System.out.println("No hay encuestas registradas.");
      return;
    }
    for (Encuesta encuesta : encuestas) {
      System.out.println(encuesta.mostrarInfo());
    }
    System.out.println("\nTotal de encuestas: " + encuestas.size());
  }
}
