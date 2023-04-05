package CursoJava.BasesDeDatos;

import java.sql.*;

public class BaseDeDatos2 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/partidos";
        String user = "root";
        String password = "753951";

        Connection connection = null;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String sql = "delete from equipos where equipo2 = 'River Plate'";
            int rowCount = stmt.executeUpdate(sql);
            System.out.println("Número de filas afectadas: " + rowCount);
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }

    }
}
