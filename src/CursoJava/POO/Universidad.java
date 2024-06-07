
public class Universidad {
    public static void main(String[] args) {
        Materia materia = new Materia("Matematica", 1);
        Profesor profesor = new Profesor("Pedro", "Gomez", "87654321", materia, 2015);
        // Array de Estudiantes
        Estudiante[] estudiantes = new Estudiante[3];
        estudiantes[0] = new Estudiante("Juan", "Perez", "12345678", "Ingenieria", 2019);
        estudiantes[1] = new Estudiante("Pedro", "Gomez", "87654321", "Ingenieria", 2019);
        estudiantes[2] = new Estudiante("Maria", "Gonzalez", "45678912", "Ingenieria", 2019);

        Curso curso = new Curso();
        curso.setMateria(materia);
        curso.setProfesor(profesor);
        curso.setEstudiantes(estudiantes);

    }
}

class Curso {
    Materia materia;
    Profesor profesor;
    Estudiante[] estudiantes;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
}

class Persona {
    private String nombre;
    private String apellido;
    private String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}

class Estudiante extends Persona {
    private String carrera;
    private int anioIngreso;

    public Estudiante(String nombre, String apellido, String dni, String carrera, int anioIngreso) {
        super(nombre, apellido, dni);
        this.carrera = carrera;
        this.anioIngreso = anioIngreso;
    }
}

class Profesor extends Persona {
    private Materia materia;
    private int anioIngreso;

    public Profesor(String nombre, String apellido, String dni, Materia materia, int anioIngreso) {
        super(nombre, apellido, dni);
        this.materia = materia;
        this.anioIngreso = anioIngreso;
    }
}

class Materia {
    String nombre;
    int anio;

    public Materia(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + this.nombre + '\'' +
                ", anio=" + this.anio +
                '}';
    }
}
