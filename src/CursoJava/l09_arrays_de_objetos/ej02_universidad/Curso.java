package CursoJava.l09_arrays_de_objetos.ej02_universidad;

import java.util.Arrays;

/*
 * Lección 09 – Arrays de objetos
 * Objetivo: componer un curso con un array de estudiantes protegido con copias defensivas.
 * Concepto: 9. Un array de objetos como atributo: composición y copia defensiva.
 */
class Curso {

    private Materia materia;
    private Profesor profesor;
    private Estudiante[] estudiantes = new Estudiante[0];

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
        return Arrays.copyOf(estudiantes, estudiantes.length);
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = Arrays.copyOf(estudiantes, estudiantes.length);
    }

    public void mostrar() {
        System.out.println("Materia: " + materia);
        System.out.println("Profesor: " + profesor);
        System.out.println("Estudiantes inscriptos (" + estudiantes.length + "):");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("- " + estudiante);
        }
    }
}
