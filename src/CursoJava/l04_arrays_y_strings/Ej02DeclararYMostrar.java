package CursoJava.l04_arrays_y_strings;

import java.util.Scanner;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Listar un arreglo de DNI y marcar el que coincide con el DNI ingresado por el usuario.
 * Concepto: 2. Declarar, instanciar e inicializar (literal de inicialización) y 3. Recorrer con for-each.
 */
public class Ej02DeclararYMostrar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Literal de inicialización: el compilador deduce el tamaño.
        int[] dnis = { 12345678, 87654321, 31119278, 22222222, 55555555, 66666666, 77777777, 99999999 };

        System.out.print("Ingrese el DNI a buscar: ");
        int dniBuscado = scanner.nextInt();

        // Solo se lee el arreglo, por eso alcanza con un for-each.
        boolean encontrado = false;
        for (int dni : dnis) {
            if (dni == dniBuscado) {
                System.out.println(dni + " <--");
                encontrado = true;
            } else {
                System.out.println(dni);
            }
        }

        if (!encontrado) {
            System.out.println("El DNI " + dniBuscado + " no se encuentra en la base de datos.");
        }
    }
}
