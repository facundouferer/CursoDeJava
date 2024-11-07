package CursoJava.BasesDeDatos;

import java.sql.*;

public class BaseDeDatos {
    // clase de inicio
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/empresa";
        String user = "root";
        String password = "qsczse753951";
        Connection connection = null;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String sql = "select * from equipos where gol1 ;";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String equipo1 = rs.getString("equipo1");
                String equipo2 = rs.getString("equipo2");
                int gol1 = rs.getInt("gol1");
                int gol2 = rs.getInt("gol2");
                System.out.println( equipo1 + ": " + gol1 + " - " + equipo2 + ": " + gol2);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
