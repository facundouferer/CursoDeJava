package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: mostrar los números pares desde el 2 hasta un límite, usando un bucle while.
 * Concepto: 3. Bucles e iteración: while.
 */
public class Ej34NumerosPares {

    public static void main(String[] args) {
        System.out.println("Números pares del 2 al 300:");
        imprimirPares(300);

        System.out.println("Números pares hasta el 18:");
        imprimirPares(18);
    }

    private static void imprimirPares(int limite) {
        int numero = 2;
        while (numero <= limite) {
            System.out.print(numero + " - ");
            numero += 2;
        }
        System.out.println();
    }
}
