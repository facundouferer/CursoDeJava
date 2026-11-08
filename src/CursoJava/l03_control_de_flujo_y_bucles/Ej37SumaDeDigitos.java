package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: calcular la suma de los dígitos de un número positivo.
 * Concepto: 3. Bucles e iteración: while.
 */
public class Ej37SumaDeDigitos {

    public static void main(String[] args) {
        int numero = 12345;
        int suma = 0;

        while (numero > 0) {
            suma += numero % 10; // último dígito
            numero /= 10;        // descarta el último dígito
        }

        System.out.println("La suma de los dígitos es: " + suma);
    }
}
