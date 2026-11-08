package CursoJava.l06_introduccion_y_pilares_poo.ej03_herencia;

/*
 * Lección 06 – Introducción y pilares de la POO
 * Objetivo: Mostrar los datos de un cliente y de la caja atendida por un empleado.
 * Concepto: Pilar 3: Herencia.
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "Perez", 12345678, true);
        System.out.println(cliente);

        Empleado empleado = new Empleado("María", "Gómez", 23456789, 450000);
        Caja caja = new Caja(empleado, 3);
        System.out.println();
        System.out.println(caja);
    }
}
