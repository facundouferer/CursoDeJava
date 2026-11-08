package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: calcular la cuota de una fianza: 3% del monto si es menor que $50000 y 2% en caso contrario.
 * Concepto: 1. Condicionales: if, else.
 */
public class Ej22CompaniaDeSeguros {

    private static final double LIMITE_MONTO = 50000;
    private static final double PORCENTAJE_MENOR = 0.03;
    private static final double PORCENTAJE_MAYOR = 0.02;

    public static void main(String[] args) {
        double monto = 60000;
        double cuota;

        if (monto < LIMITE_MONTO) {
            cuota = monto * PORCENTAJE_MENOR;
        } else {
            cuota = monto * PORCENTAJE_MAYOR;
        }

        System.out.println("Monto: " + monto);
        System.out.println("Cuota: " + cuota);
    }
}
