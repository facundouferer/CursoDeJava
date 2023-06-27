package CursoJava.ArraysList01;
import java.util.ArrayList;

class ManejoEstudiantes {
    private ArrayList<Estudiante> estudiantes;

    public ManejoEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void modificarEstudiante(int index, Estudiante estudiante) {
        if (index >= 0 && index < estudiantes.size()) {
            estudiantes.set(index, estudiante);
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public void eliminarEstudiante(int index) {
        if (index >= 0 && index < estudiantes.size()) {
            estudiantes.remove(index);
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public void imprimirEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }
}

class Estudiante {
    String nombre;
    int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + this.nombre + '\'' +
                ", edad=" + this.edad +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        ManejoEstudiantes manejoEstudiantes = new ManejoEstudiantes();

        manejoEstudiantes.agregarEstudiante(new Estudiante("Juan", 20));
        manejoEstudiantes.agregarEstudiante(new Estudiante("Ana", 22));
        manejoEstudiantes.agregarEstudiante(new Estudiante("Luis", 21));

        System.out.println("Estudiantes después de agregar:");
        manejoEstudiantes.imprimirEstudiantes();

        manejoEstudiantes.modificarEstudiante(1, new Estudiante("Maria", 22));

        System.out.println("Estudiantes después de modificar:");
        manejoEstudiantes.imprimirEstudiantes();

        manejoEstudiantes.eliminarEstudiante(0);

        System.out.println("Estudiantes después de eliminar:");
        manejoEstudiantes.imprimirEstudiantes();
    }
}
