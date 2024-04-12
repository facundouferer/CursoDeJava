/**
 * 29) Escriba un algoritmo que permita ingresar un Número N positivo 
 * y muestre por pantalla la suma de sus dígitos. 
 */
package CursoJava.EjerciciosResueltos;

public class ej29SumaDeNumero {

  public static void main(String[] args) {
    int numero = 12345;
    int suma = 0;

    while (numero > 0) {
      suma += numero % 10;
      numero /= 10; // numero = numero / 10;
    }

    System.out.println("La suma de los dígitos es: " + suma);
  }

}
