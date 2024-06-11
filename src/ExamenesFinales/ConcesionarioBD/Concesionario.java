package ExamenesFinales.ConcesionarioBD;

import java.sql.*;
import java.util.ArrayList;

class DBHelper {
    private static final String URL = "jdbc:mysql://localhost:3306/concesionario";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void ejecutarConsulta(String consulta) {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            try (PreparedStatement statement = connection.prepareStatement(consulta)) {
                statement.executeUpdate();
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ResultSet ejecutarConsultaConResultado(String consulta) {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement statement = connection.prepareStatement(consulta);
            return statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

class Auto {
    private int autoId;
    private String marca;
    private String modelo;
    private int anio;

    public Auto(int autoId, String marca, String modelo, int anio) {
        this.autoId = autoId;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "autoId=" + autoId +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }
}

class Persona {
    private int personaId;
    private String nombre;
    private String apellido;
    private String dni;
    private Date fechaNacimiento;
    private Date fechaContratacion;

    public Persona(int personaId, String nombre, String apellido, String dni, Date fechaNacimiento,
            Date fechaContratacion) {
        this.personaId = personaId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
    }

    public Persona(String consultaBusqueda) {
        try (ResultSet resultado = DBHelper.ejecutarConsultaConResultado(consultaBusqueda)) {
            if (resultado != null && resultado.next()) {
                this.personaId = resultado.getInt("persona_id");
                this.nombre = resultado.getString("nombre");
                this.apellido = resultado.getString("apellido");
                this.dni = resultado.getString("dni");
                this.fechaNacimiento = resultado.getDate("fecha_nacimiento");
                this.fechaContratacion = resultado.getDate("fecha_contratacion");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "personaId=" + personaId +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaContratacion=" + fechaContratacion +
                '}';
    }
}

class VentaAuto {
    private int ventaId;
    private int personaId;
    private int autoId;
    private int cantidadVendida;
    private Date fechaVenta;

    public VentaAuto(int ventaId, int personaId, int autoId, int cantidadVendida, Date fechaVenta) {
        this.ventaId = ventaId;
        this.personaId = personaId;
        this.autoId = autoId;
        this.cantidadVendida = cantidadVendida;
        this.fechaVenta = fechaVenta;
    }
}

class VentasAutos {

    public static ArrayList<Persona> listadoDeVendedores() {
        ArrayList<Persona> vendedores = new ArrayList<>();
        String consulta = "SELECT * FROM personas";

        try (ResultSet resultado = DBHelper.ejecutarConsultaConResultado(consulta)) {
            while (resultado != null && resultado.next()) {
                int personaId = resultado.getInt("persona_id");
                String nombre = resultado.getString("nombre");
                String apellido = resultado.getString("apellido");
                String dni = resultado.getString("dni");
                Date fechaNacimiento = resultado.getDate("fecha_nacimiento");
                Date fechaContratacion = resultado.getDate("fecha_contratacion");

                Persona vendedor = new Persona(personaId, nombre, apellido, dni, fechaNacimiento, fechaContratacion);
                vendedores.add(vendedor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vendedores;
    }

    public static void generarInforme() {
        String consulta = "SELECT * FROM autos";

        try (ResultSet resultado = DBHelper.ejecutarConsultaConResultado(consulta)) {
            if (resultado != null) {
                System.out.println("Informe de Autos:");
                System.out.printf("%-10s%-20s%-20s%-5s\n", "AutoID", "Marca", "Modelo", "A�o");
                System.out.println("---------------------------------------------");
                while (resultado.next()) {
                    int autoId = resultado.getInt("auto_id");
                    String marca = resultado.getString("marca");
                    String modelo = resultado.getString("modelo");
                    int anio = resultado.getInt("anio");

                    System.out.printf("%-10d%-20s%-20s%-5d\n", autoId, marca, modelo, anio);
                }
                System.out.println("---------------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Auto obtenerAuto(int autoId) {
        String consultaAuto = "SELECT * FROM autos WHERE auto_id = " + autoId;

        try (ResultSet resultado = DBHelper.ejecutarConsultaConResultado(consultaAuto)) {
            if (resultado != null && resultado.next()) {
                int id = resultado.getInt("auto_id");
                String marca = resultado.getString("marca");
                String modelo = resultado.getString("modelo");
                int anio = resultado.getInt("anio");

                return new Auto(id, marca, modelo, anio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Auto obtenerAutoMasVendido() {
        String consultaVentas = "SELECT auto_id, SUM(cantidad_vendida) as total_vendido \n" +
                "FROM ventas_autos\n" +
                "GROUP BY auto_id\n" +
                "ORDER BY total_vendido DESC\n" +
                "LIMIT 1";

        try (ResultSet resultadoVentas = DBHelper.ejecutarConsultaConResultado(consultaVentas)) {
            if (resultadoVentas != null && resultadoVentas.next()) {
                int autoId = resultadoVentas.getInt("auto_id");
                return obtenerAuto(autoId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}

class Concesionario {
    public static void main(String[] args) {

        System.out.println("\n2. Creaci�n de las Clases Auto y Persona");
        Auto auto1 = new Auto(1, "Toyota", "Corolla", 2022);
        System.out.println(auto1);
        Persona persona1 = new Persona(1, "Juan", "Perez", "12345678", Date.valueOf("1990-01-15"),
                Date.valueOf("2021-03-01"));
        System.out.println(persona1);

        System.out.println("\n3. Creaci�n de un Constructor Adicional en la clase Persona");
        Persona persona2 = new Persona("SELECT * FROM personas WHERE persona_id = 2");
        System.out.println(persona2);

        System.out.println("\n4. Obtener una persona por ID:");
        Persona personaObjeto = new Persona(2, "Maria", "Gomez", "87654321", Date.valueOf("1985-05-22"),
                Date.valueOf("2022-01-10"));
        System.out.println(personaObjeto);

        System.out.println("\n5. Generar Informe de Autos:");
        VentasAutos.generarInforme();

        System.out.println("\n6. Obtener un auto por ID:");
        Auto auto = VentasAutos.obtenerAuto(1);
        System.out.println(auto);

        System.out.println("\n7. Obtener el auto m�s vendido:");
        Auto autoObjeto = VentasAutos.obtenerAutoMasVendido();
        System.out.println(autoObjeto);

        System.out.println("\n8. Creaci�n de la clase VentaAuto:");
        VentaAuto ventaAuto = new VentaAuto(1, 1, 1, 1, Date.valueOf("2021-10-01"));
        System.out.println(ventaAuto);

        System.out.println("\n9. Obtener Array de Personas:");
        ArrayList<Persona> personas = VentasAutos.listadoDeVendedores();
        for (Persona persona : personas) {
            System.out.println(persona);
        }

    }
}
