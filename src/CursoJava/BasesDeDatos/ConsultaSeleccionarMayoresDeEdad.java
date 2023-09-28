package CursoJava.BasesDeDatos;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ConsultaSeleccionarMayoresDeEdad {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/universidad";
        String user = "root";
        String pass = "";
        int edadMinima = 18; // Cambia la edad mínima según tus necesidades

        try {
            Connection conexion = DriverManager.getConnection(url, user, pass);
            Statement statement = conexion.createStatement();

            // Calcular la fecha de nacimiento mínima para la edad especificada
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.YEAR, -edadMinima);
            Date fechaNacimientoMinima = calendar.getTime();
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fechaNacimientoMinimaStr = formatoFecha.format(fechaNacimientoMinima);

            String consulta = "SELECT * FROM estudiantes WHERE fecha_nacimiento <= '" + fechaNacimientoMinimaStr + "'";
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
