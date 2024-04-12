/**
 * 34) Se pide representar el algoritmo que nos calcule la suma 
 * de los N primeros números impares. Es decir, si ingresamos un 5, 
 * nos haga la suma de 1+3+5+7+9. 
 */
package CursoJava.EjerciciosResueltos;

public class ej34NumerosImpares {

  public static void main(String[] args) {
    int n = 5;
    int suma = 0;
    int contador = 0;
    int i = 1;

    while (contador < n) {
      if (i % 2 != 0) {
        suma += i;
        contador++;
      }
      i++;
    }

    System.out.println("La suma de los " + n + " primeros números impares es: " + suma);
  }

}
