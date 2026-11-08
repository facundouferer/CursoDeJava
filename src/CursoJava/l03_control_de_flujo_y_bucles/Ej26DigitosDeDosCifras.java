package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: mostrar los dígitos de un número de dos cifras e informar si su suma es múltiplo de 3.
 * Concepto: 1. Condicionales: if anidado.
 */
public class Ej26DigitosDeDosCifras {

    public static void main(String[] args) {
        int numero = 56;

        if (numero >= 10 && numero <= 99) {
            int decenas = numero / 10;
            int unidades = numero % 10;
            int sumaDigitos = decenas + unidades;

            System.out.println("Número: " + numero);
            System.out.println("Dígito 1: " + decenas);
            System.out.println("Dígito 2: " + unidades);
            System.out.println("Suma de dígitos: " + sumaDigitos);

            if (sumaDigitos % 3 == 0) {
                System.out.println("La suma de los dígitos es múltiplo de 3");
            } else {
                System.out.println("La suma de los dígitos no es múltiplo de 3");
            }
        } else {
            System.out.println("El número debe ser de dos cifras");
        }
    }
}
