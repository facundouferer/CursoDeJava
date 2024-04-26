/**
 * 17) Leer 2 números ingresados por el usuario; si son iguales que los multiplique, 
 * si el primero es mayor que el segundo que los reste y si no que los sume. 
 */
package CursoJava.EjerciciosResueltos;

public class ej17numerosMultiplicados {

  public static void main(String[] args) {
    int num1, num2;
    int resultado;

    System.out.println("Introduce el primer número:");
    num1 = Integer.parseInt(System.console().readLine());// es igual a un Scanner
    System.out.println("Introduce el segundo número:");
    num2 = Integer.parseInt(System.console().readLine());

    if (num1 == num2) {
      resultado = num1 * num2;
    } else if (num1 > num2) {
      resultado = num1 - num2;
    } else {
      resultado = num1 + num2;
    }

    System.out.println("El resultado es: " + resultado);
  }

}
