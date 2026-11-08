package CursoJava.l21_acceso_a_bases_de_datos_jdbc.ej04_estudiantes;

/**
 * Lección 21 – Acceso a Bases de Datos con JDBC y SQL Seguro
 * Objetivo: Representar una fila de la tabla estudiantes.
 * Concepto: 3. Recorrer resultados y modificar datos.
 */
public record Estudiante(int id, String nombre, String apellido, String legajo, String dni,
    String fechaNacimiento, String direccion, String telefono, String email) {
}
