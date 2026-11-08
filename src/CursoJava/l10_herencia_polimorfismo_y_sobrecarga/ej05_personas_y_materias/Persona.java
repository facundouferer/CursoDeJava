package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej05_personas_y_materias;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar a una persona identificada por apellido, nombre y DNI.
 * Concepto: 3. Sobrescritura de toString.
 */
class Persona {

    private final String nombre;
    private final String apellido;
    private final int dni;

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "- " + apellido + ", " + nombre + " (DNI: " + dni + ")";
    }
}
