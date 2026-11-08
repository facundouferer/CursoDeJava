package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej01_empleados;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar a un jefe cuyo sueldo incluye un adicional por responsabilidad.
 * Concepto: 3. Sobrescritura: @Override y el contrato que no se puede romper.
 */
class Jefe extends Empleado {

    private static final double ADICIONAL = 1.2;

    private final String departamento;

    public Jefe(String nombre, int edad, double sueldo, String departamento) {
        super(nombre, edad, sueldo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() * ADICIONAL;
    }

    @Override
    public String getNombre() {
        return "Jefe: " + super.getNombre();
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Departamento: " + departamento;
    }
}
