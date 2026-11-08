package CursoJava.l08_constructores_y_encapsulamiento;

/*
 * Lección 08 – Constructores y encapsulamiento
 * Objetivo: proteger el sueldo de un empleado con un atributo privado, un constructor y accesores públicos.
 * Concepto: 5. Los cuatro modificadores de acceso.
 */
public class Ej02ModificadoresDeAcceso {

    public static void main(String[] args) {
        Empleado empleado = new Empleado(500000);
        System.out.println("Sueldo inicial: " + empleado.getSueldo());

        empleado.setSueldo(550000);
        System.out.println("Sueldo actualizado: " + empleado.getSueldo());
    }
}

class Empleado {

    private double sueldo;

    public Empleado(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
