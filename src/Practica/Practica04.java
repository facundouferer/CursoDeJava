package Practica;

import java.util.Scanner;

class FiguraGeometrica {
  private int nroLados, cantAngulos;
  private String nombre;

  // constrcunctor con parámetros
  public FiguraGeometrica(int nroLados, int cantAngulos, String nombre) {
    this.nroLados = nroLados;
    this.cantAngulos = cantAngulos;
    this.nombre = nombre.toUpperCase();
  }

  // constructor sin parámetros
  public FiguraGeometrica() {
    this.nroLados = 0;
    this.cantAngulos = 0;
    this.nombre = "";
  }

  public String getNombre() {
    return nombre;
  }

  // sobreescritura del método de la clase Object
  public String toString() {
    return "-----------------------\nNombre: " + nombre + "\nLados: " + nroLados + "\nAngulos: " + cantAngulos;
  }
}

class Cuadrado extends FiguraGeometrica {
  float largo, ancho;

  public Cuadrado(int largo, int ancho) {
    super(4, 4, "CUADRADO");
    this.largo = largo;
    this.ancho = ancho;
  }
}

class Triangulo extends FiguraGeometrica {
  float base, altura;

  public Triangulo(int base, int altura) {
    super(3, 3, "TRIANGULO");
    this.base = base;
    this.altura = altura;
  }
}

class Circulo extends FiguraGeometrica {
  float radio;

  public Circulo(int radio) {
    super(0, 0, "CIRCULO");
    this.radio = radio;
  }
}

class ColeccionDeFiguras {
  Scanner teclado = new Scanner(System.in);
  int ultimoLuegar;
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
    this.ultimoLuegar = 0;
  }

  public void agregarFigura() {

    System.out.println("Ingrese el nombre de la figura:");
    String nombre = teclado.nextLine();
    if (nombre.equalsIgnoreCase("cuadrado")) {
      System.out.println("Largo:");
      int largo = teclado.nextInt();
      System.out.println("Ancho:");
      int ancho = teclado.nextInt();
      Cuadrado cuadrado = new Cuadrado(largo, ancho);
      figuras[ultimoLuegar] = cuadrado;
    } else if (nombre.equalsIgnoreCase("circulo")) {
      System.out.println("Radio:");
      int radio = teclado.nextInt();
      Circulo circulo = new Circulo(radio);
      figuras[ultimoLuegar] = circulo;
    } else if (nombre.equalsIgnoreCase("triangulo")) {
      System.out.println("Ingrese la base:");
      int base = teclado.nextInt();
      System.out.println("Ingrese la altura:");
      int altura = teclado.nextInt();
      Triangulo triangulo = new Triangulo(base, altura);
      figuras[ultimoLuegar] = triangulo;
    } else {
      System.out.println("Cantidad de lados:");
      int lados = teclado.nextInt();
      System.out.println("Cantidad de angulos:");
      int angulos = teclado.nextInt();
      FiguraGeometrica figura = new FiguraGeometrica(lados, angulos, nombre);
      figuras[ultimoLuegar] = figura;
    }
    ultimoLuegar++;
    teclado.nextLine(); // Limpiar el buffer para evitar problemas con nextLine()
  }

  public void listarFiguras() {
    System.out.println("-------------\nListado de figuras:");
    for (FiguraGeometrica figura : this.figuras) {
      if (figura != null) {
        System.out.println(figura.toString());
      }
    }
  }

  public void modificarFiguraPosicion() {
    System.out.println("Ingrese el nombre de la figura:");
    String nombre = teclado.nextLine();
    System.out.println("Ingrese la cantidad de lados:");
    int lados = teclado.nextInt();
    System.out.println("Ingrese la cantidad de angulos:");
    int angulos = teclado.nextInt();
    FiguraGeometrica figura = new FiguraGeometrica(lados, angulos, nombre);
    System.out.println("Ingrese la posición donde desea modificar la figura:");
    int posicion = teclado.nextInt();
    this.figuras[posicion] = figura;
  }

  public void modificarFiguraPosicion(int posicion) {
    System.out.println("Ingrese el nombre de la figura:");
    String nombre = teclado.nextLine();
    System.out.println("Ingrese la cantidad de lados:");
    int lados = teclado.nextInt();
    System.out.println("Ingrese la cantidad de angulos:");
    int angulos = teclado.nextInt();
    FiguraGeometrica figura = new FiguraGeometrica(lados, angulos, nombre);
    this.figuras[posicion] = figura;
  }

  public FiguraGeometrica obtenerFigura(String nombreBuscado) {
    for (FiguraGeometrica figura : this.figuras) {
      if (figura != null && figura.getNombre().equalsIgnoreCase(nombreBuscado)) {
        return figura;
      }
    }
    return null;
  }

  public int obtenerPosicionFigura(String nombreBuscado) {
    for (int i = 0; i < this.figuras.length; i++) {
      if (this.figuras[i] != null && this.figuras[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
        return i;
      }
    }
    return -1;
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
      this.figuras[posicion] = null;
    } else {
      System.out.println("No se encontró la figura con el nombre: " + nombreBuscado);
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
    figurasGuardadas.listarFiguras();

    teclado.close();
  }

}
