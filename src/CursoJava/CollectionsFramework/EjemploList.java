package CursoJava.CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {

  public static void main(String[] args) {
    /** Puedo colocar elementos repetidos */
    List<String> nombres = new ArrayList<>();
    nombres.add("Juan");
    nombres.add("Maria");
    nombres.add("Pedro");
    nombres.add("Carolina");

    System.out.println("Nombres: " + nombres);

    nombres.remove("Pedro");

    System.out.println("Nombres: " + nombres);

    System.out.println("Listado de Nombres:");
    nombres.forEach(nombre -> System.out.println("- " + nombre.toUpperCase()));

  }

}
