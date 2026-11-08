package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej02_zoologico;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar a un animal aéreo con alas y capacidad de vuelo.
 * Concepto: 2. super y 4. Sobrecarga de constructores.
 */
class Aereo extends Animal {

    private final int cantidadAlas;
    private final boolean puedeVolar;

    public Aereo(String nombre, int cantidadAlas, String tipo, boolean puedeVolar) {
        super(nombre, tipo, 2);
        this.cantidadAlas = cantidadAlas;
        this.puedeVolar = puedeVolar;
    }

    public Aereo(String nombre) {
        this(nombre, 2, "Aéreo", true);
    }

    public int getCantidadAlas() {
        return cantidadAlas;
    }

    public boolean puedeVolar() {
        return puedeVolar;
    }

    @Override
    public String toString() {
        return getNombre() + " tiene " + cantidadAlas + " alas y es " + getTipo();
    }
}
