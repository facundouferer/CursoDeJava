package CursoJava.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

class People {
    private String nombre;
    private String apellido;
    private String dni;

    public People(String nombre, String apellido, String dni) {
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

    // Método toString en la clase Persona
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni;
    }
}

// Clase Estudiante, que hereda de la clase Persona e introduce un nuevo campo legajo
class Studient extends People {
    private String legajo;

    // Constructor para inicializar los campos de la clase Estudiante
    public Studient(String nombre, String apellido, String dni, String legajo) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    // Método toString sobrescrito en la clase Estudiante
    @Override
    public String toString() {
        return super.toString() + ", Legajo: " + legajo;
    }
}

// Clase Profesor, que hereda de la clase Persona e introduce un nuevo campo montoSueldo
class Teacher extends People {
    private double montoSueldo;

    // Constructor para inicializar los campos de la clase Profesor
    public Teacher(String nombre, String apellido, String dni, double montoSueldo) {
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
class ClassRoom {
    ArrayList<Studient> estudiantes;
    Teacher profesor;

    // Constructor para inicializar los campos de la clase Curso
    public ClassRoom() {
        estudiantes = new ArrayList<Studient>();
    }

    // Método para establecer el profesor del curso
    public void setProfesor(Teacher profesor) {
        this.profesor = profesor;
    }

    // Método para agregar un estudiante al curso
    public void agregarEstudiante(Studient estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para eliminar un estudiante del curso
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
        for (Studient estudiante : estudiantes) {
            if (estudiante.getDni().equals(dni)) {
                estudiante.setNombre(nuevoNombre);
                estudiante.setApellido(nuevoApellido);
                estudiante.setLegajo(nuevoLegajo);
            }
        }
    }

    public String toString() {
        String detalles = "Profesor: " + profesor + "\nEstudiantes:\n";
        for (Studient estudiante : estudiantes) {
            detalles += estudiante + "\n";
        }
        return detalles;
    }


}

// Clases Persona, Estudiante, Profesor, y Curso son las mismas

class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassRoom curso = new ClassRoom();

        while (true) {
            System.out.println("1. Asignar profesor al curso\n2. Agregar estudiante al curso\n3. Editar estudiante\n4. Eliminar estudiante\n5. Mostrar detalles del curso\n6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del profesor: ");
                    String nombreProfesor = scanner.next();
                    System.out.print("Ingrese apellido del profesor: ");
                    String apellidoProfesor = scanner.next();
                    System.out.print("Ingrese DNI del profesor: ");
                    String dniProfesor = scanner.next();
                    System.out.print("Ingrese sueldo del profesor: ");
                    double montoSueldo = scanner.nextDouble();

                    Teacher profesor = new Teacher(nombreProfesor, apellidoProfesor, dniProfesor, montoSueldo);
                    curso.setProfesor(profesor);
                    break;
                case 2:
                    System.out.print("Ingrese nombre del estudiante: ");
                    String nombreEstudiante = scanner.next();
                    System.out.print("Ingrese apellido del estudiante: ");
                    String apellidoEstudiante = scanner.next();
                    System.out.print("Ingrese DNI del estudiante: ");
                    String dniEstudiante = scanner.next();
                    System.out.print("Ingrese legajo del estudiante: ");
                    String legajo = scanner.next();

                    Studient estudiante = new Studient(nombreEstudiante, apellidoEstudiante, dniEstudiante, legajo);
                    curso.agregarEstudiante(estudiante);
                    break;
                case 3:
                    System.out.print("Ingrese DNI del estudiante a editar: ");
                    String dniEditar = scanner.next();
                    System.out.print("Ingrese nuevo nombre del estudiante: ");
                    String nuevoNombre = scanner.next();
                    scanner.nextLine();
                    System.out.print("Ingrese nuevo apellido del estudiante: ");
                    String nuevoApellido = scanner.next();
                    System.out.print("Ingrese nuevo legajo del estudiante: ");
                    String nuevoLegajo = scanner.next();

                    curso.editarEstudiante(dniEditar, nuevoNombre, nuevoApellido, nuevoLegajo);
                    break;
                case 4:
                    System.out.print("Ingrese DNI del estudiante a eliminar: ");
                    String dniEliminar = scanner.next();
                    curso.eliminarEstudiante(dniEliminar);
                    break;
                case 5:
                    System.out.println(curso);
                    break;
                case 6:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        }
    }
}
