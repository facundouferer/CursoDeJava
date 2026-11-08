package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej07_fraccion;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Representar una fracción y operar con otras fracciones devolviendo nuevos objetos.
 * Concepto: 3. Ejemplo práctico: modelando una clase (métodos que reciben y devuelven objetos).
 */
public class Fraccion {

    private int dividendo;
    private int divisor;

    public Fraccion(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public Fraccion sumar(Fraccion otra) {
        int nuevoDividendo = (this.dividendo * otra.divisor) + (otra.dividendo * this.divisor);
        int nuevoDivisor = this.divisor * otra.divisor;
        return new Fraccion(nuevoDividendo, nuevoDivisor);
    }

    public Fraccion multiplicar(Fraccion otra) {
        return new Fraccion(this.dividendo * otra.dividendo, this.divisor * otra.divisor);
    }

    @Override
    public String toString() {
        return dividendo + "/" + divisor;
    }
}
