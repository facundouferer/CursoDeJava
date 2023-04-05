package CursoJava.BasesDeDatos;
import java.sql.*;


public class BaseDeDatos {
    //clase de inicio
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/estudiantes";
        String user = "root";
        String password = "753951";

        Connection connection = null;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String sql = "SELECT id, nombre, apellido FROM personas";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                System.out.println(id + " " + nombre + " " + apellido);
            }
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }

    }
}
