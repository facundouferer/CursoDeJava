package CursoJava.l05_metodos_y_funciones.ej13_matematicas;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Agrupar operaciones aritméticas básicas como métodos estáticos de utilidad.
 * Concepto: 4. Métodos estáticos (static) vs métodos de instancia.
 */
public class OperadorMatematico {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }

    public static int potencia(int base, int exponente) {
        return (int) Math.pow(base, exponente);
    }
}
