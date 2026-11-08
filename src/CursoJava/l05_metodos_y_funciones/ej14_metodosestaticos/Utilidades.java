package CursoJava.l05_metodos_y_funciones.ej14_metodosestaticos;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Mantener un contador compartido por toda la clase mediante métodos estáticos.
 * Concepto: 4. Métodos estáticos (static) vs métodos de instancia.
 */
public class Utilidades {

    private static int contador = 0;

    public static void incrementar() {
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public static void mensaje(String texto) {
        System.out.println(texto);
    }
}
