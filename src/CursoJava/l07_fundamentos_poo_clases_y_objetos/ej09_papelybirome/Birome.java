package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej09_papelybirome;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Escribir sobre un papel consumiendo una unidad de tinta por cada letra.
 * Concepto: 5. Referencias vs. copia de objetos (un objeto recibido por otro objeto).
 */
public class Birome {

    private int cantidadTinta;

    public Birome(int cantidadTinta) {
        this.cantidadTinta = cantidadTinta;
    }

    // Escribe sobre el mismo objeto Papel recibido; se detiene al agotarse la tinta.
    public void escribir(String texto, Papel papel) {
        for (int i = 0; i < texto.length(); i++) {
            if (cantidadTinta == 0) {
                System.out.println("La tinta se ha acabado.");
                break;
            }
            papel.escribir(String.valueOf(texto.charAt(i)));
            cantidadTinta--;
        }
    }
}
