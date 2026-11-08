package CursoJava.l09_arrays_de_objetos.ej02_universidad;

/*
 * Lección 09 – Arrays de objetos
 * Objetivo: representar a un profesor a cargo de una materia.
 */
class Profesor extends Persona {

    private final Materia materia;
    private final int anioIngreso;

    public Profesor(String nombre, String apellido, String dni, Materia materia, int anioIngreso) {
        super(nombre, apellido, dni);
        this.materia = materia;
        this.anioIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + materia.getNombre() + " (ingreso " + anioIngreso + ")";
    }
}
