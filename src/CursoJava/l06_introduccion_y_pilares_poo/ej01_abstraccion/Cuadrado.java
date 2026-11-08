package CursoJava.l06_introduccion_y_pilares_poo.ej01_abstraccion;

/*
 * Lección 06 – Introducción y pilares de la POO
 * Objetivo: Calcular el área de un cuadrado a partir de su lado.
 * Concepto: Pilar 1: Abstracción.
 */
public class Cuadrado extends Figura {

    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
