package CursoJava.l03_control_de_flujo_y_bucles;

/**
 * Lección 03 – Control de flujo y bucles
 * Objetivo: recorrer y mostrar los elementos de un arreglo de nombres con for-each.
 * Concepto: 3. Bucles e iteración: for.
 */
public class Ej32ForEach {

    public static void main(String[] args) {
        String[] listaDePersonas = { "Rita", "Facundo", "Carlos", "Belén", "Analía" };

        for (String persona : listaDePersonas) {
            System.out.println(persona);
        }
    }
}
