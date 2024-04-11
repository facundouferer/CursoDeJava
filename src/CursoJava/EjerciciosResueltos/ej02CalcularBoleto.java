/**
 * 2) Calcula el precio de un boleto de viaje,
 * tomando en cuenta el número de kilómetros que se van a recorrer,
 * siendo el precio $ 10,50 por Km.
 */

package CursoJava.EjerciciosResueltos;

public class ej02CalcularBoleto {

  public static void main(String[] args) {
    int distancia = 100;
    double precio = distancia * 10.50;
    System.out.println("El precio del boleto es: $ " + precio);
  }

}
