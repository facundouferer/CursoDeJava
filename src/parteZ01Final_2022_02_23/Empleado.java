package parteZ01Final_2022_02_23;

class Empleado extends Persona{

    Empleado(String nombre, String apellido, int dni, double sueldo) {
        super(nombre, apellido, dni, sueldo);
    }

    @Override
    void subirSueldo(double incremento) {
        double monto = super.getSueldoBasico() + incremento;
        super.setSueldoBasico(monto);
    }

    @Override
    double verSueldo() {
        return super.getSueldoBasico();
    }
}
