package CursoJava.l05_metodos_y_funciones.ej14_metodosestaticos;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Mostrar que el estado estático pertenece a la clase y se comparte sin instanciarla.
 * Concepto: 4. Métodos estáticos (static) vs métodos de instancia.
 */
public class Main {

    public static void main(String[] args) {
        Utilidades.mensaje("Inicial: " + Utilidades.getContador());
        Utilidades.incrementar();
        Utilidades.incrementar();
        Utilidades.mensaje("Después de incrementar: " + Utilidades.getContador());
    }
}
