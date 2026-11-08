/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Armar una lista de nombres, quitar uno y recorrerla.
 * Concepto: Familia List: orden de inserción y duplicados permitidos.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.ArrayList;
import java.util.List;

public class Ej01ListaDeNombres {

  public static void main(String[] args) {
    List<String> nombres = new ArrayList<>();
    nombres.add("Juan");
    nombres.add("María");
    nombres.add("Pedro");
    nombres.add("Carolina");
    nombres.add("Pedro"); // una List admite elementos repetidos

    System.out.println("Nombres: " + nombres);
    System.out.println("Segundo nombre (índice 1): " + nombres.get(1));

    nombres.remove("Pedro"); // quita solo la primera aparición

    System.out.println("Nombres: " + nombres);

    System.out.println("Listado de nombres:");
    nombres.forEach(nombre -> System.out.println("- " + nombre.toUpperCase()));
  }
}
