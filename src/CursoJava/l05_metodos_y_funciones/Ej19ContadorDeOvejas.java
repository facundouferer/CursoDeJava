package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Contar de forma recursiva las ovejas presentes en un arreglo de booleanos.
 * Concepto: 5. Introducción a la recursión (recorrido de un arreglo con un índice).
 */
public class Ej19ContadorDeOvejas {

    // Cada posición representa una oveja: true significa que está presente.
    public static int contarOvejas(boolean[] ovejas, int indice) {
        if (indice == ovejas.length) {
            return 0;
        }

        if (ovejas[indice]) {
            System.out.println((indice + 1) + ") oveja!");
            return 1 + contarOvejas(ovejas, indice + 1);
        }
        System.out.println((indice + 1) + ") nada");
        return contarOvejas(ovejas, indice + 1);
    }

    public static void main(String[] args) {
        boolean[] ovejas = { true, false, true, true, false, true, true, false, true };
        int totalOvejas = contarOvejas(ovejas, 0);
        System.out.println("Se encontraron " + totalOvejas + " ovejas");
    }
}
