package pre2023.parteZ01Final_2022_02_23;

public class Jefe extends Persona{

    private double porcentaje;

    Jefe(String nombre, String apellido, int dni, double sueldo, double porcentaje) {
        super(nombre, apellido, dni, sueldo);
        this.porcentaje = porcentaje;
    }

    @Override
    public void subirSueldo(double incremento) {
        double monto = super.getSueldoBasico() + incremento+ super.getSueldoBasico() * porcentaje;
        super.setSueldoBasico(monto);
    }

    @Override
    double verSueldo() {
        double monto = super.getSueldoBasico() + super.getSueldoBasico() * porcentaje;
        return monto;
    }

    @Override
    public String toString(){
        return super.toString() + " Porcentaje: " + this.porcentaje;
    }
}
