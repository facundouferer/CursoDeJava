/**
 * 37) Crear un programa que muestre todos los números primos
 * entre dos números ingresados por el usuario. Ejemplo si ingresó 1 y 10: 2, 3,
 * 5, 7, 9
 */

package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej37NumerosPrimos {
  public static void main(String[] args) {

    System.out.println("ingrese el primer número");
    Scanner ingreso = new Scanner(System.in);
    int inicio = ingreso.nextInt();

    System.out.println("ingrese el segundo número");
    int fin = ingreso.nextInt();

    for (int i = inicio; i <= fin; i++) {

      int contadorDeDivisores = 0;

      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          contadorDeDivisores++;
        }
      }
      if (contadorDeDivisores == 2) {
        System.out.print(i + ", ");
      }

    }

  }
}