package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.integrador_fin_hospital;

public class Doctor extends Persona {
    private static final long serialVersionUID = 1L;

    private final String especialidad;

    public Doctor(String nombre, String dni, String fechaNacimiento, String especialidad) {
        super(nombre, dni, fechaNacimiento);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
