package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Sumar dos intervalos de tiempo y mostrar la duración total en horas, minutos y segundos.
 * Concepto: 1. Declaración y sintaxis de un método (composición de llamadas entre métodos).
 */
public class Ej04SumaDeIntervalos {

    public static void main(String[] args) {
        int duracionTotal = sumarSegundos(horasASegundos(2, 30, 15), horasASegundos(1, 45, 20));

        int horas = duracionTotal / 3600;
        int minutos = (duracionTotal % 3600) / 60;
        int segundos = duracionTotal % 60;

        System.out.printf("La duración total es: %d horas, %d minutos y %d segundos%n", horas, minutos, segundos);
    }

    public static int horasASegundos(int horas, int minutos, int segundos) {
        return horas * 3600 + minutos * 60 + segundos;
    }

    public static int sumarSegundos(int duracion1, int duracion2) {
        return duracion1 + duracion2;
    }
}
