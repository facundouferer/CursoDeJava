package CursoJava.l09_arrays_de_objetos.ej02_universidad;

/*
 * Lección 09 – Arrays de objetos
 * Objetivo: armar un curso universitario con su materia, su profesor y un array de estudiantes.
 * Concepto: 9. Un array de objetos como atributo: composición y copia defensiva.
 */
public class Main {

    public static void main(String[] args) {
        Materia materia = new Materia("Matemática", 1);
        Profesor profesor = new Profesor("Pedro", "Gómez", "87654321", materia, 2015);

        Estudiante[] estudiantes = new Estudiante[3];
        estudiantes[0] = new Estudiante("Juan", "Pérez", "12345678", "Ingeniería", 2019);
        estudiantes[1] = new Estudiante("Pedro", "Gómez", "87654321", "Ingeniería", 2019);
        estudiantes[2] = new Estudiante("María", "González", "45678912", "Ingeniería", 2019);

        Curso curso = new Curso();
        curso.setMateria(materia);
        curso.setProfesor(profesor);
        curso.setEstudiantes(estudiantes);

        curso.mostrar();
    }
}
