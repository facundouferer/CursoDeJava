package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej01_empleados;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar a una secretaria asignada a un despacho.
 * Concepto: 1. Herencia: una secretaria es un empleado, no un jefe.
 */
class Secretaria extends Empleado {

    private final String despacho;

    public Secretaria(String nombre, int edad, double sueldo, String despacho) {
        super(nombre, edad, sueldo);
        this.despacho = despacho;
    }

    public String getDespacho() {
        return despacho;
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Despacho: " + despacho;
    }
}
