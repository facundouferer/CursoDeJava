package CursoJava.BasesDeDatos.Tienda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import CursoJava.BasesDeDatos.BaseDatos;

public class TiendaAdmin {

  public static void main(String[] args) {

    BaseDatos db = new BaseDatos("jdbc:mysql://localhost:3306/tienda", "root", "qsczse753951");

    db.traerRopas();
  }

}
