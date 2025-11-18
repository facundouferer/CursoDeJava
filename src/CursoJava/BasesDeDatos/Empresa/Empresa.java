package CursoJava.BasesDeDatos.Empresa;

import java.sql.*;

public class Empresa {
    // clase de inicio
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/empresa";
        String user = "root";
        String password = "753951";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * from empresa.personal p;";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                System.out.println(dni + " " + nombre + " " + apellido);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
