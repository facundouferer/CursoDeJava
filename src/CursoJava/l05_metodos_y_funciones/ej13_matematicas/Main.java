package CursoJava.l05_metodos_y_funciones.ej13_matematicas;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Invocar los métodos estáticos de OperadorMatematico sin crear ninguna instancia.
 * Concepto: 4. Métodos estáticos (static) vs métodos de instancia.
 */
public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        double resultado = OperadorMatematico.dividir(a, b);
        System.out.println("El resultado de la división es: " + resultado);
    }
}
