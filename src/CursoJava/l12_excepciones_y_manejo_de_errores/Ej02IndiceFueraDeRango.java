package CursoJava.l12_excepciones_y_manejo_de_errores;

import java.util.LinkedList;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: mostrar qué ocurre al pedir una posición inexistente de una lista.
 * Concepto: §3 Checked vs unchecked (IndexOutOfBoundsException es unchecked:
 *           el error está en el índice, no en la falta de un catch).
 */
public class Ej02IndiceFueraDeRango {

  public static void main(String[] args) {
    LinkedList<String> lista = new LinkedList<>();
    lista.add("Elemento1");

    // La lista tiene una sola posición (0): la posición 1 lanza IndexOutOfBoundsException.
    System.out.println(lista.get(1));
  }
}
