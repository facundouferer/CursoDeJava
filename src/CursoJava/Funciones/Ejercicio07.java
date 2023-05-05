package CursoJava.Funciones;

public class Ejercicio07 {
    /**Ejercicio 7:
     Escribir una función que reciba tres puntos en el plano (x1, y1, x2, y2 y x3, y3) e imprima el
     área del triángulo correspondiente.*/
    public static void main(String[] args) {
        double x1 = 2.0;
        double y1 = 3.0;
        double x2 = 4.0;
        double y2 = 1.0;
        double x3 = 5.0;
        double y3 = 4.0;

        double area = calcularAreaTriangulo(x1, y1, x2, y2, x3, y3);
        System.out.printf("El área del triángulo es: %.2f", area);
    }

    public static double calcularAreaTriangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
        double base = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double altura = distanciaPuntoRecta(x3, y3, x1, y1, x2, y2);
        double area = (base * altura) / 2.0;
        return area;
    }

    public static double distanciaPuntoRecta(double x, double y, double x1, double y1, double x2, double y2) {
        double numerador = Math.abs((y2 - y1) * x - (x2 - x1) * y + x2 * y1 - y2 * x1);
        double denominador = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
        return numerador / denominador;
    }
}
