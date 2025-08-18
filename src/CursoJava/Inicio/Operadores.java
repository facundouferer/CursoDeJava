package CursoJava.Inicio;

import java.util.Scanner;

public class Operadores {
  public static void main(String[] args) {
    int nro1, nro2;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese el primer número: ");
    nro1 = entrada.nextInt();
    System.out.print("Ingrese el segundo número: ");
    nro2 = entrada.nextInt();
    dividir(nro1, nro2);
    entrada.close();
  }

  public static void sumar(int nro1, int nro2) {
    System.out.println(nro1 + nro2);
  }

  public static void restar(int nro1, int nro2) {
    System.out.println(nro1 - nro2);
  }

  public static void multiplicar(int nro1, int nro2) {
    System.out.println(nro1 * nro2);
  }

  public static void dividir(double nro1, double nro2) {
    double resultado = nro1 / nro2;
    System.out.println(resultado);
  }
}
