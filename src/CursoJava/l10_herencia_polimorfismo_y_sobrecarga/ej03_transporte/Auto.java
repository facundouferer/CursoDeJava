package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej03_transporte;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar un auto de cuatro puertas y cuatro ruedas.
 * Concepto: 2. super: la cadena de constructores.
 */
class Auto extends Vehiculo {

    public Auto(String marca, String modelo, int anio, double precio, double impuestoPorRueda) {
        super(marca, modelo, anio, 4, 4, precio, impuestoPorRueda);
    }
}
