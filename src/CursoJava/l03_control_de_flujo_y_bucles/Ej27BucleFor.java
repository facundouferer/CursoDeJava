package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: mostrar un contador del 0 al 10 con un bucle for.
 * Concepto: 3. Bucles e iteración: for.
 */
public class Ej27BucleFor {

    public static void main(String[] args) {
        // Se usa for cuando se conoce de antemano el número de iteraciones.
        for (int i = 0; i <= 10; i++) {
            System.out.println("Contador: " + i);
        }
    }
}
