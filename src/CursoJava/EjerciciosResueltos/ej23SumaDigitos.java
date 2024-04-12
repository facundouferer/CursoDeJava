/**
 * 23) Se desea leer un número de dos cifras, y que se muestre por pantalla sus dígitos. 
 * Luego informe si la suma de sus dígitos es múltiplo de 3 o no.
 */
package CursoJava.EjerciciosResueltos;

public class ej23SumaDigitos {

  public static void main(String[] args) {
    int numero = 56;
    int digito1 = 0;
    int digito2 = 0;
    int sumaDigitos = 0;

    if (numero >= 10 && numero <= 99) {
      digito1 = numero / 10;
      digito2 = numero % 10;
      sumaDigitos = digito1 + digito2;

      System.out.println("Número: " + numero);
      System.out.println("Dígito 1: " + digito1);
      System.out.println("Dígito 2: " + digito2);
      System.out.println("Suma de dígitos: " + sumaDigitos);

      if (sumaDigitos % 3 == 0) {
        System.out.println("La suma de los dígitos es múltiplo de 3");
      } else {
        System.out.println("La suma de los dígitos no es múltiplo de 3");
      }
    } else {
      System.out.println("El número debe ser de dos cifras");
    }
  }

}
