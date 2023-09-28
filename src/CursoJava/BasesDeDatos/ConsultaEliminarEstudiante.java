package CursoJava.BasesDeDatos;

import java.sql.*;

public class ConsultaEliminarEstudiante {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/universidad";
        String user = "root";
        String pass = "";

        try {
            Connection conexion = DriverManager.getConnection(url, user, pass);
            int idEstudiante = 15; // Cambia el ID del estudiante que deseas eliminar

            String consulta = "DELETE FROM estudiantes WHERE id = " + idEstudiante;
            Statement statement = conexion.createStatement();
            int filasAfectadas = statement.executeUpdate(consulta);

            if (filasAfectadas > 0) {
                System.out.println("Estudiante eliminado exitosamente.");
            } else {
                System.out.println("No se pudo eliminar el estudiante.");
            }

            statement.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
