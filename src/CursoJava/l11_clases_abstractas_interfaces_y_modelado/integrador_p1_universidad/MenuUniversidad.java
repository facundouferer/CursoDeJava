/*
 * Integrador – Primer Parcial 2025 (Lección 11 – Clases abstractas, interfaces y modelado)
 * Enunciado: Implementar un menú principal con opciones (registrar estudiante, registrar docente,
 *            mostrar informe, salir) que se repita hasta que el usuario elija salir.
 * Concepto: Interfaces, arreglos de objetos y menú con switch sobre una única entrada Scanner.
 */
package CursoJava.l11_clases_abstractas_interfaces_y_modelado.integrador_p1_universidad;

import java.util.Scanner;

public class MenuUniversidad {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      new Universidad().menuPrincipal(scanner);
    }
  }
}
