package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.integrador_fin_hospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona implements Informacion {
    private static final long serialVersionUID = 1L;

    private String numeroTelefono;
    private final String tipoSangre;
    private final List<String> historialMedico = new ArrayList<>();

    public Paciente(String nombre, String dni, String fechaNacimiento, String numeroTelefono, String tipoSangre) {
        super(nombre, dni, fechaNacimiento);
        this.numeroTelefono = numeroTelefono;
        this.tipoSangre = tipoSangre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void agregarEvento(String evento) {
        historialMedico.add(evento);
    }

    @Override
    public void verHistorialDeEventos() {
        if (historialMedico.isEmpty()) {
            System.out.println("El paciente no tiene eventos registrados.");
            return;
        }
        for (String evento : historialMedico) {
            System.out.println("- " + evento);
        }
    }
}
