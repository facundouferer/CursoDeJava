package CursoJava.Funciones;

public class Ejercicio04 {

    /**
     * Ejercicio 4:
     * Usando las funciones del ejercicio anterior, escribir un programa que pida al usuario dos
     * intervalos expresados en horas, minutos y segundos, sume sus duraciones, y muestre por
     * pantalla la duración total en horas, minutos y segundos.*/
    public static void main(String[] args) {
        int h1 = 2;
        int m1 = 30;
        int s1 = 15;

        int h2 = 1;
        int m2 = 45;
        int s2 = 20;

        int duracionTotal = sumarSegundos(horasASegundos(h1, m1, s1), horasASegundos(h2, m2, s2));
        int horas = duracionTotal / 3600;
        int minutos = (duracionTotal % 3600) / 60;
        int segundos = duracionTotal % 60;

        System.out.printf("La duración total es: %d horas, %d minutos y %d segundos", horas, minutos, segundos);
    }

    public static int horasASegundos(int horas, int minutos, int segundos) {
        return horas * 3600 + minutos * 60 + segundos;
    }

    public static int sumarSegundos(int duracion1, int duracion2) {
        return duracion1 + duracion2;
    }
}
