package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Provocar un StackOverflowError con una recursión sin caso base.
 * Concepto: 5. Introducción a la recursión (la pila de llamadas tiene un límite).
 */
public class Ej22DesbordamientoDePila {

    public static void main(String[] args) {
        recursionInfinita(1);
    }

    // Sin caso base: cada llamada apila un marco nuevo hasta agotar la pila.
    public static void recursionInfinita(int profundidad) {
        if (profundidad % 1000 == 0) {
            System.out.println("Profundidad de la pila: " + profundidad);
        }
        recursionInfinita(profundidad + 1);
    }
}
