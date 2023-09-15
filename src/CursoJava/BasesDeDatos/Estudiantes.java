package CursoJava.BasesDeDatos;
import java.sql.*;

public class Estudiantes {
    public static void main(String[] args) {
        // Datos de conexión a la base de datos (ajusta estos valores según tu configuración)
        String url = "jdbc:mysql://localhost:3306/universidad";
        String usuario = "root";
        String pass = "";

        try {
            // Establecer la conexión a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, pass);

            // Crear una declaración SQL
            Statement statement = conexion.createStatement();

            // Ejecutar una consulta para obtener todos los datos de estudiantes
            String consulta = "SELECT * FROM estudiantes";
            ResultSet resultado = statement.executeQuery(consulta);

            // Iterar a través de los resultados y mostrarlos con tabulaciones
            System.out.println("ID\tNombre\tApellido\tLegajo\tDNI\tFecha de nacimiento\tDirección\tTeléfono\tEmail");
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String legajo = resultado.getString("legajo");
                String dni = resultado.getString("dni");
                String fehcaNacimiento = resultado.getString("fecha_nacimiento");
                String direccion = resultado.getString("direccion");
                String telefono = resultado.getString("telefono");
                String email = resultado.getString("email");

                System.out.println(id + "\t" + nombre + "\t" + apellido + "\t" + legajo + "\t" + dni + "\t" + fehcaNacimiento + "\t" + direccion + "\t" + telefono + "\t" + email);
            }
            // Cerrar la conexión y recursos
            resultado.close();
            statement.close();
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
