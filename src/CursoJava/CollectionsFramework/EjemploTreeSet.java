package CursoJava.CollectionsFramework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
  public static void main(String[] args) {
    /**
     * Características de TreeSet
     * En TreeSet NO Puedo colocar elementos repetidos
     * Mantiene el orden natural (alfabético, numérico, etc)
     */
    Set<String> nombres = new TreeSet<>();
    nombres.add("Juan");
    nombres.add("Maria");
    nombres.add("Pedro");
    nombres.add("Carolina");
    nombres.add("Zorro");
    nombres.add("Pedro");
    nombres.add("Maria");
    nombres.add("Carlos");
    nombres.add("Carlos");

    System.out.println("Nombres: " + nombres);

    nombres.remove("Pedro");

    System.out.println("Nombres: " + nombres);

    System.out.println("Listado de Nombres:");
    nombres.forEach(nombre -> System.out.println("- " + nombre.toUpperCase()));

  }
}
