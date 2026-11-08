/*
 * Integrador – Recuperatorio Parcial 2025, versión avanzada (Lección 15 – Java Collections Framework y genéricos)
 * Enunciado: Control de calidad con menú: analizar un producto, ver los análisis realizados,
 *            eliminar el último análisis y salir; el código del producto debe ser numérico.
 * Concepto: ArrayList<T> en lugar de arreglos, interfaz Auditable y validación de entrada con
 *           excepciones.
 */
package CursoJava.l15_java_collections_framework_y_genericos.integrador_p1_calidad_avanzada;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CalidadAvanzada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Analisis> analisis = new ArrayList<>();
    int opcion;

    do {
      System.out.println("\n===== CONTROL DE CALIDAD AVANZADO =====");
      System.out.println("1. Analizar producto");
      System.out.println("2. Ver análisis realizados");
      System.out.println("3. Eliminar último análisis");
      System.out.println("4. Salir");
      System.out.print("Elija una opción: ");
      opcion = Integer.parseInt(sc.nextLine().trim());

      switch (opcion) {
        case 1 -> {
          analisis.add(analizarProducto(sc));
          System.out.println("Análisis registrado exitosamente.");
        }
        case 2 -> verAnalisisRealizados(analisis);
        case 3 -> eliminarUltimoAnalisis(analisis);
        case 4 -> System.out.println("Saliendo...");
        default -> System.out.println("Opción inválida.");
      }
    } while (opcion != 4);

    sc.close();
  }

  static Analisis analizarProducto(Scanner sc) {
    int codigo = 0;
    boolean codigoValido = false;
    while (!codigoValido) {
      try {
        System.out.print("Ingrese código del producto: ");
        codigo = sc.nextInt();
        codigoValido = true;
      } catch (InputMismatchException e) {
        System.out.println("El código debe ser un número entero.");
        sc.nextLine(); // descarta la entrada inválida
      }
    }
    sc.nextLine(); // consume el salto de línea restante

    System.out.print("Ingrese nombre del producto: ");
    String nombre = sc.nextLine();
    System.out.print("Ingrese puntaje de calidad (1 a 5): ");
    int puntaje = Integer.parseInt(sc.nextLine().trim());
    return new Analisis(codigo, nombre, puntaje);
  }

  static void verAnalisisRealizados(List<Analisis> analisis) {
    System.out.println("\n=== ANÁLISIS REALIZADOS ===");
    if (analisis.isEmpty()) {
      System.out.println("No hay análisis registrados.");
      return;
    }
    for (Analisis a : analisis) {
      System.out.println(a.mostrarInfo());
    }
    System.out.println("\nTotal de análisis: " + analisis.size());
  }

  static void eliminarUltimoAnalisis(List<Analisis> analisis) {
    if (analisis.isEmpty()) {
      System.out.println("No hay análisis para eliminar.");
      return;
    }
    Analisis ultimo = analisis.remove(analisis.size() - 1);
    System.out.println("Se eliminó el análisis del producto: " + ultimo.getNombre());
    System.out.println("Total de análisis restantes: " + analisis.size());
  }
}
