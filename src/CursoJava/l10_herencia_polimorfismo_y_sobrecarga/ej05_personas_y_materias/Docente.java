package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej05_personas_y_materias;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar a un docente que dicta un conjunto de materias.
 * Concepto: 9. Ejercicio práctico guiado (copia defensiva del array de materias).
 */
class Docente extends Persona implements InformeDeDatos {

    private final Materia[] materias;

    public Docente(String nombre, String apellido, int dni, Materia[] materias) {
        super(nombre, apellido, dni);
        this.materias = materias.clone();
    }

    @Override
    public String informe() {
        return "El docente " + super.toString() + " dicta materias:";
    }

    public void mostrarMaterias() {
        for (Materia materia : materias) {
            System.out.println(materia);
        }
    }
}
