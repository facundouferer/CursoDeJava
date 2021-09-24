package parteYpracticaNro10Facultad;

import java.util.LinkedList;

class Materia {
    private String nombre;
    private Profesor titular;
    private LinkedList<Estudiante> coleccionEstudiantes;

    public Materia(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
        this.coleccionEstudiantes = new LinkedList<Estudiante>();
    }

    public void agregarEstudiante (Estudiante estudianteNuevo){
        this.coleccionEstudiantes.add(estudianteNuevo);
    }

    public boolean eliminarEstudiante(int legajo){
        boolean encontro = false;
        for(Estudiante estudiante: coleccionEstudiantes){
            if(estudiante.getLegajo()==legajo){
                coleccionEstudiantes.remove(estudiante);
                encontro = true;
            }
        }
        return encontro;
    }

    @Override
    public String toString() {
        return "Materia: "+ nombre + "\n" +
                "Titular: " + titular + "\n"+
                "Estudiantes: "+ coleccionEstudiantes.size()+" \n" + coleccionEstudiantes;
    }
}


