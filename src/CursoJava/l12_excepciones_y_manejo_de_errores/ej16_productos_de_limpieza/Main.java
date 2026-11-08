package CursoJava.l12_excepciones_y_manejo_de_errores.ej16_productos_de_limpieza;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: cargar un producto por teclado, repitiendo la carga hasta que los datos sean válidos.
 * Concepto: §2 try, catch, finally y reintento con descarte del buffer.
 */
public class Main {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    ArrayList<Producto> productos = new ArrayList<>();
    AdminDeProductos admin = new AdminDeProductos(leer);
    boolean error;

    do {
      try {
        admin.nuevoProducto(productos);
        error = false;
      } catch (InputMismatchException e) {
        System.out.println("Error: el código debe ser un entero y el precio un número.");
        leer.nextLine(); // descarta el texto inválido que quedó en el buffer
        error = true;
      } finally {
        System.out.println("---------------------");
      }
    } while (error);

    admin.listarProductos(productos);
    leer.close();
  }
}
