package CursoJava.ArreglosDeObjetos;

import java.util.Scanner;

abstract class Persona {

    protected int dni;
    protected String nombre;
    // Cuenta corriente vista desde la empresa: positivo = la persona debe, negativo = se le debe
    protected double saldo;

    protected Persona(int dni, String nombre, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public abstract double transaccion(double monto);

}

class Vendedor extends Persona {

    public Vendedor(int dni, String nombre, double saldo) { super(dni, nombre, saldo); }

    @Override
    public double transaccion(double monto) {
        this.saldo += monto * 0.10;             // cobra comisión: hace algo propio
        return this.saldo;
    }
}

class Cliente extends Persona {

    public Cliente(int dni, String nombre, double saldo) { super(dni, nombre, saldo); }

    @Override
    public double transaccion(double monto) {
        this.saldo += monto;                    // asigna, no solo calcula
        return this.saldo;
    }

}

class Proveedor extends Persona {

    public Proveedor(int dni, String nombre, double saldo) { super(dni, nombre, saldo); }

    @Override
    public double transaccion(double monto) {
        this.saldo -= monto;
        return this.saldo;
    }
}




class GestorDeProductos {

    public static void main(String[] args) {

        ManejoDeStock stock = new ManejoDeStock();

        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            
            TuiManager.menu();

            System.out.print("Elegí una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    TuiManager.agregarProducto(stock, sc);
                    break;
                case 2:
                    TuiManager.eliminarProducto(stock, sc);
                    break;
                case 3:
                    TuiManager.venderProducto(stock, sc);
                    break;
                case 4:
                    TuiManager.listarProductos(stock);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida, probá de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }
}

abstract class TuiManager {

    public static void menu() {
        System.out.println("-----MENU PRINCIPAL------");
        System.out.println("1- Agregar productos ");
        System.out.println("2- Eliminar productos ");
        System.out.println("3- Vender productos ");
        System.out.println("4- Listar productos ");
        System.out.println("0- Salir");
    }

    public static void agregarProducto(ManejoDeStock stock, Scanner scanner) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese el stock inicial: ");
        int stockInicial = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        Producto nuevoProducto = new Producto(nombre, precio, stockInicial);
        stock.agregarProducto(nuevoProducto);
        System.out.println("¡Producto agregado con éxito");
    }

    public static void eliminarProducto(ManejoDeStock stock, Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();
        stock.eliminarProducto(nombre);
        System.out.println("¡Producto eliminado con éxito!");
    }

    public static void venderProducto(ManejoDeStock stock, Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a vender: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la cantidad a vender: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada

        stock.venderProducto(nombre, cantidad);
    }

    public static void listarProductos(ManejoDeStock stock) {
        System.out.println("Listado de productos:");
        System.out.println(stock.listarProducto());
    }

}

class ManejoDeStock {

    private Producto[] productos;

    // constructor
    public ManejoDeStock() {
        this.productos = new Producto[0];
    }

    public void agregarProducto(Producto productoNuevo) {
        Producto[] nuevosProductos = new Producto[productos.length + 1];
        nuevosProductos[nuevosProductos.length - 1] = productoNuevo;
        for (int i = 0; i < productos.length; i++) {
            nuevosProductos[i] = productos[i];
        }
        this.productos = nuevosProductos;
    }

    public void eliminarProducto(int indice) {
        Producto[] nuevosProductos = new Producto[productos.length - 1];
        for (int i = 0, j = 0; i < productos.length; i++) {
            if (i != indice) {
                nuevosProductos[j++] = productos[i];
            }
        }
        this.productos = nuevosProductos;
    }

    public void venderProducto(String nombre, int cantidad) {
        int indice = this.verID(nombre);
        if (indice != -1) {
            if (productos[indice].getStock() >= cantidad) {
                productos[indice].setStock(cantidad);
            } else {
                System.out.println("No hay suficiente stock para vender " + cantidad + " unidades de " + nombre);
            }
        } else {
            System.out.println("El producto " + nombre + " no se encuentra en el stock.");
        }
    }

    public int verID(String nombre) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public void eliminarProducto(String nombre) {
        int indice = this.verID(nombre);
        this.eliminarProducto(indice);
    }

    @Override
    public String toString() {
        String salida = "";
        for (Producto producto : productos) {
            if (producto != null) {
                salida += producto + "\n";
            }
        }
        return salida;
    }

    public String listarProducto() {
        String listadoDeProductos = this.toString();
        return listadoDeProductos;
    }

}

class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setStock(int cantidad) {
        this.stock -= cantidad;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return stock + " " + nombre + " $" + precio;
    }
}