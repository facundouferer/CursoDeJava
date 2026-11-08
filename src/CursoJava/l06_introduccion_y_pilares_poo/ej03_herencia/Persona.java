package CursoJava.l06_introduccion_y_pilares_poo.ej03_herencia;

/*
 * Lección 06 – Introducción y pilares de la POO
 * Objetivo: Reunir los datos comunes de las personas que luego especializan Empleado y Cliente.
 * Concepto: Pilar 3: Herencia.
 */
public class Persona {

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
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + dni;
    }
}
