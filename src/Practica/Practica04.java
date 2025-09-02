package Practica;

import java.util.Scanner;

class FiguraGeometrica {
  private int nroLados, cantAngulos;
  private String nombre;

  // constrcunctor con parámetros
  public FiguraGeometrica(int nroLados, int cantAngulos, String nombre) {
    this.nroLados = nroLados;
    this.cantAngulos = cantAngulos;
    this.nombre = nombre;
  }

  // constructor sin parámetros
  public FiguraGeometrica() {
    this.nroLados = 0;
    this.cantAngulos = 0;
    this.nombre = "";
  }

  // sobreescritura del método de la clase Object
  public String toString() {
    return "-----------------------\nNombre: " + nombre + "\nLados: " + nroLados + "\nAngulos: " + cantAngulos;
  }
}

class ColeccionDeFiguras {
  Scanner teclado = new Scanner(System.in);
  FiguraGeometrica[] figuras = new FiguraGeometrica[5];

  /**
   * Constructor de la clase ColeccionDeFiguras
   * que recibe el Scanner para poder ocuparlo en
   * agregarFigura y evitar la creación de un nuevo Scanner.
   * 
   * @param teclado
   */
  public ColeccionDeFiguras(Scanner teclado) {
    this.teclado = teclado;
  }

  public void agregarFigura() {

    System.out.println("Ingrese el nombre de la figura:");
    String nombre = teclado.nextLine();
    System.out.println("Ingrese la cantidad de lados:");
    int lados = teclado.nextInt();
    System.out.println("Ingrese la cantidad de angulos:");
    int angulos = teclado.nextInt();
    FiguraGeometrica figura = new FiguraGeometrica(lados, angulos, nombre);
    System.out.println("Ingrese el lugar donde desea agregar la figura (0-4):");
    int lugar = teclado.nextInt();
    figuras[lugar] = figura;
    teclado.nextLine(); // Limpiar el buffer para evitar problemas con nextLine()
  }

  public void listarFiguras() {
    for (FiguraGeometrica figura : this.figuras) {
      if (figura != null) {
        System.out.println(figura.toString());
      }
    }
  }
}

/**
 * La clase principal donde se
 * inicia el programa, lo que no está aquí no se ejecuta.
 */
public class Practica04 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    ColeccionDeFiguras figurasGuardadas = new ColeccionDeFiguras(teclado);
    figurasGuardadas.agregarFigura();
    figurasGuardadas.agregarFigura();
    figurasGuardadas.listarFiguras();

    teclado.close();
  }

}
