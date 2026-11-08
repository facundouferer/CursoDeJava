/*
 * Integrador – Primer Parcial 2025 (Lección 11 – Clases abstractas, interfaces y modelado)
 * Enunciado: Modelar una universidad con estudiantes y docentes (que dictan materias). Un docente
 *            se registra por consola, una interfaz InformeDeDatos genera informes, se listan los
 *            estudiantes omitiendo posiciones vacías y un menú permite repetir las acciones.
 * Concepto: Herencia, interfaz compartida (InformeDeDatos), constructores sobrecargados y
 *           arreglos de objetos.
 */
package CursoJava.l11_clases_abstractas_interfaces_y_modelado.integrador_p1_universidad;

public class Main {
  public static void main(String[] args) {
    Estudiante estudiante = new Estudiante("María", "Gómez", 87654321, "ISI");
    estudiante.modificarCarrera("TUP");
    Materia[] materias = { new Materia("ISI"), new Materia("TUP") };
    Docente docente = new Docente("Facundo", "Uferer", 12345678, materias);

    System.out.println(estudiante);
    Universidad.mostrarInforme(docente);
  }
}
