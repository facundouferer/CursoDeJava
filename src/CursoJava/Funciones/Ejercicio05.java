package CursoJava.Funciones;
/**Ejercicio 5:
 Dados dos puntos en el plano (x1, y1 y x2, y2), escribir dos funciones que permitan calcular e
 imprimir
 a) La suma de ambos como un par de valores.
 b) La resta de ambos como un par de valores.*/
public class Ejercicio05 {
    public static void main(String[] args) {
        double x1 = 2.5;
        double y1 = 3.7;
        double x2 = 1.8;
        double y2 = 4.2;

        double[] suma = sumarPuntos(x1, y1, x2, y2);
        double[] resta = restarPuntos(x1, y1, x2, y2);

        System.out.printf("La suma de los puntos es: (%.2f, %.2f)\n", suma[0], suma[1]);
        System.out.printf("La resta de los puntos es: (%.2f, %.2f)\n", resta[0], resta[1]);
    }

    public static double[] sumarPuntos(double x1, double y1, double x2, double y2) {
        double[] resultado = new double[2];
        resultado[0] = x1 + x2;
        resultado[1] = y1 + y2;
        return resultado;
    }

    public static double[] restarPuntos(double x1, double y1, double x2, double y2) {
        double[] resultado = new double[2];
        resultado[0] = x1 - x2;
        resultado[1] = y1 - y2;
        return resultado;
    }
}
