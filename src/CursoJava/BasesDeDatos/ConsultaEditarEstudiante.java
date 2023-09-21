package CursoJava.BasesDeDatos;

import java.sql.*;

public class ConsultaEditarEstudiante {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mi_base_de_datos";
        String user = "root";
        String pass = "";


        try {
            Connection conexion = DriverManager.getConnection(url, user, pass);
            int idEstudiante = 1; // Cambia el ID del estudiante que deseas editar
            String nuevoNombre = "NuevoNombre";
            String nuevoApellido = "NuevoApellido";
            String nuevoLegajo = "NuevoLegajo";
            String nuevoDNI = "NuevoDNI";
            String nuevaFechaNacimiento = "YYYY-MM-DD"; // Cambia la fecha
            String nuevaDireccion = "NuevaDireccion";
            String nuevoTelefono = "NuevoTelefono";
            String nuevoEmail = "NuevoEmail";

            String consulta = "UPDATE estudiantes SET nombre = '" + nuevoNombre + "', apellido = '" + nuevoApellido + "', legajo = '" + nuevoLegajo +
                    "', dni = '" + nuevoDNI + "', fecha_nacimiento = '" + nuevaFechaNacimiento + "', direccion = '" + nuevaDireccion +
                    "', telefono = '" + nuevoTelefono + "', email = '" + nuevoEmail + "' WHERE id = " + idEstudiante;
            Statement statement = conexion.createStatement();
            int filasAfectadas = statement.executeUpdate(consulta);

            if (filasAfectadas > 0) {
                System.out.println("Estudiante editado exitosamente.");
            } else {
                System.out.println("No se pudo editar el estudiante.");
            }

            statement.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
