package CursoJava.l02_variables_tipos_datos_y_operadores;

import java.util.Scanner;

/**
 * Lección 02 – Variables, tipos de datos y operadores
 * Objetivo: aplicar los operadores aritméticos (suma, resta, multiplicación, división y resto) a dos enteros.
 * Concepto: 5. Operadores aritméticos.
 */
public class Ej07OperadoresAritmeticos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numeroUno = entrada.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numeroDos = entrada.nextInt();

        System.out.println("Suma: " + sumar(numeroUno, numeroDos));
        System.out.println("Resta: " + restar(numeroUno, numeroDos));
        System.out.println("Multiplicación: " + multiplicar(numeroUno, numeroDos));

        if (numeroDos == 0) {
            System.out.println("No se puede dividir por cero.");
        } else {
            System.out.println("Cociente entero: " + (numeroUno / numeroDos));
            System.out.println("Resto: " + (numeroUno % numeroDos));
            System.out.println("División decimal: " + dividir(numeroUno, numeroDos));
        }
        entrada.close();
    }

    public static int sumar(int numeroUno, int numeroDos) {
        return numeroUno + numeroDos;
    }

    public static int restar(int numeroUno, int numeroDos) {
        return numeroUno - numeroDos;
    }

    public static int multiplicar(int numeroUno, int numeroDos) {
        return numeroUno * numeroDos;
    }

    // Los parámetros son double, por lo que los enteros se convierten implícitamente y se conservan los decimales.
    public static double dividir(double numeroUno, double numeroDos) {
        return numeroUno / numeroDos;
    }
}
