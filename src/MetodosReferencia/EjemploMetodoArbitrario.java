package MetodosReferencia;

import java.util.*;

class EjemploMetodoArbitrario {
  public static void main(String[] args) {
    List<String> nombres = Arrays.asList("ana", "luis", "maría");

    // Convertir todos a mayúsculas
    List<String> nombresMayus = nombres.stream()
        .map(String::toUpperCase)
        .toList();

    System.out.println(nombresMayus);
  }
}
