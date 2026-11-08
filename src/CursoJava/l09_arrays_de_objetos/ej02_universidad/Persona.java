package CursoJava.l09_arrays_de_objetos.ej02_universidad;

/*
 * Lección 09 – Arrays de objetos
 * Objetivo: modelar a la persona que comparten estudiantes y profesores.
 */
class Persona {

    private String nombre;
    private final String apellido;
    private final String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre + " (DNI: " + dni + ")";
    }
}
