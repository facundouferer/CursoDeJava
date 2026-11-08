package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej03_transporte;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar una moto de dos ruedas, sin puertas ni impuesto.
 * Concepto: 3. Sobrescritura de toString.
 */
class Moto extends Vehiculo {

    public Moto(String marca, String modelo, int anio, double precio) {
        super(marca, modelo, anio, 0, 2, precio);
    }

    @Override
    public String toString() {
        return getDatosBasicos() + ", U$s " + getPrecioConImpuesto();
    }
}
