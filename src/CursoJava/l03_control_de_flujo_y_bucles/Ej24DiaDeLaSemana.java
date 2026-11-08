package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: mostrar el día de la semana correspondiente a un número entre 1 y 7.
 * Concepto: 2. La estructura switch (switch expressions).
 */
public class Ej24DiaDeLaSemana {

    public static void main(String[] args) {
        int dia = 3;

        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Número de día no válido";
        };

        System.out.println(nombreDia);
    }
}
