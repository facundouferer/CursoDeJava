package CursoJava.Serializacion;


import java.io.*;
import java.util.LinkedList;

public class Universidad {
    public static void main (String[] args){

        Curso curso = new Curso("Programacion 1");
        curso.agregarEstudiante(new Estudiante("Juan", 123));
        curso.agregarEstudiante(new Estudiante("Pedro", 456));
        curso.agregarEstudiante(new Estudiante("Maria", 789));
        curso.agregarEstudiante(new Estudiante("Jose", 101112));

        Serializador serializador = new Serializador();
        serializador.serializar(curso);

        Curso cursoDeserializado = serializador.deserializar();
        System.out.println(cursoDeserializado.estudiantes);
    }
}

class Serializador{
    public void serializar(Curso curso) {
        try {
            // Crear un flujo de salida para escribir en un archivo llamado "curso.txt"
            FileOutputStream archivoSalida = new FileOutputStream("curso.txt");
            // Crear un flujo de objeto para escribir objetos en el flujo de salida
            ObjectOutputStream flujoSalida = new ObjectOutputStream(archivoSalida);
            // Escribir el objeto "curso" en el flujo de salida
            flujoSalida.writeObject(curso);
            // Importante: cerrar el flujo de salida para liberar recursos
            flujoSalida.close();
        } catch (Exception e) {
            e.printStackTrace(); // En caso de error, imprimir información de la excepción
        }
    }

    public Curso deserializar() {
        Curso curso = null;
        try {
            // Abrir un flujo de entrada para leer desde el archivo "curso.txt"
            FileInputStream archivoEntrada = new FileInputStream("curso.txt");
            // Crear un flujo de objeto para leer objetos desde el flujo de entrada
            ObjectInputStream flujoEntrada = new ObjectInputStream(archivoEntrada);
            // Leer el objeto serializado desde el flujo de entrada y convertirlo a un objeto Curso
            curso = (Curso) flujoEntrada.readObject();
            // Importante: cerrar el flujo de entrada para liberar recursos
            flujoEntrada.close();
        } catch (Exception e) {
            e.printStackTrace(); // En caso de error, imprimir información de la excepción
        }
        return curso; // Devolver el objeto Curso deserializado
    }

}

class Curso implements Serializable {
    transient LinkedList<Estudiante> estudiantes; // Marcar como transient
    String nombre;

    public Curso(String nombre){
        this.nombre = nombre;
        estudiantes = new LinkedList<>();
    }

    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public void eliminarEstudianteLegajo(int nroLegajo) {
        for (int i = 0; i < estudiantes.size(); i++) {
            // Recorre la lista de estudiantes y verifica si el número de legajo coincide con nroLegajo
            if (estudiantes.get(i).legajo == nroLegajo) {
                estudiantes.remove(i); // Si hay coincidencia, elimina al estudiante en esa posición
            }
        }
    }


    public void modificarEstudiante(String nombre, int nroLegajo) {
        for (int i = 0; i < estudiantes.size(); i++) {
            // Recorre la lista de estudiantes y verifica si el número de legajo coincide con nroLegajo
            if (estudiantes.get(i).legajo == nroLegajo) {
                estudiantes.get(i).nombre = nombre; // Si hay coincidencia, modifica el nombre del estudiante en esa posición
            }
        }
    }

    // Agregar métodos para serializar y deserializar estudiantes
    private void writeObject(ObjectOutputStream out) throws IOException {
        /**Se utiliza `throws IOException` para manejar posibles errores
         * con la entrada/salida de datos durante la serialización de la clase `Curso`.
         */
        out.defaultWriteObject(); // Llama al método predeterminado de serialización de la superclase
        out.writeObject(estudiantes); // Escribe la lista de estudiantes en el flujo de salida
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject(); // Llama al método predeterminado de deserialización de la superclase
        estudiantes = (LinkedList<Estudiante>) in.readObject(); // Lee la lista de estudiantes desde el flujo de entrada
    }

}

class Estudiante implements Serializable {
    String nombre;
    int legajo;

    public Estudiante(String nombre, int legajo){
        this.nombre = nombre;
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}
