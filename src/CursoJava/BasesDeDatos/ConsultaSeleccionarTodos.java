package CursoJava.BasesDeDatos;
import java.sql.*;

public class ConsultaSeleccionarTodos {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/universidad";
        String user = "root";
        String pass = "";

        try {
            Connection conexion = DriverManager.getConnection(url, user, pass);
            Statement statement = conexion.createStatement();
            String consulta = "SELECT * FROM estudiantes";
            ResultSet resultado = statement.executeQuery(consulta);

            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                // ... otros campos
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido);
            }

            resultado.close();
            statement.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
