package CursoJava.Inicio;

import java.util.Scanner;

public class OperacionAritmetica {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    double numeroUno = entrada.nextDouble();

    double cuadrado = numeroUno * numeroUno;

    System.out.println("el cuadrado de " + numeroUno + " es: " + cuadrado);

  }
}
