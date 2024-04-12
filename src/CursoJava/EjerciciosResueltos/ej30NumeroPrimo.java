/**
 * 30) Dado un número ingresado por el usuario determinar si es primo o no.
 */
package CursoJava.EjerciciosResueltos;

public class ej30NumeroPrimo {

  public static void main(String[] args) {
    int numero = 7;
    boolean esPrimo = true;

    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        esPrimo = false;
        break;
      }
    }

    if (esPrimo) {
      System.out.println("El número " + numero + " es primo.");
    } else {
      System.out.println("El número " + numero + " no es primo.");
    }
  }

}
