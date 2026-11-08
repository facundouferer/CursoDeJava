package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej02_persona;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Modelar una persona con atributos privados y comportamientos para saludar y mostrar la edad.
 * Concepto: 3. Ejemplo práctico: modelando una clase Persona.
 */
public class Persona {

    private final String nombre;
    private final int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void mostrarEdad() {
        System.out.println("Tengo " + edad + " años");
    }
}
