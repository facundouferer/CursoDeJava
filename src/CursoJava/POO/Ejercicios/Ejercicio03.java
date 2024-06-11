package Ejercicios;

/**
 * Ejercicio 3:
 * Crear una clase Fracci�n, que cuente con dos atributos: dividendo y divisor,
 * que se asignan en
 * el constructor, y se imprimen como X/Y en el m�todo toString().
 * 1. Crear un m�todo sumar que recibe otra fracci�n y devuelve una nueva
 * fracci�n con la
 * suma de ambas.
 * 2. Crear un m�todo multiplicar que recibe otra fracci�n y devuelve una nueva
 * fracci�n con
 * el producto de ambas
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        // Creamos dos objetos de la clase Fraccion
        Fraccion fraccion1 = new Fraccion(3, 4);
        Fraccion fraccion2 = new Fraccion(2, 5);

        // Imprimimos las fracciones
        System.out.println("Fracci�n 1: " + fraccion1.toString());
        System.out.println("Fracci�n 2: " + fraccion2.toString());

        // Sumamos las fracciones
        Fraccion resultadoSuma = fraccion1.sumar(fraccion2);
        System.out.println("Resultado de la suma: " + resultadoSuma.toString());

        // Multiplicamos las fracciones
        Fraccion resultadoMultiplicacion = fraccion1.multiplicar(fraccion2);
        System.out.println("Resultado de la multiplicaci�n: " + resultadoMultiplicacion.toString());
    }
}

class Fraccion {

    // Atributos
    private int dividendo;
    private int divisor;

    // Constructor
    public Fraccion(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    // M�todos Get y Set
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

    // M�todo toString
    public String toString() {
        return dividendo + "/" + divisor;
    }

    // M�todo para sumar dos fracciones
    public Fraccion sumar(Fraccion otraFraccion) {
        int nuevoDividendo = (this.dividendo * otraFraccion.getDivisor())
                + (otraFraccion.getDividendo() * this.divisor);
        int nuevoDivisor = this.divisor * otraFraccion.getDivisor();
        return new Fraccion(nuevoDividendo, nuevoDivisor);
    }

    // M�todo para multiplicar dos fracciones
    public Fraccion multiplicar(Fraccion otraFraccion) {
        int nuevoDividendo = this.dividendo * otraFraccion.getDividendo();
        int nuevoDivisor = this.divisor * otraFraccion.getDivisor();
        return new Fraccion(nuevoDividendo, nuevoDivisor);
    }
}
