package CursoJava.BasesDeDatos;

import java.sql.*;

public class ConsultaAgregarEstudiante {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
        String user = "root";
        String pass = "";

        try {
            Connection conexion = DriverManager.getConnection(url, user, pass);
            String nombre = "NuevoNombre";
            String apellido = "NuevoApellido";
            String legajo = "NuevoLegajo";
            String dni = "NuevoDNI";
            String fechaNacimiento = "YYYY-MM-DD"; // Cambia la fecha
            String direccion = "NuevaDireccion";
            String telefono = "NuevoTelefono";
            String email = "NuevoEmail";

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
