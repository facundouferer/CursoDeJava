package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: mostrar tres números ordenados de menor a mayor.
 * Concepto: 1. Condicionales: if anidado.
 */
public class Ej04OrdenarTresNumeros {

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 3;

        if (a > b) {
            if (b > c) {
                System.out.println(c + "," + b + "," + a);
            } else if (a > c) {
                System.out.println(b + "," + c + "," + a);
            } else {
                System.out.println(b + "," + a + "," + c);
            }
        } else {
            if (a > c) {
                System.out.println(c + "," + a + "," + b);
            } else if (b > c) {
                System.out.println(a + "," + c + "," + b);
            } else {
                System.out.println(a + "," + b + "," + c);
            }
        }
    }
}
