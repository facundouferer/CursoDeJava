package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: clasificar a una persona según su altura en baja (hasta 150 cm), media (hasta 170 cm) o alta.
 * Concepto: 1. Condicionales: if, else if, else.
 */
public class Ej23AlturaDePersona {

    public static void main(String[] args) {
        double altura = 160;

        if (altura <= 150) {
            System.out.println("Persona de altura baja");
        } else if (altura <= 170) {
            System.out.println("Persona de altura media");
        } else {
            System.out.println("Persona alta");
        }
    }
}
