/**
 * En un almacén se hace un 20% de descuento a los clientes cuya compra supere
 * los $1000.
 * Mostrar por pantalla cuál será la cantidad que pagará una persona por su
 * compra
 */

package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej11DescuentoPorCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto de la compra: ");
        double compra = scanner.nextDouble();
        int descuento = 20;
        double total = compra - (compra * descuento / 100);
        if (compra >= 1000) {
            System.out.println("El total a pagar es: " + total);
        } else {
            System.out.println("El total a pagar es: " + compra);
        }
    }
}
