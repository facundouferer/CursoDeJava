package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej01_empleados;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar a un empleado que cobra un sueldo y completa la descripción de la persona.
 * Concepto: 2. super: la cadena de constructores.
 */
class Empleado extends Persona {

    private final double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Sueldo: " + getSueldo();
    }
}
