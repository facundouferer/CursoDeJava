package CursoJava.Wrappers;

import java.util.Scanner;

public class ProbandoWrappers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el primer numero a sumar:");
    String nroTexto = scanner.nextLine();
    System.out.println("Ingrese el segundo numero a sumar:");
    String nroTexto2 = scanner.nextLine();

    // que pasa cuando el usuario ingresa letras en vez de numeros y como resolverlo

    int sumar = Integer.parseInt(nroTexto) + Integer.parseInt(nroTexto2);

  }

}