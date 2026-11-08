package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej08_vector;

import java.util.List;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Multiplicar un vector por un escalar y sumar dos vectores.
 * Concepto: 3. Ejemplo práctico: modelando una clase (instanciación y uso).
 */
public class Main {

    public static void main(String[] args) {
        Vector vector1 = new Vector(List.of(2.0, 3.0, 4.0));
        Vector vector2 = new Vector(List.of(1.0, 2.0, 3.0));

        System.out.println("Vector 1: " + vector1);
        System.out.println("Vector 2: " + vector2);
        System.out.println("Resultado de la multiplicación: " + vector1.multiplicar(2.0));
        System.out.println("Resultado de la suma: " + vector1.sumar(vector2));
    }
}
