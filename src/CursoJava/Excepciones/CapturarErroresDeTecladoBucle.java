package CursoJava.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CapturarErroresDeTecladoBucle {
  public static void main(String[] args) {

  System.out.println("EXCEPCIONES CON BUCLE");
  
  Scanner leer = new Scanner(System.in);

  boolean seguir = true;

  while(seguir){
    try {
       System.out.println("ingresa un número");
       int nroUno = leer.nextInt();

        System.out.println("ingresa otro número");
        int nroDos = leer.nextInt();

         double resultado = nroUno / nroDos;
         System.out.println("El resultado de la división es: " + resultado);
         seguir = false;
         
       } catch (Exception e) {
          System.out.println("Error al ingresar los datos: " + e.toString());
          leer.nextLine(); //limpia el buffer
          seguir = true;
        }
    }
    System.out.println("Fin del programa");
    leer.close();
  }
}
