package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej11_calculadora;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Operar con dos números enteros guardados como estado del objeto.
 * Concepto: 3. Ejemplo práctico: modelando una clase (atributos y métodos).
 */
public class Calculadora {

    private final int nro1;
    private final int nro2;

    public Calculadora(int nro1, int nro2) {
        this.nro1 = nro1;
        this.nro2 = nro2;
    }

    public int sumar() {
        return nro1 + nro2;
    }

    public int restar() {
        return nro1 - nro2;
    }

    public int multiplicar() {
        return nro1 * nro2;
    }

    // Precondición: el segundo número no es cero (ver puedeDividir).
    public double dividir() {
        return (double) nro1 / nro2;
    }

    public boolean puedeDividir() {
        return nro2 != 0;
    }

    public boolean esIndeterminada() {
        return nro1 == 0 && nro2 == 0;
    }

    public int getNro1() {
        return nro1;
    }

    public int getNro2() {
        return nro2;
    }
}
