package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej10_mate;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Tomar mates con un objeto Mate hasta que se lava y seguir usándolo después.
 * Concepto: 3. Ejemplo práctico: modelando una clase (instanciación y uso).
 */
public class Main {

    public static void main(String[] args) {
        Mate mate = new Mate(10);

        // Cebar en exceso para provocar la advertencia de mate lleno.
        for (int i = 0; i < 11; i++) {
            mate.cebar();
        }

        // Tomar mates hasta que se agoten las cebadas: se bebe y se vuelve a cebar.
        while (mate.getCebadasRestantes() > 0) {
            mate.beber();
            mate.cebar();
        }

        // Seguir usando el mate ya lavado.
        mate.beber();
        mate.cebar();
        mate.beber();
    }
}
