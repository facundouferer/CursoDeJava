package MetodosReferencia;

import java.util.*;

class EjemploMetodoInstancia {
  public static void main(String[] args) {
    List<String> nombres = Arrays.asList("Ana", "Luis", "María");

    // Tenemos un objeto PrintStream (System.out)
    nombres.forEach(System.out::println);
  }
}
