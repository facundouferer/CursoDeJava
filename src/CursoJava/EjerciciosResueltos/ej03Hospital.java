/**
 * 3) En un hospital existen 3 áreas: Urgencias, Pediatría y Traumatología. El
 * presupuesto anual del hospital se reparte de la siguiente manera:
 * Área Presupuesto
 * Urgencias 37%
 * Pediatría 42%
 * Traumatología 21%
 */
package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej03Hospital {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto del presupuesto anual:");
        double presupuestoAnual = sc.nextDouble();

        double presupuestoUrgencias = presupuestoAnual * 0.37;
        double presupuestoPediatría = presupuestoAnual * 0.42;
        double presupuestoTraumatología = presupuestoAnual * 0.21;

        System.out.println("El presupuesto de Urgencias será de: " + presupuestoUrgencias);
        System.out.println("El presupuesto de Pediatría será de: " + presupuestoPediatría);
        System.out.println("El presupuesto de Traumatología será de: " + presupuestoTraumatología);

        sc.close();
    }
}
