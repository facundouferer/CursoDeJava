/**
 * 32) Crea un algoritmo que pida al usuario su código de usuario (un número entero) 
 * y su contraseña numérica (otro número entero), y no le permita seguir hasta que 
 * introduzca como código 1024 y como contraseña 4567. 
 */
package CursoJava.EjerciciosResueltos;

public class ej32CodigoEntrada {

  public static void main(String[] args) {
    int codigo = 0;
    int contrasena = 0;

    while (codigo != 1024 || contrasena != 4567) {
      System.out.println("Introduce tu código de usuario:");
      codigo = Integer.parseInt(System.console().readLine());
      System.out.println("Introduce tu contraseña numérica:");
      contrasena = Integer.parseInt(System.console().readLine());
    }

    System.out.println("Bienvenido.");
  }

}
