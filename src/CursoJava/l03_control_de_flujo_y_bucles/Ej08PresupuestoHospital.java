package CursoJava.l03_control_de_flujo_y_bucles;

import java.util.Scanner;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: repartir el presupuesto anual de un hospital entre Urgencias (37%), Pediatría (42%) y Traumatología (21%).
 * Concepto: 1. Condicionales (cálculo previo a las decisiones).
 */
public class Ej08PresupuestoHospital {

    private static final double PORCENTAJE_URGENCIAS = 0.37;
    private static final double PORCENTAJE_PEDIATRIA = 0.42;
    private static final double PORCENTAJE_TRAUMATOLOGIA = 0.21;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el monto del presupuesto anual:");
        double presupuestoAnual = entrada.nextDouble();

        System.out.println("El presupuesto de Urgencias será de: " + presupuestoAnual * PORCENTAJE_URGENCIAS);
        System.out.println("El presupuesto de Pediatría será de: " + presupuestoAnual * PORCENTAJE_PEDIATRIA);
        System.out.println("El presupuesto de Traumatología será de: " + presupuestoAnual * PORCENTAJE_TRAUMATOLOGIA);
        entrada.close();
    }
}
