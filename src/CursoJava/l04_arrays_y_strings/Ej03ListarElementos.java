package CursoJava.l04_arrays_y_strings;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Listar los elementos de un arreglo de enteros con for-each y con for clásico.
 * Concepto: 3. Recorrer un array.
 */
public class Ej03ListarElementos {

    public static void main(String[] args) {
        int[] numeros = { 10, 3, 98, 12, 5 };

        // A) for-each: opción por defecto cuando el índice no importa.
        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }
        System.out.println();

        // B) for clásico: se dispone del índice y el último válido es length - 1.
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
        System.out.println();
    }
}
