package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Calcular el área de un triángulo a partir de las coordenadas de sus tres vértices.
 * Concepto: 1. Declaración y sintaxis de un método (modularización con métodos auxiliares).
 */
public class Ej07AreaTrianguloPorPuntos {

    public static void main(String[] args) {
        double area = calcularAreaTriangulo(2.0, 3.0, 4.0, 1.0, 5.0, 4.0);
        System.out.printf("El área del triángulo es: %.2f%n", area);
    }

    public static double calcularAreaTriangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
        double base = distanciaEntrePuntos(x1, y1, x2, y2);
        double altura = distanciaPuntoRecta(x3, y3, x1, y1, x2, y2);
        return (base * altura) / 2.0;
    }

    public static double distanciaEntrePuntos(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Distancia del punto (x, y) a la recta que pasa por (x1, y1) y (x2, y2).
    public static double distanciaPuntoRecta(double x, double y, double x1, double y1, double x2, double y2) {
        double numerador = Math.abs((y2 - y1) * x - (x2 - x1) * y + x2 * y1 - y2 * x1);
        return numerador / distanciaEntrePuntos(x1, y1, x2, y2);
    }
}
