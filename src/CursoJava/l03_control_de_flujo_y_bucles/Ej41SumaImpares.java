package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: calcular la suma de los N primeros números impares (para 5: 1+3+5+7+9).
 * Concepto: 3. Bucles e iteración: while.
 */
public class Ej41SumaImpares {

    public static void main(String[] args) {
        int n = 5;
        int suma = 0;
        int contador = 0;
        int numero = 1;

        while (contador < n) {
            if (numero % 2 != 0) {
                suma += numero;
                contador++;
            }
            numero++;
        }

        System.out.println("La suma de los " + n + " primeros números impares es: " + suma);
    }
}
