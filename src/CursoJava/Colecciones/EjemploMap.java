package CursoJava.Colecciones;

import java.util.*;

/**
 * map() transforma cada elemento en otro.
 * Por ejemplo: pasar todos los nombres a mayúsculas o duplicar números.
 */

class Ropa {
  String nombre;
  int precio;
  int descuento = 10;

  Ropa(String nombre, int precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public String verDesceunto() {
    return nombre + " $ " + (precio - (precio * descuento / 100));
  }

  public void aplicarDescuento() {
    this.precio = precio - (precio * descuento / 100);
  }

  @Override
  public String toString() {
    return "\n" + nombre + " $" + precio;
  }

}

class EjemploMap {
  public static void main(String[] args) {

    List<Ropa> ropas = Arrays.asList(
        new Ropa("Camisa", 1500),
        new Ropa("Pantalón", 3000),
        new Ropa("Campera", 5000));

    ropas.stream()
        .map(Ropa::verDesceunto)
        .forEach(System.out::println);

    System.out.println(ropas.toString());

    System.out.println("\nAplicando descuento del 10%...\n");
    ropas.stream()
        .forEach(Ropa::aplicarDescuento);

    System.out.println(ropas.toString());
  }
}
