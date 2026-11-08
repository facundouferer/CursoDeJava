package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: mostrar en orden inverso los números comprendidos entre el 5 y el 230.
 * Concepto: 3. Bucles e iteración: while.
 */
public class Ej35NumerosEnOrdenInverso {

    public static void main(String[] args) {
        int numero = 230;

        while (numero >= 5) {
            System.out.print(numero + " - ");
            numero--;
        }
        System.out.println();
    }
}
