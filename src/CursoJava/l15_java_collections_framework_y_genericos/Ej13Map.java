/*
 * Lección 15 – Java Collections Framework y genéricos
 * Objetivo: Duplicar números, extraer nombres de personas y calcular precios con descuento.
 * Concepto: Lambdas sobre colecciones: map transforma cada elemento en otro.
 */
package CursoJava.l15_java_collections_framework_y_genericos;

import java.util.List;

public class Ej13Map {

  private record Persona(String nombre, String apellido) {
  }

  private static final class Prenda {
    private static final int DESCUENTO_PORCENTAJE = 10;

    private final String nombre;
    private int precio;

    Prenda(String nombre, int precio) {
      this.nombre = nombre;
      this.precio = precio;
    }

    int precioConDescuento() {
      return precio - (precio * DESCUENTO_PORCENTAJE / 100);
    }

    void aplicarDescuento() {
      precio = precioConDescuento();
    }

    String descripcionConDescuento() {
      return nombre + " $" + precioConDescuento();
    }

    @Override
    public String toString() {
      return nombre + " $" + precio;
    }
  }

  public static void main(String[] args) {
    List<Integer> numeros = List.of(1, 2, 3);
    List<Integer> dobles = numeros.stream()
        .map(numero -> numero * 2)
        .toList();
    System.out.println("Números duplicados: " + dobles);

    List<Persona> personas = List.of(
        new Persona("José", "Pérez"),
        new Persona("María", "González"),
        new Persona("Carlos", "Sánchez"));

    System.out.println("\nNombres de las personas:");
    personas.stream()
        .map(Persona::nombre)
        .forEach(System.out::println);

    List<Prenda> prendas = List.of(
        new Prenda("Camisa", 1500),
        new Prenda("Pantalón", 3000),
        new Prenda("Campera", 5000));

    System.out.println("\nPrecios con 10% de descuento:");
    prendas.stream()
        .map(Prenda::descripcionConDescuento)
        .forEach(System.out::println);

    System.out.println("\nPrecios actuales: " + prendas);

    System.out.println("\nAplicando descuento del 10%...");
    prendas.forEach(Prenda::aplicarDescuento);

    System.out.println("Precios actuales: " + prendas);
  }
}
