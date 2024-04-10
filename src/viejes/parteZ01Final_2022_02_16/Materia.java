package viejes.parteZ01Final_2022_02_16;

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

    public void agregarEstudiante(Estudiante estudianteNuevo) {
        this.coleccionEstudiantes.add(estudianteNuevo);
    }

    public void eliminarEstudiante(int legajo) {
        boolean encontro = false;
        for (Estudiante estudiante : coleccionEstudiantes) {
            if (estudiante.getLegajo() == legajo) {
                coleccionEstudiantes.remove(estudiante);
                encontro = true;
                break;
            }
        }
        if (encontro) {
            System.out.println("SE ELIMIN� AL ESTUDIANTE");
        } else {
            System.out.println("EL ESTUDIANTE NO SE ENCUENTRA EN LA MATERIA.");
        }
    }

    @Override
    public String toString() {
        return "DATOS DE LA MATERIA \n" +
                "Materia: " + nombre + "\n" +
                "Titular: " + titular + "\n";
    }

    public void listarEstudiantes() {
        System.out.println("LISTADO DE ESTUDIANTES");
        for (Estudiante estudiante : coleccionEstudiantes) {
            System.out.println(estudiante.toString());
        }
    }
}
