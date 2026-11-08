package CursoJava.l05_metodos_y_funciones;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Distinguir una variable local de una variable estática con el mismo nombre.
 * Concepto: 2. La pila de llamadas y el pasaje de parámetros (variables locales en el marco de pila).
 */
public class Ej11AlcanceDeVariables {

    static int contador = 10;

    public static void main(String[] args) {
        incrementarContador();
        System.out.println("El valor del contador es: " + contador);
    }

    // La variable local "contador" oculta a la variable estática de la clase.
    public static void incrementarContador() {
        int contador = 5;
        contador++;
        System.out.println("El valor del contador local es: " + contador);
    }
}
