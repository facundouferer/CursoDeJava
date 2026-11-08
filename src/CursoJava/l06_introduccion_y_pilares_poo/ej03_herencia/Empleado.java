package CursoJava.l06_introduccion_y_pilares_poo.ej03_herencia;

/*
 * Lección 06 – Introducción y pilares de la POO
 * Objetivo: Extender Persona con el sueldo de un empleado reutilizando sus datos básicos.
 * Concepto: Pilar 3: Herencia.
 */
public class Empleado extends Persona {

    private final double sueldo;

    public Empleado(String nombre, String apellido, int dni, double sueldo) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSueldo: " + sueldo;
    }
}
