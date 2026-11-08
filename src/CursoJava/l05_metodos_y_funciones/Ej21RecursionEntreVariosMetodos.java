package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Evaluar un cálculo en el que cuatro métodos se invocan recursivamente entre sí.
 * Concepto: 5. Introducción a la recursión (seguimiento de la pila de llamadas).
 */
public class Ej21RecursionEntreVariosMetodos {

    public static void main(String[] args) {
        System.out.println("funcionX(3, 2) = " + funcionX(3, 2));
    }

    public static int funcionX(int a, int b) {
        if (a <= 0) {
            return b;
        }
        return funcionY(a - 1, b + 1);
    }

    public static int funcionY(int c, int d) {
        if (d <= 1) {
            return c;
        }
        return funcionZ(c - 1, d - 1) + funcionW(c, d);
    }

    public static int funcionZ(int e, int f) {
        if (e <= 1) {
            return f;
        }
        return funcionX(e - 1, f + 2);
    }

    public static int funcionW(int g, int h) {
        if (g <= 0) {
            return h;
        }
        return funcionX(g - 2, h - 2) + funcionY(g, h - 1);
    }
}
