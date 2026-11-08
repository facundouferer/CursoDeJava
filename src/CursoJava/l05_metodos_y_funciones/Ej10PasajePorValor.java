package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Comprobar que intercambiar parámetros primitivos dentro de un método no altera las variables del llamador.
 * Concepto: 2. La pila de llamadas y el pasaje de parámetros (Java es estrictamente pasaje por valor).
 */
public class Ej10PasajePorValor {

    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        intercambiar(a, b);
        System.out.println("En main: a = " + a + ", b = " + b);

        int c = 5;
        int d = 10;
        intercambiarConIncrementos(c, d);
        System.out.println("En main: c = " + c + ", d = " + d);
    }

    // Intercambia las copias locales de los parámetros.
    public static void intercambiar(int x, int y) {
        int temporal = x;
        x = y;
        y = temporal;
        System.out.println("En intercambiar: x = " + x + ", y = " + y);
    }

    // Igual que el anterior, pero con post-incrementos sobre las copias locales.
    public static void intercambiarConIncrementos(int x, int y) {
        int temporal = x;
        x = y++;
        y = temporal++;
        System.out.println("En intercambiarConIncrementos: x = " + x + ", y = " + y);
    }
}
