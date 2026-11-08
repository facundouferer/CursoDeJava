package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: calcular el precio de un boleto de viaje según los kilómetros a recorrer y la tarifa por kilómetro.
 * Concepto: 1. Condicionales (cálculo previo a las decisiones).
 */
public class Ej07PrecioBoleto {

    private static final double TARIFA_INTERURBANA = 45.0;
    private static final double TARIFA_URBANA = 10.50;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la distancia a recorrer en kilómetros: ");
        int distancia = entrada.nextInt();

        System.out.println("Precio del boleto interurbano: $" + calcularPrecio(distancia, TARIFA_INTERURBANA));
        System.out.println("Precio del boleto urbano: $" + calcularPrecio(distancia, TARIFA_URBANA));
        entrada.close();
    }

    private static double calcularPrecio(int kilometros, double tarifaPorKilometro) {
        return kilometros * tarifaPorKilometro;
    }
}
