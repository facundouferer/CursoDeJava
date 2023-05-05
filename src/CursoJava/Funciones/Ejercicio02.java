package CursoJava.Funciones;

/**Ejercicio 2:
 Escribir dos funciones que permitan calcular:
 a) La duración en segundos de un intervalo dado en horas, minutos y segundos.
 b) La duración en horas, minutos y segundos de un intervalo dado en segundos.*/
public class Ejercicio02 {
    public static void main(String[] args) {
        int horas = 1;
        int minutos = 30;
        int segundos = 45;
        int totalSegundos = calcularSegundos(horas, minutos, segundos);
        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos equivalen a " + totalSegundos + " segundos.");
        int segundosConvertir = 9045;
        int[] tiempo = calcularTiempo(segundosConvertir);
        System.out.println(segundosConvertir + " segundos equivalen a " + tiempo[0] + " horas, " + tiempo[1] + " minutos y " + tiempo[2] + " segundos.");
    }

    public static int calcularSegundos(int horas, int minutos, int segundos) {
        int segundosTotales = horas * 3600 + minutos * 60 + segundos;
        return segundosTotales;
    }

    public static int[] calcularTiempo(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;
        return new int[]{horas, minutos, segundosRestantes};
    }
}
