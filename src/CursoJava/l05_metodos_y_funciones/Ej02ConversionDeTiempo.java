package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Convertir un intervalo de horas, minutos y segundos a segundos, y viceversa.
 * Concepto: 1. Declaración y sintaxis de un método (retorno de un valor y de un arreglo).
 */
public class Ej02ConversionDeTiempo {

    private static final int SEGUNDOS_POR_HORA = 3600;
    private static final int SEGUNDOS_POR_MINUTO = 60;

    public static void main(String[] args) {
        int horas = 1;
        int minutos = 30;
        int segundos = 45;
        int totalSegundos = calcularSegundos(horas, minutos, segundos);
        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos
                + " segundos equivalen a " + totalSegundos + " segundos.");

        int segundosAConvertir = 9045;
        int[] tiempo = calcularTiempo(segundosAConvertir);
        System.out.println(segundosAConvertir + " segundos equivalen a " + tiempo[0] + " horas, "
                + tiempo[1] + " minutos y " + tiempo[2] + " segundos.");
    }

    public static int calcularSegundos(int horas, int minutos, int segundos) {
        return horas * SEGUNDOS_POR_HORA + minutos * SEGUNDOS_POR_MINUTO + segundos;
    }

    public static int[] calcularTiempo(int segundos) {
        int horas = segundos / SEGUNDOS_POR_HORA;
        int minutos = (segundos % SEGUNDOS_POR_HORA) / SEGUNDOS_POR_MINUTO;
        int segundosRestantes = segundos % SEGUNDOS_POR_MINUTO;
        return new int[] { horas, minutos, segundosRestantes };
    }
}
