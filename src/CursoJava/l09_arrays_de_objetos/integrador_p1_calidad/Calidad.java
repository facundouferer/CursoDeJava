/*
 * Integrador – Recuperatorio Parcial 2025 (Lección 09 – Arrays de objetos)
 * Enunciado: Control de calidad con menú: analizar un producto (código, nombre y puntaje de calidad
 *            de 1 a 5) guardándolo en un arreglo de hasta 20 posiciones, ver los análisis y salir.
 * Concepto: Arreglo de objetos con contador de elementos usados, herencia y menú con switch.
 */
package CursoJava.l09_arrays_de_objetos.integrador_p1_calidad;

import java.util.Scanner;

public class Calidad {
  private static final int CAPACIDAD = 20;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Analisis[] analisis = new Analisis[CAPACIDAD];
    int cantidad = 0;
    int opcion;

    do {
      System.out.println("\n===== CONTROL DE CALIDAD =====");
      System.out.println("1. Analizar producto");
      System.out.println("2. Ver análisis realizados");
      System.out.println("3. Salir");
      System.out.print("Elija una opción: ");
      opcion = Integer.parseInt(sc.nextLine().trim());

      switch (opcion) {
        case 1 -> {
          if (cantidad < CAPACIDAD) {
            analisis[cantidad++] = analizarProducto(sc);
          } else {
            System.out.println("Capacidad máxima alcanzada.");
          }
        }
        case 2 -> verAnalisisRealizados(analisis, cantidad);
        case 3 -> System.out.println("Saliendo...");
        default -> System.out.println("Opción inválida.");
      }
    } while (opcion != 3);

    sc.close();
  }

  static Analisis analizarProducto(Scanner sc) {
    System.out.print("Ingrese código del producto: ");
    int codigo = Integer.parseInt(sc.nextLine().trim());
    System.out.print("Ingrese nombre del producto: ");
    String nombre = sc.nextLine();
    System.out.print("Ingrese puntaje de calidad (1 a 5): ");
    int puntaje = Integer.parseInt(sc.nextLine().trim());
    return new Analisis(codigo, nombre, puntaje);
  }

  static void verAnalisisRealizados(Analisis[] analisis, int cantidad) {
    System.out.println("\n=== ANÁLISIS REALIZADOS ===");
    for (int i = 0; i < cantidad; i++) {
      System.out.println(analisis[i].mostrarInfo());
    }
  }
}
