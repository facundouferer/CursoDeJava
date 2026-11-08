package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: calcular lo que paga un cliente sabiendo que se descuenta el 20% a las compras que superan $1000.
 * Concepto: 1. Condicionales: if, else.
 */
public class Ej14DescuentoPorCompras {

    private static final double MONTO_MINIMO_DESCUENTO = 1000;
    private static final double PORCENTAJE_DESCUENTO = 20;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el monto de la compra:");
        double compra = entrada.nextDouble();

        double total = compra;
        if (compra > MONTO_MINIMO_DESCUENTO) {
            total = compra - (compra * PORCENTAJE_DESCUENTO / 100);
        }

        System.out.println("El total a pagar es: " + total);
        entrada.close();
    }
}
