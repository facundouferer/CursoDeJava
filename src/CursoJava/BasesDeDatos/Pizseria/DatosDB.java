package CursoJava.BasesDeDatos.Pizseria;

import java.sql.*;

public class DatosDB {
    private String url = "jdbc:mysql://localhost:3306/pizatot";
    private String user = "root";
    private String password = "qsczse753951";
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    String sql = "";

    public DatosDB(){
        try {
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public void cerrarConexion(){
        try {
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    public void mostrarProductos(){
        try {
            sql = "SELECT * FROM productos p;";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                Double precio = rs.getDouble("precio");
                int stock = rs.getInt("stock");
                System.out.println( id + "\t" + nombre + "\t" + precio + "\t" + stock);
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public void agregarProducto(String nombre, Double precio, int stock){
        try {
            sql = "INSERT INTO productos (nombre, precio, stock) VALUES ('" + nombre + "', " + precio + ", " + stock + ");";
            int rowCount = stmt.executeUpdate(sql);
            System.out.println("Número de filas afectadas: " + rowCount);
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

}
