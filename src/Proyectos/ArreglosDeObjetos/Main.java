package Proyectos.ArreglosDeObjetos;

import java.util.Scanner;

class Main {

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
