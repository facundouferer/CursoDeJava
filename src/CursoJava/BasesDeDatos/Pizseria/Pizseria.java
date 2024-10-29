package CursoJava.BasesDeDatos.Pizseria;

import java.sql.*;

public class Pizseria {
    public static void main(String[] args) {
        DatosDB db = new DatosDB();
        db.agregarProducto("Tropical", 2500.0, 200);
        db.mostrarProductos();
        db.cerrarConexion();
    }
}
