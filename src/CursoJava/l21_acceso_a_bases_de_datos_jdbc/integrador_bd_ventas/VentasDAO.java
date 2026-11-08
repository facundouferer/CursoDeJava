package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_ventas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/** Consultas del sistema de ventas: productos y vendedores. */
public class VentasDAO {

  public Vendedor obtenerVendedor(int vendedorId) throws SQLException {
    String sql = "SELECT * FROM vendedores WHERE vendedor_id = ?";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql)) {
      sentencia.setInt(1, vendedorId);
      try (ResultSet resultado = sentencia.executeQuery()) {
        return resultado.next() ? mapearVendedor(resultado) : null;
      }
    }
  }

  public List<Vendedor> listarVendedores() throws SQLException {
    List<Vendedor> vendedores = new ArrayList<>();
    String sql = "SELECT * FROM vendedores";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery()) {
      while (resultado.next()) {
        vendedores.add(mapearVendedor(resultado));
      }
    }
    return vendedores;
  }

  public Producto obtenerProducto(int productoId) throws SQLException {
    String sql = "SELECT * FROM productos WHERE producto_id = ?";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql)) {
      sentencia.setInt(1, productoId);
      try (ResultSet resultado = sentencia.executeQuery()) {
        return resultado.next() ? mapearProducto(resultado) : null;
      }
    }
  }

  public void generarInforme() throws SQLException {
    String sql = "SELECT * FROM productos";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery()) {
      System.out.println("Informe de productos en stock:");
      System.out.printf("%-30s%-8s%-10s%-15s%n", "Producto", "Stock", "Precio", "Total");
      System.out.println("----------------------------------------------------------");
      double valorTotalDeProductos = 0;
      while (resultado.next()) {
        String nombre = resultado.getString("nombre");
        int stock = resultado.getInt("stock");
        double precio = resultado.getDouble("precio_por_unidad");
        double valorTotal = stock * precio;
        valorTotalDeProductos += valorTotal;
        System.out.printf("%-30s%-8d%-10.2f%-15.2f%n", nombre, stock, precio, valorTotal);
      }
      System.out.println("----------------------------------------------------------");
      System.out.printf("%-30s%-8s%-10s%-5.2f%n", "", "", "Total:", valorTotalDeProductos);
    }
  }

  /** Devuelve el producto con más unidades vendidas, o null si no hay ventas. */
  public Producto obtenerProductoMasVendido() throws SQLException {
    String sql = "SELECT producto_id, SUM(cantidad_vendida) AS total_vendido FROM ventas "
        + "GROUP BY producto_id ORDER BY total_vendido DESC LIMIT 1";
    try (Connection conexion = Conexion.abrir();
        PreparedStatement sentencia = conexion.prepareStatement(sql);
        ResultSet resultado = sentencia.executeQuery()) {
      return resultado.next() ? obtenerProducto(resultado.getInt("producto_id")) : null;
    }
  }

  private Vendedor mapearVendedor(ResultSet resultado) throws SQLException {
    return new Vendedor(resultado.getInt("vendedor_id"), resultado.getString("nombre"),
        resultado.getString("apellido"), resultado.getString("dni"),
        resultado.getDate("fecha_nacimiento"), resultado.getDate("fecha_contratacion"));
  }

  private Producto mapearProducto(ResultSet resultado) throws SQLException {
    return new Producto(resultado.getInt("producto_id"), resultado.getString("nombre"),
        resultado.getDouble("precio_por_unidad"), resultado.getInt("stock"));
  }
}
