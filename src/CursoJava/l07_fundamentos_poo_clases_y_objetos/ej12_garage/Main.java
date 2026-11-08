package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej12_garage;

import java.util.Scanner;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Cargar un auto en el garage y listar los autos estacionados.
 * Concepto: 5. Referencias vs. copia de objetos (un objeto que contiene referencias a otros).
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Garage garage = new Garage(teclado);

        garage.agregarAuto(0);
        garage.listarAutos();

        teclado.close();
    }
}
