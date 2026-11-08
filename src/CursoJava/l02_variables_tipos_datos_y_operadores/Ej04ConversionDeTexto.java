package CursoJava.l02_variables_tipos_datos_y_operadores;

import java.util.Scanner;

/**
 * Lección 02 – Variables, tipos de datos y operadores
 * Objetivo: convertir texto ingresado por el usuario a números y sumarlos, validando la entrada.
 * Concepto: 4. Conversión de tipos (casting).
 */
public class Ej04ConversionDeTexto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer número a sumar:");
        String primerTexto = entrada.nextLine();
        System.out.println("Ingrese el segundo número a sumar:");
        String segundoTexto = entrada.nextLine();

        try {
            int suma = Integer.parseInt(primerTexto.trim()) + Integer.parseInt(segundoTexto.trim());
            System.out.println("La suma es: " + suma);
        } catch (NumberFormatException e) {
            // Si el usuario escribe letras, parseInt falla y se informa en lugar de cortar el programa.
            System.out.println("Debe ingresar únicamente números enteros.");
        }
        entrada.close();
    }
}
