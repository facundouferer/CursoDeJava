package CursoJava.BasesDeDatos.Empresa;

import java.sql.*;

public class NuevoEmpleado {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/empresa";
        String user = "root";
        String pass = "753951";

        try {
            Connection conexion = DriverManager.getConnection(url, user, pass);

            // Datos del empleado
            int dni = 35897456;
            String nombre = "Pepe";
            String apellido = "Grillo";
            int area = 2; // ID del área (por ejemplo: 2 = Sistemas)

            // Usar PreparedStatement para evitar SQL Injection
            String consulta = "INSERT INTO personal (dni, nombre, apellido, area) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setInt(1, dni);
            statement.setString(2, nombre);
            statement.setString(3, apellido);
            statement.setInt(4, area);

            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Empleado agregado exitosamente.");
                System.out.println("DNI: " + dni);
                System.out.println("Nombre completo: " + nombre + " " + apellido);
                System.out.println("Área ID: " + area);
            } else {
                System.out.println("No se pudo agregar el empleado.");
            }

            statement.close();
            conexion.close();
        } catch (SQLException e) {
            System.err.println("Error al agregar el empleado:");
            e.printStackTrace();
        }
    }
}