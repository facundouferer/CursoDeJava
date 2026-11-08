package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Evaluar un cálculo en el que dos métodos se invocan recursivamente entre sí.
 * Concepto: 5. Introducción a la recursión (recursión mutua o indirecta).
 */
public class Ej20RecursionMutua {

    public static void main(String[] args) {
        System.out.println("funcionA(7) = " + funcionA(7));
    }

    public static int funcionA(int x) {
        if (x <= 1) {
            return x;
        }
        return funcionB(x - 1) + funcionA(x - 2);
    }

    public static int funcionB(int y) {
        if (y <= 2) {
            return y;
        }
        return funcionA(y - 1) + funcionB(y - 2);
    }
}
