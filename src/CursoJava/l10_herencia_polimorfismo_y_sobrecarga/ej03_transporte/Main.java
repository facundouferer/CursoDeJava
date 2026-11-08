package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej03_transporte;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: registrar por teclado autos y motos y listarlos con su precio final.
 * Concepto: 5. Polimorfismo: un array de Vehiculo guarda autos y motos.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos vehículos desea ingresar?");
        int capacidad = Integer.parseInt(teclado.nextLine().trim());
        Vehiculo[] vehiculos = new Vehiculo[capacidad];
        int cantidad = 0;

        while (cantidad < capacidad) {
            System.out.println("Ingrese el tipo de vehículo (1: Auto, 2: Moto, 0: Salir):");
            int opcion = Integer.parseInt(teclado.nextLine().trim());
            if (opcion == 0) {
                break;
            }
            if (opcion == 1) {
                System.out.println("Ingrese la marca del auto:");
                String marca = teclado.nextLine();
                System.out.println("Ingrese el modelo del auto:");
                String modelo = teclado.nextLine();
                System.out.println("Ingrese el año del auto:");
                int anio = Integer.parseInt(teclado.nextLine().trim());
                System.out.println("Ingrese el precio del auto:");
                double precio = Double.parseDouble(teclado.nextLine().trim());
                System.out.println("Ingrese el impuesto por rueda del auto (en porcentaje):");
                double impuestoPorRueda = Double.parseDouble(teclado.nextLine().trim());
                vehiculos[cantidad++] = new Auto(marca, modelo, anio, precio, impuestoPorRueda);
            } else if (opcion == 2) {
                System.out.println("Ingrese la marca de la moto:");
                String marca = teclado.nextLine();
                System.out.println("Ingrese el modelo de la moto:");
                String modelo = teclado.nextLine();
                System.out.println("Ingrese el año de la moto:");
                int anio = Integer.parseInt(teclado.nextLine().trim());
                System.out.println("Ingrese el precio de la moto:");
                double precio = Double.parseDouble(teclado.nextLine().trim());
                vehiculos[cantidad++] = new Moto(marca, modelo, anio, precio);
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

        System.out.println("Vehículos ingresados:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(vehiculos[i]);
        }
    }
}
