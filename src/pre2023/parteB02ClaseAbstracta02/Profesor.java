package pre2023.parteB02ClaseAbstracta02;

public class Profesor extends Persona {

    private String carrera;

    public Profesor(int dni, String nombre, String carrera) {
        super(dni, nombre);
        this.carrera = carrera;
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Profesor [CARRERA = " + carrera + ", NOMBRE = " + super.getNombre() + ", DNI = " + super.getDni() + "]";
    }
}
