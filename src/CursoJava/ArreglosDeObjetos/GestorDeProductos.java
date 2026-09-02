package CursoJava.ArreglosDeObjetos;

import java.util.Scanner;

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
        System.out.print("Ingrese el nombre del roducto a eliminar: ");
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
        System.out.println();
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
        return this.listarProducto();
    }

    public String listarProducto() {

        if (productos.length == 0) {
            return "No hay productos cargados en el stock.";
        }

        String formatoFila = "%-25s %12s %10s %15s%n";
        String separador = "-".repeat(66);

        StringBuilder tabla = new StringBuilder();
        tabla.append(separador).append("\n");
        tabla.append(String.format(formatoFila, "PRODUCTO", "PRECIO", "STOCK", "VALOR TOTAL"));
        tabla.append(separador).append("\n");

        double valorTotalStock = 0;

        for (Producto producto : productos) {
            if (producto != null) {
                double subtotal = producto.getPrecio() * producto.getStock();
                valorTotalStock += subtotal;

                tabla.append(String.format(formatoFila,
                        producto.getNombre(),
                        String.format("$%.2f", producto.getPrecio()),
                        producto.getStock(),
                        String.format("$%.2f", subtotal)));
            }
        }

        tabla.append(separador).append("\n");
        tabla.append(String.format("%-25s %48s%n", "VALOR TOTAL DEL STOCK:", String.format("$%.2f", valorTotalStock)));

        return tabla.toString();
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

    public double getPrecio() {
        return precio;
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