/**
 * 22) Elabore una solución que solicite el ingreso de un número entero distinto de 0 y se informe si es par o no
 */
package CursoJava.EjerciciosResueltos;

public class ej22NumeroEntero {

  public static void main(String[] args) {
    int numero = 5;

    if (numero != 0) {
      if (numero % 2 == 0) {
        System.out.println("El número " + numero + " es par");
      } else {
        System.out.println("El número " + numero + " es impar");
      }
    } else {
      System.out.println("El número no puede ser 0");
    }
  }

}
