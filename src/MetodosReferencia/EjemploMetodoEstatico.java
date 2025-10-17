package MetodosReferencia;

import java.util.*;

/**
 * Un método de referencia es una forma más corta y legible de escribir una
 * expresión lambda cuando
 * ya existe un método que hace exactamente lo que queremos.
 * 
 * En lugar de escribir objeto -> objeto.metodo(),
 * podés escribir Objeto::metodo.
 */

class Utilidades {
  public static void mostrarEnMayusculas(String texto) {
    System.out.println(texto.toUpperCase());
  }
}

class EjemploMetodoEstatico {
  public static void main(String[] args) {
    List<String> nombres = Arrays.asList("ana", "luis", "maría", "carlos", "sofia");

    // Versión lambda:
    /**
     * mostrarEnMayuscula es posible de ser usada
     * sin que la clase Utilidades haya sido instanciada
     * porque es un método estático.
     */
    nombres.forEach(nombre -> Utilidades.mostrarEnMayusculas(nombre));

    // Método de referencia:
    nombres.forEach(Utilidades::mostrarEnMayusculas);
  }
}
