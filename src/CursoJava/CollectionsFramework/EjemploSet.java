package CursoJava.CollectionsFramework;

import java.util.HashSet;
import java.util.Set;

public class EjemploSet {

  public static void main(String[] args) {
    /**
     * Características de SET
     * En Set NO Puedo colocar elementos repetidos
     * Mantiene el orden de inserción
     */
    Set<String> nombres = new HashSet<>();
    nombres.add("Juan");
    nombres.add("Maria");
    nombres.add("Pedro");
    nombres.add("Carolina");
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
