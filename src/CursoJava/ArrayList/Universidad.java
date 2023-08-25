package CursoJava.ArrayList;
import java.util.ArrayList;

// Clase Persona, que actúa como superclase para las clases Estudiante y Profesor
class Persona {
    private String nombre;
    private String apellido;
    private String dni;

    // Constructor para inicializar los campos de la clase Persona
    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}

// Clase Estudiante, que hereda de la clase Persona e introduce un nuevo campo legajo
class Estudiante extends Persona {
    private String legajo;

    // Constructor para inicializar los campos de la clase Estudiante
    public Estudiante(String nombre, String apellido, String dni, String legajo) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String toString() {
        return "Estudiante{" +
                "legajo='" + this.legajo + '\'' +
                ", nombre='" + super.getNombre() + '\'' +
                ", apellido='" + super.getApellido() + '\'' +
                ", dni='" + super.getDni() + '\'' +
                '}';
    }
}

// Clase Profesor, que hereda de la clase Persona e introduce un nuevo campo montoSueldo
class Profesor extends Persona {
    private double montoSueldo;

    // Constructor para inicializar los campos de la clase Profesor
    public Profesor(String nombre, String apellido, String dni, double montoSueldo) {
        super(nombre, apellido, dni);
        this.montoSueldo = montoSueldo;
    }

    public double getMontoSueldo() {
        return montoSueldo;
    }

    public void setMontoSueldo(double montoSueldo) {
        this.montoSueldo = montoSueldo;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "montoSueldo=" + this.montoSueldo +
                ", nombre='" + super.getNombre() + '\'' +
                ", apellido='" + super.getApellido() + '\'' +
                ", dni='" + super.getDni() + '\'' +
                '}';
    }
}

// Clase Curso, que contiene un ArrayList de estudiantes y un objeto de la clase Profesor
class Curso {
    ArrayList<Estudiante> estudiantes;
    Profesor profesor;

    // Constructor para inicializar los campos de la clase Curso
    public Curso() {
        estudiantes = new ArrayList<Estudiante>();
    }

    // Método para establecer el profesor del curso
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    // Método para agregar un estudiante al curso
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método modificado para eliminar un estudiante del curso
    public void eliminarEstudiante(String dni) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getDni().equals(dni)) {
                estudiantes.remove(i);
                break;
            }
        }
    }

    // Método para editar los detalles de un estudiante
    public void editarEstudiante(String dni, String nuevoNombre, String nuevoApellido, String nuevoLegajo) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getDni().equals(dni)) {
                estudiante.setNombre(nuevoNombre);
                estudiante.setApellido(nuevoApellido);
                estudiante.setLegajo(nuevoLegajo);
            }
        }
    }

    public String toString() {
        return "Curso: \n" + "Profesor: " + profesor.toString() + "\n";
    }



}

class Main {
    public static void main(String[] args) {
        // Crear una instancia de Curso
        Curso curso = new Curso();

        // Crear un profesor y asignarlo al curso
        Profesor profesor = new Profesor("Juan", "Pérez", "12345678", 30000.0);
        curso.setProfesor(profesor);

        // Crear un estudiante y agregarlo al curso
        Estudiante estudiante = new Estudiante("Ana", "Garcia", "87654321", "1");
        curso.agregarEstudiante(estudiante);

        // Editar los detalles del estudiante
        curso.editarEstudiante("87654321", "Ana Maria", "Garcia Lopez", "1");

        // Eliminar el estudiante del curso
        curso.eliminarEstudiante("87654321");

        System.out.println(curso.toString());
    }
}
