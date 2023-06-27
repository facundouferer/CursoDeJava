package CursoJava.ArrayList03;
import java.util.ArrayList;

// Clase Persona, que actúa como superclase para las clases Estudiante y Profesor
class Persona {
    String nombre;
    String apellido;
    String dni;

    // Constructor para inicializar los campos de la clase Persona
    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    // Método toString en la clase Persona
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni;
    }
}

// Clase Estudiante, que hereda de la clase Persona e introduce un nuevo campo legajo
class Estudiante extends Persona {
    String legajo;

    // Constructor para inicializar los campos de la clase Estudiante
    public Estudiante(String nombre, String apellido, String dni, String legajo) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
    }

    // Método toString sobrescrito en la clase Estudiante
    @Override
    public String toString() {
        return super.toString() + ", Legajo: " + legajo;
    }
}

// Clase Profesor, que hereda de la clase Persona e introduce un nuevo campo montoSueldo
class Profesor extends Persona {
    double montoSueldo;

    // Constructor para inicializar los campos de la clase Profesor
    public Profesor(String nombre, String apellido, String dni, double montoSueldo) {
        super(nombre, apellido, dni);
        this.montoSueldo = montoSueldo;
    }

    // Método toString sobrescrito en la clase Profesor
    @Override
    public String toString() {
        return super.toString() + ", Monto Sueldo: " + montoSueldo;
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

    // Método para eliminar un estudiante del curso
    public void eliminarEstudiante(String dni) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).dni.equals(dni)) {
                estudiantes.remove(i);
                break;
            }
        }
    }

    // Método para editar los detalles de un estudiante
    public void editarEstudiante(String dni, String nuevoNombre, String nuevoApellido, String nuevoLegajo) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.dni.equals(dni)) {
                estudiante.nombre = nuevoNombre;
                estudiante.apellido = nuevoApellido;
                estudiante.legajo = nuevoLegajo;
            }
        }
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

        // Imprimir los detalles del profesor y el estudiante
        System.out.println(profesor);
        System.out.println(estudiante);

        // Editar los detalles del estudiante
        curso.editarEstudiante("87654321", "Ana Maria", "Garcia Lopez", "1");

        // Imprimir los detalles del estudiante después de la edición
        System.out.println(estudiante);

        // Eliminar el estudiante del curso
        curso.eliminarEstudiante("87654321");
    }
}
