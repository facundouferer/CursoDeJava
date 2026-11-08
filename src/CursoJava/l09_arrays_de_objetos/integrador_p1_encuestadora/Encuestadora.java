/*
 * Integrador – Recuperatorio Parcial 2025 (Lección 09 – Arrays de objetos)
 * Enunciado: Sistema de encuestas con menú: registrar una encuesta (nombre y puntaje de 1 a 5) en
 *            un arreglo de hasta 20 posiciones, ver los resultados y salir.
 * Concepto: Arreglo de objetos con contador de elementos usados, herencia y menú con switch.
 */
package CursoJava.l09_arrays_de_objetos.integrador_p1_encuestadora;

import java.util.Scanner;

public class Encuestadora {
  private static final int CAPACIDAD = 20;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Encuesta[] encuestas = new Encuesta[CAPACIDAD];
    int cantidad = 0;
    int opcion;

    do {
      System.out.println("\n===== SISTEMA DE ENCUESTAS =====");
      System.out.println("1. Registrar encuesta");
      System.out.println("2. Ver resultados");
      System.out.println("3. Salir");
      System.out.print("Elija una opción: ");
      opcion = Integer.parseInt(sc.nextLine().trim());

      switch (opcion) {
        case 1 -> {
          if (cantidad < CAPACIDAD) {
            encuestas[cantidad++] = registrarEncuesta(sc);
          } else {
            System.out.println("Capacidad máxima alcanzada.");
          }
        }
        case 2 -> mostrarResultados(encuestas, cantidad);
        case 3 -> System.out.println("Saliendo...");
        default -> System.out.println("Opción inválida.");
      }
    } while (opcion != 3);

    sc.close();
  }

  static Encuesta registrarEncuesta(Scanner sc) {
    System.out.print("Ingrese nombre: ");
    String nombre = sc.nextLine();
    System.out.print("Ingrese puntaje (1 a 5): ");
    int puntaje = Integer.parseInt(sc.nextLine().trim());
    return new Encuesta(nombre.toUpperCase(), puntaje);
  }

  static void mostrarResultados(Encuesta[] encuestas, int cantidad) {
    System.out.println("\n=== RESULTADOS DE ENCUESTAS ===");
    for (int i = 0; i < cantidad; i++) {
      System.out.println(encuestas[i].mostrarInfo());
    }
  }
}
