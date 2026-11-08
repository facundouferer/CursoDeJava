package CursoJava.l04_arrays_y_strings;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Contar las vocales de un texto.
 * Concepto: 10. Recorrer y cortar texto (charAt por índice e indexOf sobre un conjunto de caracteres).
 */
public class Ej33ContarVocales {

    private static final String VOCALES = "aeiouAEIOU";

    public static void main(String[] args) {
        String texto = "Los arreglos guardan muchos valores del mismo tipo bajo un único nombre";

        System.out.println("Texto: " + texto);
        System.out.println("Número de vocales: " + contarVocales(texto));
    }

    public static int contarVocales(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            // indexOf devuelve la posición del carácter dentro de VOCALES, o -1 si no está.
            if (VOCALES.indexOf(texto.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador;
    }
}
