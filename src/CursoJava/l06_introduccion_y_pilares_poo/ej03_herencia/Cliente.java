package CursoJava.l06_introduccion_y_pilares_poo.ej03_herencia;

/*
 * Lección 06 – Introducción y pilares de la POO
 * Objetivo: Extender Persona indicando si el cliente compra como mayorista.
 * Concepto: Pilar 3: Herencia.
 */
public class Cliente extends Persona {

    private final boolean mayorista;

    public Cliente(String nombre, String apellido, int dni, boolean mayorista) {
        super(nombre, apellido, dni);
        this.mayorista = mayorista;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMayorista: " + mayorista;
    }
}
