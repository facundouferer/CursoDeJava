package CursoJava.Arrays;
import java.util.Arrays;

class ManejoEstudiantes {

    private Estudiante[] estudiantes;
    private int contador;

    public ManejoEstudiantes(int tamaño) {
        estudiantes = new Estudiante[tamaño];
        contador = 0;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes[contador] = estudiante;
        contador++;
    }

    public void modificarEstudiante(int index, Estudiante estudiante) {
        if (index >= 0 && index < contador) {
            estudiantes[index] = estudiante;
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public void eliminarEstudiante(int index) {
        if (index >= 0 && index < contador) {
            for (int i = index; i < contador - 1; i++) {
                estudiantes[i] = estudiantes[i + 1];
            }
            contador--;
        } else {
            System.out.println("Índice no válido.");
        }
    }

    public void imprimirEstudiantes() {
        for (int i = 0; i < contador; i++) {
            System.out.println(estudiantes[i]);
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

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        ManejoEstudiantes manejoEstudiantes = new ManejoEstudiantes(10);

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


