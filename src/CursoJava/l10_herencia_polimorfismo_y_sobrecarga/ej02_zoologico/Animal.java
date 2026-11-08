package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej02_zoologico;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar a un animal con nombre, tipo y cantidad de patas.
 * Concepto: 1. Herencia: extends y la prueba del "es un".
 */
class Animal {

    private final String nombre;
    private final String tipo;
    private final int cantidadPatas;

    public Animal(String nombre, String tipo, int cantidadPatas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadPatas = cantidadPatas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidadPatas() {
        return cantidadPatas;
    }

    @Override
    public String toString() {
        return nombre + " es del tipo " + tipo + " y tiene " + cantidadPatas + " patas.";
    }
}
