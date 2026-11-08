package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej05_personas_y_materias;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: mostrar los datos de un estudiante y de un docente aprovechando la sobrescritura de toString.
 * Concepto: 3. Sobrescritura y 4. Sobrecarga.
 */
public class Main {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("María", "Gómez", 87654321, "ISI");
        estudiante.modificarCarrera("TUP");

        Materia[] materias = { new Materia("ISI"), new Materia("TUP") };
        Docente docente = new Docente("Facundo", "Uferer", 12345678, materias);

        System.out.println(estudiante);
        System.out.println(docente);
        System.out.println(docente.informe());
        docente.mostrarMaterias();
    }
}
