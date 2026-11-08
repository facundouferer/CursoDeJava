/*
 * Integrador – Examen Final (Lección 15 – Java Collections Framework y genéricos)
 * Enunciado: Administrar los productos de una heladera (lácteos y cárnicos con nombre, cantidad,
 *            marca y vencimiento): agregar, remover, consumir, modificar y listar.
 * Concepto: Clase abstracta Producto con subclases, polimorfismo y List<Producto> (ArrayList).
 */
package CursoJava.l15_java_collections_framework_y_genericos.integrador_p1_heladera;

import java.time.LocalDate;

public class Heladera {
  public static void main(String[] args) {
    AdministradorHeladera heladera = new AdministradorHeladera();

    Lacteo leche = new Lacteo("Leche Entera", 2, "La Serenísima", "Vaca", 3.5,
        LocalDate.now().plusDays(7));
    Carnico carne = new Carnico("Asado", 1, "Frigorífico", "Tira", 2.5,
        LocalDate.now().plusDays(3));

    heladera.agregarProducto(leche);
    heladera.agregarProducto(carne);
    heladera.listarProductos();

    heladera.consumirProducto(leche, 1);
    heladera.modificarProducto(carne, "Asado Premium", 2, "Nuevo Frigorífico");

    heladera.listarProductos();
  }
}
