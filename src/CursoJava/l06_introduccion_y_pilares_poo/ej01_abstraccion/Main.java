package CursoJava.l06_introduccion_y_pilares_poo.ej01_abstraccion;

/*
 * Lección 06 – Introducción y pilares de la POO
 * Objetivo: Calcular el área de distintas figuras usando únicamente la referencia abstracta Figura.
 * Concepto: Pilar 1: Abstracción.
 */
public class Main {

    public static void main(String[] args) {
        Figura circulo = new Circulo(3);
        Figura cuadrado = new Cuadrado(4);

        System.out.printf("Cuadrado: %.2f%n", cuadrado.calcularArea());
        System.out.printf("Círculo: %.2f%n", circulo.calcularArea());
    }
}
