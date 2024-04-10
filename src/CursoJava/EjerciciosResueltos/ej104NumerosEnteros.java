package CursoJava.EjerciciosResueltos;

public class ej104NumerosEnteros {

  /**
   * 4) Diseñar una solución que permita ingresar tres números enteros, e informe
   * cuál es el
   * mayor.
   */
  public static void main(String[] args) {

    int[] numeros = { 0, 0, 0 };
    for (int i = 0; i < 3; i++) {
      // pedido al usuario por consola los números enteros
      System.out.println("Ingrese el número entero " + (i + 1) + ": ");
      numeros[i] = Integer.parseInt(System.console().readLine());

    }
    // comparación de números y cálculo de mayor
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
