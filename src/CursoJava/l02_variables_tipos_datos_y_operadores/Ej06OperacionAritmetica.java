package CursoJava.l02_variables_tipos_datos_y_operadores;

import java.util.Scanner;

/**
 * Lección 02 – Variables, tipos de datos y operadores
 * Objetivo: leer un número y mostrar su cuadrado.
 * Concepto: 5. Operadores aritméticos.
 */
public class Ej06OperacionAritmetica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double numero = entrada.nextDouble();

        double cuadrado = numero * numero;

        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
        entrada.close();
    }
}
