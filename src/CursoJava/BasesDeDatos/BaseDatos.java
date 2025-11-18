package CursoJava.BasesDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatos {

  String url, user, password;
  Connection connection;

  public BaseDatos(String url, String user, String password) {
    this.url = url;
    this.user = user;
    this.password = password;
  }

  ResultSet ejecutarConsultas(String sql, ResultSet rs) {
    try {
      Connection conn = DriverManager.getConnection(url, user, password);
      Statement stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);
      conn.close();
      stmt.close();
    } catch (SQLException e) {
      System.out.println("Error al conectar a la base de datos: " + e.getMessage());
    }
    return rs;
  }

  public void traerRopas() {
    ResultSet resultado = ejecutarConsultas("select * from ropas where talle = 'XXL';", null);
    try {
      while (resultado.next()) {
        String nombre = resultado.getString("nombre");
        System.out.println(nombre);
      }
    } catch (SQLException e) {
      System.out.println("Error al conectar a la base de datos: " + e.getMessage());
    }
  }

}
