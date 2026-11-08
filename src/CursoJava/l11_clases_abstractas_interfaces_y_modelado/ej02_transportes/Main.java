/*
 * Lección 11 – Clases abstractas, interfaces y modelado
 * Objetivo: Mostrar la ficha de un auto y de una lancha del catálogo de una concesionaria.
 * Concepto: Clase abstracta con método concreto (mostrarInformacion) que delega
 *           un paso en las subclases (verCaracteristicas).
 */
package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej02_transportes;

public class Main {
  public static void main(String[] args) {
    Vehiculo[] catalogo = {
        new Terrestre(200, 10, 10000, 4),
        new Acuatico(500, 5, 20000, "Lancha")
    };

    for (Vehiculo vehiculo : catalogo) {
      vehiculo.mostrarInformacion();
    }
  }
}
