package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Calcular e imprimir la suma y la resta de dos puntos del plano como pares de valores.
 * Concepto: 1. Declaración y sintaxis de un método (retorno de un arreglo con dos coordenadas).
 */
public class Ej05SumaYRestaDePuntos {

    public static void main(String[] args) {
        double x1 = 2.5;
        double y1 = 3.7;
        double x2 = 1.8;
        double y2 = 4.2;

        double[] suma = sumarPuntos(x1, y1, x2, y2);
        double[] resta = restarPuntos(x1, y1, x2, y2);

        System.out.printf("La suma de los puntos es: (%.2f, %.2f)%n", suma[0], suma[1]);
        System.out.printf("La resta de los puntos es: (%.2f, %.2f)%n", resta[0], resta[1]);
    }

    public static double[] sumarPuntos(double x1, double y1, double x2, double y2) {
        return new double[] { x1 + x2, y1 + y2 };
    }

    public static double[] restarPuntos(double x1, double y1, double x2, double y2) {
        return new double[] { x1 - x2, y1 - y2 };
    }
}
