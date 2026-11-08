package CursoJava.l21_acceso_a_bases_de_datos_jdbc.ej03_pizzeria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Lección 21 – Acceso a Bases de Datos con JDBC y SQL Seguro
 * Objetivo: Listar y agregar productos de la pizzería; cada operación abre y cierra su propia conexión.
 * Concepto: 6. El patrón DAO.
 */
public class ProductoDAO {

  public List<Producto> listar() throws SQLException {
    List<Producto> productos = new ArrayList<>();
    String sql = "SELECT id, nombre, precio, stock FROM productos";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery()) {
      while (resultado.next()) {
        productos.add(new Producto(
            resultado.getInt("id"),
            resultado.getString("nombre"),
            resultado.getDouble("precio"),
            resultado.getInt("stock")));
      }
    }
    return productos;
  }

  /** Agrega un producto con una consulta parametrizada y devuelve la cantidad de filas afectadas. */
  public int agregar(String nombre, double precio, int stock) throws SQLException {
    String sql = "INSERT INTO productos (nombre, precio, stock) VALUES (?, ?, ?)";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql)) {
      sentencia.setString(1, nombre);
      sentencia.setDouble(2, precio);
      sentencia.setInt(3, stock);
      return sentencia.executeUpdate();
    }
  }
}
