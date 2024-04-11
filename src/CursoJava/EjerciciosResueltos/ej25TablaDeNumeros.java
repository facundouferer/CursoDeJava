package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

/**
 * 25) Un programa que permita al usuario ingresar un número entre el 1 y el 9
 * y nos muestre la tabla de dicho número hasta su multiplicación por 9.
 * La salida debería ser en caso de que el usuario ingrese el número 2:
 * 2x1=2
 * 2x3=6
 * ….
 * 2x9=18
 */
public class ej25TablaDeNumeros {
  public static void main(String[] args) {
    System.out.println("ingrese un número entre el 1 y el 9");
    Scanner ingreso = new Scanner(System.in);
    int numero = ingreso.nextInt();

    if (numero > 0 && numero < 10) {
      for (int i = 1; i < 10; i++) {
        System.out.println(numero + " x " + i + " = " + (numero * i));
      }
    } else {
      System.out.print("no es un número entre 1 y 9");
    }
  }
}
