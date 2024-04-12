/**
 * 19) Una compañía de seguros está abriendo un depto. de finanzas y estableció un programa para captar clientes, 
 * que consiste en lo siguiente: Si el monto por el que se efectúa la fianza es menor que $50 000 
 * la cuota a pagar será por el 3% del monto, y si el monto es mayor que $50 000 la cuota a pagar será el 2% del monto. 
 * La compañía desea determinar cuál será la cuota que debe pagar un cliente. 
 */
package CursoJava.EjerciciosResueltos;

public class ej19CompaniaDeSeguros {

  public static void main(String[] args) {
    double monto = 60000;
    double cuota = 0;
    double porcentajeMenor = 0.03;
    double porcentajeMayor = 0.02;

    if (monto < 50000) {
      cuota = monto * porcentajeMenor;
    } else {
      cuota = monto * porcentajeMayor;
    }

    System.out.println("Monto: " + monto);
    System.out.println("Cuota: " + cuota);
  }

}
