package CursoJava.l02_variables_tipos_datos_y_operadores;

import java.util.Scanner;

/**
 * Lección 02 – Variables, tipos de datos y operadores
 * Objetivo: convertir una longitud de centímetros a pulgadas (1 cm = 0.39737 pulgadas).
 * Concepto: 5. Operadores aritméticos.
 */
public class Ej05ConversionDeUnidades {

    private static final double PULGADAS_POR_CENTIMETRO = 0.39737;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número de centímetros a convertir: ");
        double centimetros = entrada.nextDouble();

        double pulgadas = centimetros * PULGADAS_POR_CENTIMETRO;

        System.out.println(centimetros + " centímetros son " + pulgadas + " pulgadas");
        entrada.close();
    }
}
