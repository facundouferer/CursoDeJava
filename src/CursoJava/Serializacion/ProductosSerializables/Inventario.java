package CursoJava.Serializacion.ProductosSerializables;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Inventario {

    // Método para serializar y guardar la lista de productos
    public static void guardarProductos(List<Producto> productos, String filename) {
        try (FileOutputStream fileOut = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(productos);
            System.out.println("Lista de productos guardada en " + filename);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    // Método para deserializar y cargar la lista de productos desde un archivo
    @SuppressWarnings("unchecked")
    public static List<Producto> cargarProductos(String filename) {
        List<Producto> productos = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            productos = (List<Producto>) in.readObject();
            System.out.println("Lista de productos cargada desde " + filename);
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
        return productos;
    }
}
