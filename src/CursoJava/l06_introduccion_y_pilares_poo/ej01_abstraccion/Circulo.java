package CursoJava.l06_introduccion_y_pilares_poo.ej01_abstraccion;

/*
 * Lección 06 – Introducción y pilares de la POO
 * Objetivo: Calcular el área de un círculo a partir de su radio.
 * Concepto: Pilar 1: Abstracción.
 */
public class Circulo extends Figura {

    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
