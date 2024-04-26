/**
 * 28) Calcular la suma y el promedio de números ingresados por el usuario. 
 * La cantidad de números a ingresar no se conoce, pero se sabe que deben 
 * pertenecer al rango [0,100]. La carga finaliza cuando el usuario ingresa 
 * un valor fuera del rango. 
 */
package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej28SumaPromedio {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int numero = 0;
    int suma = 0;
    int cantidad = 0;
    double promedio = 0.0;
    while (numero >= 0 && numero <= 100) {
      System.out.print("Ingrese un número: ");
      numero = scanner.nextInt();
      if (numero >= 0 && numero <= 100) {
        suma += numero;
        cantidad++;
      }
    }
    if (cantidad > 0) {
      promedio = (double) suma / cantidad;
      System.out.println("Suma: " + suma);
      System.out.println("Promedio: " + promedio);
    } else {
      System.out.println("No se ingresaron números en el rango [0,100]");
    }

    scanner.close();
  }

}
