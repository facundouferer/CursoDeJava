package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.integrador_fin_hoteleria;

public class Huesped extends Persona implements MostrarInformacion {
    private static final long serialVersionUID = 1L;

    private final String nacionalidad;

    public Huesped(String nombre, String nacionalidad) {
        super(nombre);
        this.nacionalidad = nacionalidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nacionalidad: " + nacionalidad);
    }
}
