/*
 * Lección 11 – Clases abstractas, interfaces y modelado
 * Objetivo: Emitir informes de docentes, jefes y aulas de una universidad.
 * Concepto: Interfaz Informe compartida por jerarquías distintas, y relaciones de
 *           asociación (Jefe-Empleado) y agregación (Aula-Docente/Estudiante).
 */
package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej10_universidad;

public class Main {
  public static void main(String[] args) {
    Docente docente = new Docente("Juan", "Perez", 12345678, 50000, "Matematicas");
    System.out.println(docente.generarInforme("Informe del Docente"));

    Jefe jefe = new Jefe("Marta", "Diaz", 20345678, 80000, "Sistemas");
    jefe.agregarEmpleado(docente);
    jefe.agregarEmpleado(new NoDocente("Pablo", "Ruiz", 30111222, 40000, "Biblioteca"));
    System.out.println(jefe.generarInforme("\nInforme del Jefe"));

    Estudiante[] estudiantes = {
        new Estudiante("Ana", "Gomez", 40111222, "ISI"),
        new Estudiante("Luis", "Lopez", 41222333, "TUP")
    };
    Informe aula = new Aula(docente, estudiantes);
    System.out.println("\n" + aula.generarInforme("Informe del Aula"));
  }
}
