package Parciales.ExamenFinal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Clase abstracta de producto
abstract class Producto {
    private String nombre;
    private Integer cantidad;
    private String marca;

    // Constructor
    public Producto(String nombre, Integer cantidad, String marca) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.marca = marca;
    }

    // Getters
    public String getNombre() { return nombre; }
    public Integer getCantidad() { return cantidad; }
    public String getMarca() { return marca; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
    public void setMarca(String marca) { this.marca = marca; }

    // Método abstracto para que lo implementen las subclases
    public abstract String getDetallesEspecificos();
}

// Clase de producto lácteo
class Lacteo extends Producto {
    private String tipoLeche;
    private double porcentajeGrasa;
    private Date fechaVencimiento;

    public Lacteo(
            String nombre,
            Integer cantidad,
            String marca,
            String tipoLeche,
            double porcentajeGrasa,
            Date fechaVencimiento
    ) {
        super(nombre, cantidad, marca);
        this.tipoLeche = tipoLeche;
        this.porcentajeGrasa = porcentajeGrasa;
        this.fechaVencimiento = fechaVencimiento;
    }

    // Getters y Setters específicos
    public String getTipoLeche() { return tipoLeche; }
    public void setTipoLeche(String tipoLeche) { this.tipoLeche = tipoLeche; }
    public double getPorcentajeGrasa() { return porcentajeGrasa; }
    public void setPorcentajeGrasa(double porcentajeGrasa) { this.porcentajeGrasa = porcentajeGrasa; }
    public Date getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(Date fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    @Override
    public String getDetallesEspecificos() {
        return String.format(
                "Tipo de Leche: %s, %% Grasa: %.2f, Vencimiento: %s",
                tipoLeche,
                porcentajeGrasa,
                fechaVencimiento
        );
    }

    @Override
    public String toString() {
        return String.format(
                "Lacteo: %s, Cantidad: %d, Marca: %s, %s",
                getNombre(),
                getCantidad(),
                getMarca(),
                getDetallesEspecificos()
        );
    }
}

// Clase de producto cárnico
class Carnico extends Producto {
    private String tipoCorte;
    private double peso;
    private Date fechaVencimiento;

    public Carnico(
            String nombre,
            Integer cantidad,
            String marca,
            String tipoCorte,
            double peso,
            Date fechaVencimiento
    ) {
        super(nombre, cantidad, marca);
        this.tipoCorte = tipoCorte;
        this.peso = peso;
        this.fechaVencimiento = fechaVencimiento;
    }

    // Getters y Setters específicos
    public String getTipoCorte() { return tipoCorte; }
    public void setTipoCorte(String tipoCorte) { this.tipoCorte = tipoCorte; }
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public Date getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(Date fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    @Override
    public String getDetallesEspecificos() {
        return String.format(
                "Tipo de Corte: %s, Peso: %.2f, Vencimiento: %s",
                tipoCorte,
                peso,
                fechaVencimiento
        );
    }

    @Override
    public String toString() {
        return String.format(
                "Carnico: %s, Cantidad: %d, Marca: %s, %s",
                getNombre(),
                getCantidad(),
                getMarca(),
                getDetallesEspecificos()
        );
    }
}

// Clase Administrador de Heladera
class AdministradorHeladera {
    private List<Producto> productos;

    public AdministradorHeladera() {
        productos = new ArrayList<>();
    }

    // Método para agregar productos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Método para remover algun productos
    public void removerProducto(Producto producto) {
        productos.remove(producto);
    }

    // Método para consumir un producto
    public void consumirProducto(Producto producto, int cantidadConsumida) {
        if (productos.contains(producto)) {
            int cantidadActual = producto.getCantidad();
            if (cantidadConsumida >= cantidadActual) {
                removerProducto(producto);
            } else {
                producto.setCantidad(cantidadActual - cantidadConsumida);
            }
        }
    }

    // Método para modificar un producto
    public void modificarProducto(
            Producto producto,
            String nuevoNombre,
            Integer nuevaCantidad,
            String nuevaMarca
    ) {
        if (productos.contains(producto)) {
            producto.setNombre(nuevoNombre);
            producto.setCantidad(nuevaCantidad);
            producto.setMarca(nuevaMarca);
        }
    }

    // Método para listar productos
    public void listarProductos() {
        System.out.println("Productos en la heladera:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        System.out.println("Total de productos: " + productos.size());
    }

    // Método para obtener la cantidad total de productos
    public int getCantidadTotalProductos() {
        return productos.size();
    }
}

// Clase principal para demostración
public class Heladera {
    public static void main(String[] args) {
        // Ejemplo de uso de la heladera
        AdministradorHeladera miHeladera = new AdministradorHeladera();

        // Crear algunos productos
        Lacteo leche = new Lacteo(
                "Leche Entera",
                2,
                "La Serenísima",
                "Vaca",
                3.5,
                new Date()
        );

        Carnico carne = new Carnico(
                "Asado",
                1,
                "Frigorífico",
                "Tira",
                2.5,
                new Date()
        );

        // Agregar productos a la heladera
        miHeladera.agregarProducto(leche);
        miHeladera.agregarProducto(carne);

        // Listar productos
        miHeladera.listarProductos();

        // Consumir producto
        miHeladera.consumirProducto(leche, 1);

        // Modificar producto
        miHeladera.modificarProducto(
                carne,
                "Asado Premium",
                2,
                "Nuevo Frigorífico"
        );

        // Listar productos actualizados
        miHeladera.listarProductos();
    }
}