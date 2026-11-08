package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej03_transporte;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: modelar un vehículo con impuesto calculado por rueda.
 * Concepto: 4. Sobrecarga de constructores con delegación this(...).
 */
class Vehiculo {

    private final String marca;
    private final String modelo;
    private final int anio;
    private final int puertas;
    private final int cantidadRuedas;
    private final double precio;
    private final double impuestoPorRueda;

    public Vehiculo(String marca, String modelo, int anio, int puertas, int cantidadRuedas,
            double precio, double impuestoPorRueda) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.puertas = puertas;
        this.cantidadRuedas = cantidadRuedas;
        this.precio = precio;
        this.impuestoPorRueda = impuestoPorRueda;
    }

    public Vehiculo(String marca, String modelo, int anio, int puertas, int cantidadRuedas, double precio) {
        this(marca, modelo, anio, puertas, cantidadRuedas, precio, 0);
    }

    public double getPrecio() {
        return precio;
    }

    /** El impuesto es un porcentaje del precio por cada rueda del vehículo. */
    public double getImpuesto() {
        return impuestoPorRueda * cantidadRuedas * precio / 100;
    }

    public double getPrecioConImpuesto() {
        return precio + getImpuesto();
    }

    public int getPuertas() {
        return puertas;
    }

    public String getDatosBasicos() {
        return marca + " " + modelo + ", " + anio;
    }

    @Override
    public String toString() {
        return getDatosBasicos() + ", " + puertas + " puertas, U$s " + getPrecioConImpuesto();
    }
}
