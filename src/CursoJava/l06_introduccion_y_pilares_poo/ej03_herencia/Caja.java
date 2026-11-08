package CursoJava.l06_introduccion_y_pilares_poo.ej03_herencia;

/*
 * Lección 06 – Introducción y pilares de la POO
 * Objetivo: Asociar un empleado a una caja mediante composición.
 * Concepto: Pilar 3: Herencia (relación "tiene un" frente a "es un").
 */
public class Caja {

    private final Empleado empleado;
    private final int numeroCaja;

    public Caja(Empleado empleado, int numeroCaja) {
        this.empleado = empleado;
        this.numeroCaja = numeroCaja;
    }

    @Override
    public String toString() {
        return empleado + "\nNro de caja: " + numeroCaja;
    }
}
