/**
 * 16) Hacer un algoritmo que imprima el nombre de un artículo, clave, precio original 
 * y su precio con descuento. El descuento lo hace en base a la clave, si la clave 
 * es 01 el descuento es del 10% y si la clave es 02 el descuento en del 20% (solo existen dos claves). 
 */
package CursoJava.EjerciciosResueltos;

public class ej16Descuento {

  public static void main(String[] args) {
    String nombre = "Articulo";
    String clave = "01";
    double precio = 100.0;
    double descuento = 0.0;
    double precioDescuento = 0.0;

    if (clave.equals("01")) {
      descuento = 0.10;
    } else if (clave.equals("02")) {
      descuento = 0.20;
    }

    precioDescuento = precio - (precio * descuento);

    System.out.println("Nombre: " + nombre);
    System.out.println("Clave: " + clave);
    System.out.println("Precio: " + precio);
    System.out.println("Descuento: " + descuento);
    System.out.println("Precio con descuento: " + precioDescuento);
  }

}
