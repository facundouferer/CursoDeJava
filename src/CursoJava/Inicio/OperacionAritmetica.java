package CursoJava.Inicio;

import java.util.Scanner;

public class OperacionAritmetica {
  public static void main(String[] args) {

    //Ingresar un número y mostrar su cuadrado
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    double numeroUno = entrada.nextDouble();

    //operar con el número ingresado
    double cuadrado = numeroUno * numeroUno;

    // mostrar los resultados
    System.out.println("el cuadrado de " + numeroUno + " es: " + cuadrado);

  }
}
