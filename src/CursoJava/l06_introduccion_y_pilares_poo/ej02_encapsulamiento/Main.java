package CursoJava.l06_introduccion_y_pilares_poo.ej02_encapsulamiento;

/*
 * Lección 06 – Introducción y pilares de la POO
 * Objetivo: Consultar y actualizar la edad de una persona sin acceder directamente a sus atributos.
 * Concepto: Pilar 2: Encapsulamiento.
 */
public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        persona.cumplirAnios();
        System.out.println("Edad: " + persona.getEdad());
    }
}
