package CursoJava.CollectionsFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class EjemploLinkedHashSet {
  public static void main(String[] args) {
    /**
     * No Puedo colocar elementos repetidos
     * porque es un Set
     * Mantiene el orden de inserción
     */
    Set<String> nombres = new LinkedHashSet<>();
    nombres.add("Juan");
    nombres.add("Maria");
    nombres.add("Pedro");
    nombres.add("Pedro");
    nombres.add("Carolina");
    nombres.add("Pedro");
    nombres.add("Pedro");

    System.out.println("Nombres: " + nombres);

    nombres.remove("Pedro");

    System.out.println("Nombres: " + nombres);

    System.out.println("Listado de Nombres:");
    nombres.forEach(nombre -> System.out.println("- " + nombre.toUpperCase()));

  }
}
