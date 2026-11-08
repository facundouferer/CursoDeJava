package CursoJava.l07_fundamentos_poo_clases_y_objetos;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Calcular el área de un rectángulo resolviendo con this el sombreamiento entre parámetros y atributos.
 * Concepto: 4. La palabra reservada this y sombreamiento de variables.
 */
public class Ej03Rectangulo {

    private final int ancho;
    private final int alto;

    public Ej03Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public int calcularArea() {
        return ancho * alto;
    }

    public static void main(String[] args) {
        Ej03Rectangulo rectangulo = new Ej03Rectangulo(3, 3);
        System.out.println("Área: " + rectangulo.calcularArea());
    }
}
