package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej12_garage;

import java.util.Scanner;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Guardar autos ingresados por teclado en los lugares de un estacionamiento y listarlos.
 * Concepto: 5. Referencias vs. copia de objetos (un objeto que contiene referencias a otros).
 */
public class Garage {

    private final Scanner teclado;
    private final Auto[] estacionamiento = new Auto[3];

    public Garage(Scanner teclado) {
        this.teclado = teclado;
    }

    public void agregarAuto(int lugar) {
        System.out.println("Ingrese el color");
        String color = teclado.nextLine();

        System.out.println("Ingrese la marca");
        String marca = teclado.nextLine();

        System.out.println("Ingrese el año");
        int anio = teclado.nextInt();
        teclado.nextLine(); // consume el salto de línea pendiente

        System.out.println("Ingrese la tracción");
        String traccion = teclado.nextLine();

        estacionamiento[lugar] = new Auto(color, marca, anio, traccion);
    }

    public void listarAutos() {
        for (Auto auto : estacionamiento) {
            if (auto != null) {
                System.out.println(auto);
            }
        }
    }
}
