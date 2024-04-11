/**
 * 3) Solicitar la edad de dos hermanos, mostrando un mensaje que informe la
 * edad del mayor
 * y cuántos años de diferencia tiene con el menor.
 */

package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej12DosHermanos {

  public static void main(String[] args) {
    // pedido al usuario de las edades de los hermanos
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese la edad del primer hermano: ");
    int edadHermano1 = scanner.nextInt();
    System.out.println("Ingrese la edad del segundo hermano: ");
    int edadHermano2 = scanner.nextInt();
    // comparación de edades y cálculo de diferencia
    if (edadHermano1 > edadHermano2) {
      System.out.println("El hermano mayor tiene " + edadHermano1 + " años y el hermano menor tiene " + edadHermano2
          + " años. La diferencia de edad es de " + (edadHermano1 - edadHermano2) + " años.");
    } else {
      System.out.println("El hermano mayor tiene " + edadHermano2 + " años y el hermano menor tiene " + edadHermano1
          + " años. La diferencia de edad es de " + (edadHermano2 - edadHermano1) + " años.");
    }
  }
}
