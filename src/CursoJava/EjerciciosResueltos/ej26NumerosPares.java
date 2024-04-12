/**
 * 26) Obtener un algoritmo que imprima por pantalla todos 
 * los números pares del 2 al 300. Utilizar un While.
 */
package CursoJava.EjerciciosResueltos;

public class ej26NumerosPares {

  public static void main(String[] args) {
    int i = 2;

    while (i <= 300) {
      System.out.print(i + " - ");
      i += 2;
    }
  }

}
