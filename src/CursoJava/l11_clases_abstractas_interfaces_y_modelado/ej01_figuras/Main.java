/*
 * Lección 11 – Clases abstractas, interfaces y modelado
 * Objetivo: Mostrar un catálogo de figuras geométricas con su área y su cantidad de lados.
 * Concepto: Clase abstracta (Figura aporta estado y obliga a calcular el área) frente a
 *           interfaz (ConLados es un contrato que cualquier figura puede firmar).
 */
package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej01_figuras;

public class Main {
  public static void main(String[] args) {
    // Figura f = new Figura("Verde");   // no compila: Figura es abstracta
    Figura[] figuras = {
        new Circulo("Rojo", 5),
        new Rectangulo("Azul", 4, 6),
        new Triangulo("Verde", 3, 4)
    };

    for (Figura figura : figuras) {
      System.out.println(figura.mostrarInformacion());
      System.out.printf("  Área: %.2f%n", figura.calcularArea());
    }

    // La interfaz permite tratar a las figuras por su capacidad, no por su ancestro.
    ConLados[] conLados = { new Circulo("Rojo", 5), new Rectangulo("Azul", 4, 6), new Triangulo("Verde", 3, 4) };
    System.out.println("Cantidad de lados:");
    for (ConLados figura : conLados) {
      System.out.println("  " + figura.cantidadDeLados());
    }
  }
}
