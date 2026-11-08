package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej07_fraccion;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Sumar y multiplicar dos fracciones y mostrar los resultados.
 * Concepto: 3. Ejemplo práctico: modelando una clase (instanciación y uso).
 */
public class Main {

    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(3, 4);
        Fraccion fraccion2 = new Fraccion(2, 5);

        System.out.println("Fracción 1: " + fraccion1);
        System.out.println("Fracción 2: " + fraccion2);
        System.out.println("Resultado de la suma: " + fraccion1.sumar(fraccion2));
        System.out.println("Resultado de la multiplicación: " + fraccion1.multiplicar(fraccion2));
    }
}
