package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej09_papelybirome;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Acumular el texto escrito sobre una hoja de papel.
 * Concepto: 5. Referencias vs. copia de objetos (un objeto recibido por otro objeto).
 */
public class Papel {

    private String texto = "";

    public void escribir(String agregado) {
        this.texto += agregado;
    }

    @Override
    public String toString() {
        return texto;
    }
}
