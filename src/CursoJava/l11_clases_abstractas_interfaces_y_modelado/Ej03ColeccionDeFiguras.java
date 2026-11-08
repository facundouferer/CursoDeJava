/*
 * Lección 11 – Clases abstractas, interfaces y modelado
 * Objetivo: Cargar figuras geométricas por teclado en una colección de capacidad fija y listarlas.
 * Concepto: Clase abstracta como base común de las figuras (no existe una "figura" sin tipo)
 *           con subclases concretas.
 */
package CursoJava.l11_clases_abstractas_interfaces_y_modelado;

import java.util.Scanner;

public class Ej03ColeccionDeFiguras {

  /** Base común: guarda lo que toda figura tiene y no se puede instanciar. */
  abstract static class FiguraGeometrica {
    private final int nroLados;
    private final int cantAngulos;
    private final String nombre;

    protected FiguraGeometrica(int nroLados, int cantAngulos, String nombre) {
      this.nroLados = nroLados;
      this.cantAngulos = cantAngulos;
      this.nombre = nombre.toUpperCase();
    }

    public String getNombre() {
      return nombre;
    }

    @Override
    public String toString() {
      return "-----------------------\nNombre: " + nombre + "\nLados: " + nroLados + "\nAngulos: " + cantAngulos;
    }
  }

  static class Cuadrado extends FiguraGeometrica {
    private final int largo;
    private final int ancho;

    Cuadrado(int largo, int ancho) {
      super(4, 4, "CUADRADO");
      this.largo = largo;
      this.ancho = ancho;
    }
  }

  static class Triangulo extends FiguraGeometrica {
    private final int base;
    private final int altura;

    Triangulo(int base, int altura) {
      super(3, 3, "TRIANGULO");
      this.base = base;
      this.altura = altura;
    }
  }

  static class Circulo extends FiguraGeometrica {
    private final int radio;

    Circulo(int radio) {
      super(0, 0, "CIRCULO");
      this.radio = radio;
    }
  }

  /** Figura definida por el usuario cuando el nombre no corresponde a ninguna conocida. */
  static class FiguraPersonalizada extends FiguraGeometrica {
    FiguraPersonalizada(int nroLados, int cantAngulos, String nombre) {
      super(nroLados, cantAngulos, nombre);
    }
  }

  static class ColeccionDeFiguras {
    private final Scanner teclado;
    private final FiguraGeometrica[] figuras = new FiguraGeometrica[5];
    private int cantidad = 0;

    ColeccionDeFiguras(Scanner teclado) {
      this.teclado = teclado;
    }

    public void agregarFigura() {
      if (cantidad == figuras.length) {
        System.out.println("La colección está llena.");
        return;
      }
      System.out.println("Ingrese el nombre de la figura:");
      String nombre = teclado.nextLine();
      if (nombre.equalsIgnoreCase("cuadrado")) {
        System.out.println("Largo:");
        int largo = teclado.nextInt();
        System.out.println("Ancho:");
        int ancho = teclado.nextInt();
        figuras[cantidad] = new Cuadrado(largo, ancho);
      } else if (nombre.equalsIgnoreCase("circulo")) {
        System.out.println("Radio:");
        figuras[cantidad] = new Circulo(teclado.nextInt());
      } else if (nombre.equalsIgnoreCase("triangulo")) {
        System.out.println("Ingrese la base:");
        int base = teclado.nextInt();
        System.out.println("Ingrese la altura:");
        int altura = teclado.nextInt();
        figuras[cantidad] = new Triangulo(base, altura);
      } else {
        figuras[cantidad] = leerFiguraPersonalizada(nombre);
      }
      cantidad++;
      teclado.nextLine(); // consume el salto de línea pendiente
    }

    private FiguraPersonalizada leerFiguraPersonalizada(String nombre) {
      System.out.println("Cantidad de lados:");
      int lados = teclado.nextInt();
      System.out.println("Cantidad de angulos:");
      int angulos = teclado.nextInt();
      return new FiguraPersonalizada(lados, angulos, nombre);
    }

    public void listarFiguras() {
      System.out.println("-------------\nListado de figuras:");
      for (FiguraGeometrica figura : figuras) {
        if (figura != null) {
          System.out.println(figura);
        }
      }
    }

    public void modificarFiguraPosicion(int posicion) {
      System.out.println("Ingrese el nombre de la figura:");
      String nombre = teclado.nextLine();
      figuras[posicion] = leerFiguraPersonalizada(nombre);
      teclado.nextLine();
    }

    public int obtenerPosicionFigura(String nombreBuscado) {
      for (int i = 0; i < figuras.length; i++) {
        if (figuras[i] != null && figuras[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
          return i;
        }
      }
      return -1;
    }

    public FiguraGeometrica obtenerFigura(String nombreBuscado) {
      int posicion = obtenerPosicionFigura(nombreBuscado);
      return posicion == -1 ? null : figuras[posicion];
    }

    public void modificarFiguraNombre(String nombreBuscado) {
      int posicion = obtenerPosicionFigura(nombreBuscado);
      if (posicion != -1) {
        modificarFiguraPosicion(posicion);
      } else {
        System.out.println("No se encontró la figura con el nombre: " + nombreBuscado);
      }
    }

    public void eliminarFiguraNombre(String nombreBuscado) {
      int posicion = obtenerPosicionFigura(nombreBuscado);
      if (posicion != -1) {
        figuras[posicion] = null;
      } else {
        System.out.println("No se encontró la figura con el nombre: " + nombreBuscado);
      }
    }
  }

  public static void main(String[] args) {
    try (Scanner teclado = new Scanner(System.in)) {
      ColeccionDeFiguras figurasGuardadas = new ColeccionDeFiguras(teclado);
      figurasGuardadas.agregarFigura();
      figurasGuardadas.listarFiguras();
    }
  }
}
