package CursoJava.l06_introduccion_y_pilares_poo.ej02_encapsulamiento;

/*
 * Lección 06 – Introducción y pilares de la POO
 * Objetivo: Proteger el estado de una persona y modificarlo solo mediante métodos públicos.
 * Concepto: Pilar 2: Encapsulamiento.
 */
public class Persona {

    private final String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void cumplirAnios() {
        this.edad++;
    }
}
