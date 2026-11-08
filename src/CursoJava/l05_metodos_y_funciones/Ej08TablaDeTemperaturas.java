package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Generar una tabla de conversión de grados Fahrenheit a Celsius, de 0 °F a 120 °F de 10 en 10.
 * Concepto: 1. Declaración y sintaxis de un método (reutilizar un método dentro de un bucle).
 */
public class Ej08TablaDeTemperaturas {

    public static void main(String[] args) {
        int inicio = 0;
        int fin = 120;
        int incremento = 10;

        System.out.printf("%10s %10s%n", "Fahrenheit", "Celsius");
        System.out.println("---------------------");

        for (double fahrenheit = inicio; fahrenheit <= fin; fahrenheit += incremento) {
            System.out.printf("%10.1f %10.1f%n", fahrenheit, fahrenheitACelsius(fahrenheit));
        }
    }

    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}
