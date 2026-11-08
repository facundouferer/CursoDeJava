package CursoJava.l09_arrays_de_objetos.ej02_universidad;

/*
 * Lección 09 – Arrays de objetos
 * Objetivo: representar a un estudiante inscripto en una carrera.
 */
class Estudiante extends Persona {

    private final String carrera;
    private final int anioIngreso;

    public Estudiante(String nombre, String apellido, String dni, String carrera, int anioIngreso) {
        super(nombre, apellido, dni);
        this.carrera = carrera;
        this.anioIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + carrera + " (ingreso " + anioIngreso + ")";
    }
}
