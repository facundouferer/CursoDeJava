package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej12_garage;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Representar un auto con color, marca, año y tracción.
 * Concepto: 3. Ejemplo práctico: modelando una clase (atributos y toString).
 */
public class Auto {

    private final String color;
    private final String marca;
    private final int anio;
    private final String traccion;

    public Auto(String color, String marca, int anio, String traccion) {
        this.color = color;
        this.marca = marca;
        this.anio = anio;
        this.traccion = traccion;
    }

    @Override
    public String toString() {
        return "--------------------------\nColor: " + color + "\nMarca: " + marca + "\nAño: " + anio
                + "\nTracción: " + traccion;
    }
}
