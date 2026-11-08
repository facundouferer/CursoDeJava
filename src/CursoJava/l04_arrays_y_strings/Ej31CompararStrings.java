package CursoJava.l04_arrays_y_strings;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Comparar cadenas con == y con equals para ver la diferencia entre identidad y contenido.
 * Concepto: 9. El String Constant Pool y la trampa de ==.
 */
public class Ej31CompararStrings {

    public static void main(String[] args) {
        String s1 = "Hola";
        String s2 = "Hola";
        String s3 = new String("Hola");

        // Los literales idénticos comparten el mismo objeto del pool.
        System.out.println("s1 == s2: " + (s1 == s2));
        // new siempre crea un objeto aparte, aunque tenga el mismo contenido.
        System.out.println("s1 == s3: " + (s1 == s3));
        // equals compara el contenido, que es lo que casi siempre se necesita.
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        // Una cadena armada en ejecución tampoco está en el pool.
        String parte = "Ho";
        String armada = parte + "la";
        System.out.println("s1 == armada: " + (s1 == armada));
        System.out.println("s1.equals(armada): " + s1.equals(armada));

        // Con el literal a la izquierda, equals es seguro frente a null.
        String entrada = null;
        System.out.println("\"Hola\".equals(entrada): " + "Hola".equals(entrada));
    }
}
