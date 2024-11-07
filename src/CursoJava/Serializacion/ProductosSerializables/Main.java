package CursoJava.Serializacion.ProductosSerializables;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de productos
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop", 750.99, 10));
        productos.add(new Producto("Smartphone", 450.50, 25));
        productos.add(new Producto("Auriculares", 29.99, 100));

        // Nombre del archivo para guardar los productos
        String filename = "productos.ser";

        // Guardar la lista de productos en el archivo
        Inventario.guardarProductos(productos, filename);

        // Cargar la lista de productos desde el archivo
        List<Producto> productosCargados = Inventario.cargarProductos(filename);

        // Imprimir la lista de productos cargados
        System.out.println("Productos cargados desde el archivo:");
        for (Producto producto : productosCargados) {
            System.out.println(producto);
        }
    }
}
