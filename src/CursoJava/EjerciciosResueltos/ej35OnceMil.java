/**
 * 35) Teniendo en cuenta que la clave es “111MIL”, escribir un algoritmo que nos pida una clave. 
 * Solo tenemos 3 intentos para acertar, si fallamos los 3 intentos nos mostrara un mensaje 
 * indicándonos que hemos agotado esos 3 intentos. Si acertamos la clave, saldremos del proceso.
 */
package CursoJava.EjerciciosResueltos;

public class ej35OnceMil {

  public static void main(String[] args) {
    String clave = "111MIL";
    String intento;
    int intentos = 3;

    do {
      System.out.println("Introduce la clave:");
      intento = System.console().readLine();
      intentos--;
    } while (!intento.equals(clave) && intentos > 0);

    if (intento.equals(clave)) {
      System.out.println("¡Clave correcta!");
    } else {
      System.out.println("Has agotado los 3 intentos.");
    }
  }

}
