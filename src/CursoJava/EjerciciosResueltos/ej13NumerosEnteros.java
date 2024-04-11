/**
 * 4) Diseñar una solución que permita ingresar tres números enteros, e informe
 * cuál es el
 * mayor.
 */

package CursoJava.EjerciciosResueltos;

public class ej13NumerosEnteros {
  public static void main(String[] args) {

    int[] numeros = { 0, 0, 0 };
    for (int i = 0; i < 3; i++) {
      System.out.println("Ingrese el número entero " + (i + 1) + ": ");
      numeros[i] = Integer.parseInt(System.console().readLine());
    }

    int mayor = numeros[0];
    for (int i = 1; i < 3; i++) {
      if (numeros[i] > mayor) {
        mayor = numeros[i];
      }
    }

    System.out.println("Los números ingresados son: " + numeros[0] + ", " + numeros[1] + " y " + numeros[2] + ".");
    System.out.println("El número mayor es: " + mayor + ".");
  }
}
