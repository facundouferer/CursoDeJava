package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: determinar si un alumno aprueba el curso: promedio de tres calificaciones mayor o igual a 60.
 * Concepto: 1. Condicionales: if, else.
 */
public class Ej13Aprobacion {

    private static final double NOTA_APROBACION = 60;

    public static void main(String[] args) {
        int calificacion1 = 50;
        int calificacion2 = 50;
        int calificacion3 = 50;

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3.0;

        if (promedio >= NOTA_APROBACION) {
            System.out.println("El alumno aprueba el curso");
        } else {
            System.out.println("El alumno desaprueba el curso");
        }
    }
}
