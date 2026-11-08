package CursoJava.l08_constructores_y_encapsulamiento;

/*
 * Lección 08 – Constructores y encapsulamiento
 * Objetivo: calcular operaciones aritméticas entre dos números recibidos al construir el objeto.
 * Concepto: 1. El constructor: el único momento en que un objeto nace.
 */
public class Ej01Matematica {

    public static void main(String[] args) {
        Matematica matematica = new Matematica(5, 5);

        System.out.println("El resultado es: " + matematica.sumar());
    }
}

class Matematica {

    private int a;
    private int b;

    Matematica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sumar() {
        return a + b;
    }

    public int restar() {
        return a - b;
    }

    public int multiplicar() {
        return a * b;
    }

    public int dividir() {
        if (b == 0) {
            System.out.println("Error: división por cero");
            return 0;
        }
        return a / b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
