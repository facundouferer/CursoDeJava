package CursoJava.BasesDeDatos;

import java.sql.*;

public class ConsultaAgregarEstudiante {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/universidad";
        String user = "root";
        String pass = "";

        try {
            Connection conexion = DriverManager.getConnection(url, user, pass);
            String nombre = "Juan";
            String apellido = "Perez";
            String legajo = "123456";
            String dni = "35147987";
            String fechaNacimiento = "2001-12-20"; // Cambia la fecha
            String direccion = "Av. Siempre Viva 123";
            String telefono = "352445987416";
            String email = "juanperez@gmail.com";

            String consulta = "INSERT INTO estudiantes (nombre, apellido, legajo, dni, fecha_nacimiento, direccion, telefono, email) " +
                    "VALUES ('" + nombre + "', '" + apellido + "', '" + legajo + "', '" + dni + "', '" + fechaNacimiento + "', '" + direccion + "', '" + telefono + "', '" + email + "')";
            Statement statement = conexion.createStatement();
            int filasAfectadas = statement.executeUpdate(consulta);

            if (filasAfectadas > 0) {
                System.out.println("Estudiante agregado exitosamente.");
            } else {
                System.out.println("No se pudo agregar el estudiante.");
            }

            statement.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
