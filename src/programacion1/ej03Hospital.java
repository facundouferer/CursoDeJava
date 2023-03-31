package programacion1;

import java.util.Scanner;

public class ej03Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * En un hospital existen 3 áreas: Urgencias, Pediatría y Traumatología. El presupuesto anual
         * del hospital se reparte de la siguiente manera:
         * Área y Presupuesto
         * Urgencias 37%
         * Pediatría 42%
         * Traumatología 21%
         * */
        // Pedimos al usuario que ingrese el monto del presupuesto anual
        System.out.println("Ingrese el monto del presupuesto anual:");
        double presupuestoAnual = sc.nextDouble();

        // Calculamos la cantidad de dinero que recibirá cada área según su porcentaje de distribución
        double presupuestoUrgencias = presupuestoAnual * 0.37;
        double presupuestoPediatría = presupuestoAnual * 0.42;
        double presupuestoTraumatología = presupuestoAnual * 0.21;

        // Mostramos los resultados
        System.out.println("El presupuesto de Urgencias será de: " + presupuestoUrgencias);
        System.out.println("El presupuesto de Pediatría será de: " + presupuestoPediatría);
        System.out.println("El presupuesto de Traumatología será de: " + presupuestoTraumatología);

        // Cerramos el scanner
        sc.close();
    }
}
