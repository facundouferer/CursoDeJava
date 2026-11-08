package CursoJava.l09_arrays_de_objetos.integrador_proy_stock;

import java.util.Scanner;

/**
 * Integrador – Proyecto: Manejo de stock (Lección 09 – Arrays de objetos)
 * Enunciado: Aplicación de consola para administrar el stock de una empresa: agregar, eliminar,
 * vender y listar productos guardados en un array de objetos. Incluye el modelo de personas
 * (cliente, proveedor y vendedor) que operan con la empresa.
 * Concepto: 4. Recorrer y mostrar, 5. Buscar dentro de un array de objetos, 8. Capacidad contra cantidad.
 */
public class Main {

  public static void main(String[] args) {
    ManejoDeStock stock = new ManejoDeStock();
    Scanner scanner = new Scanner(System.in);
    int opcion;
    do {
      TuiManager.menu();
      opcion = TuiManager.leerEntero(scanner, "Elija una opción: ");
      switch (opcion) {
        case 1 -> TuiManager.agregarProducto(stock, scanner);
        case 2 -> TuiManager.eliminarProducto(stock, scanner);
        case 3 -> TuiManager.venderProducto(stock, scanner);
        case 4 -> TuiManager.listarProductos(stock);
        case 0 -> System.out.println("Saliendo del programa...");
        default -> System.out.println("Opción inválida, intente de nuevo.");
      }
    } while (opcion != 0);
    scanner.close();
  }
}
