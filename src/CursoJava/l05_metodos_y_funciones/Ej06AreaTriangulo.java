package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Calcular el área de un triángulo a partir de su base y su altura.
 * Concepto: 1. Declaración y sintaxis de un método (método con retorno double).
 */
public class Ej06AreaTriangulo {

    public static void main(String[] args) {
        double base = 4.5;
        double altura = 2.3;
        double area = calcularAreaTriangulo(base, altura);
        System.out.printf("El área del triángulo es: %.2f%n", area);
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2.0;
    }
}
