package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej02_zoologico;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar a un animal terrestre según su forma de nacimiento.
 * Concepto: 2. super y 4. Sobrecarga de constructores.
 */
class Terrestre extends Animal {

    private static final int VIVIPARO = 1;
    private static final int OVIPARO = 2;

    private final int nacimiento;

    public Terrestre(String nombre, int cantidadPatas, String tipo, int nacimiento) {
        super(nombre, tipo, cantidadPatas);
        this.nacimiento = nacimiento;
    }

    public Terrestre(String nombre) {
        this(nombre, 4, "Terrestre", VIVIPARO);
    }

    @Override
    public String toString() {
        String tipoNacimiento = switch (nacimiento) {
            case VIVIPARO -> "Vivíparo";
            case OVIPARO -> "Ovíparo";
            default -> "Desconocido";
        };
        return getNombre() + " tiene " + getCantidadPatas() + " patas " + getTipo() + " y es " + tipoNacimiento;
    }
}
