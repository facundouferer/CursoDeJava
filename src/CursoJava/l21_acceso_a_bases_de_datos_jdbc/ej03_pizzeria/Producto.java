package CursoJava.l21_acceso_a_bases_de_datos_jdbc.ej03_pizzeria;

/**
 * Lección 21 – Acceso a Bases de Datos con JDBC y SQL Seguro
 * Objetivo: Representar un producto del menú de la pizzería.
 * Concepto: 3. Recorrer resultados y modificar datos.
 */
public record Producto(int id, String nombre, double precio, int stock) {
}
