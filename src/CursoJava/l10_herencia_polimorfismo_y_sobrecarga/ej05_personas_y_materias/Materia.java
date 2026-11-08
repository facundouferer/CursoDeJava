package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej05_personas_y_materias;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar una materia del plan de estudios.
 */
class Materia {

    private final String nombre;

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "- " + nombre;
    }
}
