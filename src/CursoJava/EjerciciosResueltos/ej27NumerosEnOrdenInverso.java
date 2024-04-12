/**
 * 27) Obtener un algoritmo que imprima por pantalla todos los números comprendidos 
 * entre el 5 y el 230, pero en orden inverso. Por ejemplo: 230,229,228,……………….,6,5. 
 */
package CursoJava.EjerciciosResueltos;

public class ej27NumerosEnOrdenInverso {

  public static void main(String[] args) {
    int i = 230;

    while (i >= 5) {
      System.out.print(i + " - ");
      i--;
    }
  }

}
