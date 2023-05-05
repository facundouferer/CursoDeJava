package CursoJava.Funciones;
/**Ejercicio 10:
 Utilice el programa anterior para generar una tabla de conversión de temperaturas, desde 0 °F
 hasta 120 °F, de 10 en 10*/
public class Ejercicio10 {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        int inicio = 0, fin = 120, incremento = 10;

        System.out.printf("%10s %10s\n", "Fahrenheit", "Celsius");
        System.out.println("---------------------");

        for (fahrenheit = inicio; fahrenheit <= fin; fahrenheit += incremento) {
            celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
            System.out.printf("%10.1f %10.1f\n", fahrenheit, celsius);
        }
    }
}

