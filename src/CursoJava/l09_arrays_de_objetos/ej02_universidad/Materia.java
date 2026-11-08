package CursoJava.l09_arrays_de_objetos.ej02_universidad;

/*
 * Lección 09 – Arrays de objetos
 * Objetivo: representar una materia del plan de estudios.
 */
class Materia {

    private String nombre;
    private int anio;

    public Materia(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return nombre + " (año " + anio + ")";
    }
}
