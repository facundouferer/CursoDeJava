package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: calcular lo que cobra un trabajador: hasta 40 horas son normales; las extras se pagan al doble las
 * primeras 8 y al triple el resto.
 * Concepto: 1. Condicionales: if anidado.
 */
public class Ej21HorasExtras {

    private static final int HORAS_NORMALES = 40;
    private static final int HORAS_EXTRAS_AL_DOBLE = 8;

    public static void main(String[] args) {
        int horasTrabajadas = 50;
        int valorHora = 10;

        int horasNormales = Math.min(horasTrabajadas, HORAS_NORMALES);
        int horasExtras = 0;
        int horasExtrasDoble = 0;
        int horasExtrasTriple = 0;

        if (horasTrabajadas > HORAS_NORMALES) {
            horasExtras = horasTrabajadas - HORAS_NORMALES;
            if (horasExtras <= HORAS_EXTRAS_AL_DOBLE) {
                horasExtrasDoble = horasExtras;
            } else {
                horasExtrasDoble = HORAS_EXTRAS_AL_DOBLE;
                horasExtrasTriple = horasExtras - HORAS_EXTRAS_AL_DOBLE;
            }
        }

        int totalPagar = horasNormales * valorHora
                + horasExtrasDoble * valorHora * 2
                + horasExtrasTriple * valorHora * 3;

        System.out.println("Total horas trabajadas: " + horasTrabajadas);
        System.out.println("Total horas normales: " + horasNormales);
        System.out.println("Total horas extras: " + horasExtras);
        System.out.println("Total horas extras doble: " + horasExtrasDoble);
        System.out.println("Total horas extras triple: " + horasExtrasTriple);
        System.out.println("Total a pagar: " + totalPagar);
    }
}
