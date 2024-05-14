/**
 * Contar las Ovejas: 
 * Escribe una función recursiva que cuente el número de "ovejas" en un array de booleanos. 
 * Cada elemento del array representa una oveja, y si es true, 
 * significa que la oveja está presente. 
 * La función debe retornar el total de ovejas presentes.
 */

package CursoJava.Recursion;

public class ContadorDeOvejas {

  public static int contarOvejas(boolean[] ovejas, int indice) {
    if (indice == ovejas.length) {
      return 0;
    }

    System.out.print((indice + 1) + ") ");
    if (ovejas[indice]) {
      System.out.print("oveja! \n");
      return contarOvejas(ovejas, indice + 1) + 1;
    } else {
      System.out.print("nada \n");
      return contarOvejas(ovejas, indice + 1);
    }

  }

  public static void main(String[] args) {
    boolean[] ovejas = { true, false, true, true, false, true, true, false, true };
    int totalOvejas = contarOvejas(ovejas, 0);
    System.out.println("Encontré " + totalOvejas + " ovejas");
  }
}
