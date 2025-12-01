package Parciales.Parcial2025.Recuperatorio;

import java.util.Scanner;

class Producto {
  private int codigo;
  private String nombre;

  public Producto(int codigo, String nombre) {
    this.codigo = codigo;
    this.nombre = nombre;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String mostrarInfo() {
    return "Código: " + codigo + " - Nombre: " + nombre;
  }
}

class Analisis extends Producto {
  private int puntaje; // 1 a 5

  public Analisis(int codigo, String nombre, int puntaje) {
    super(codigo, nombre);
    this.puntaje = puntaje;
  }

  public int getPuntaje() {
    return puntaje;
  }

  public void setPuntaje(int puntaje) {
    this.puntaje = puntaje;
  }

  @Override
  public String mostrarInfo() {
    return super.mostrarInfo() + " - Calidad: " + puntaje;
  }

}

class Calidad {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Analisis[] analisis = new Analisis[20];
    int cantidad = 0;
    int opcion;

    do {
      System.out.println("\n===== CONTROL DE CALIDAD =====");
      System.out.println("1. Analizar producto");
      System.out.println("2. Ver análisis realizados");
      System.out.println("3. Salir");
      System.out.print("Elija una opción: ");
      opcion = sc.nextInt();
      sc.nextLine();

      switch (opcion) {
        case 1:
          if (cantidad < 20) {
            analisis[cantidad] = analizarProducto(sc);
            cantidad++;
          } else {
            System.out.println("Capacidad máxima alcanzada.");
          }
          break;

        case 2:
          verAnalisisRealizados(analisis, cantidad);
          break;

        case 3:
          System.out.println("Saliendo...");
          break;

        default:
          System.out.println("Opción inválida.");
      }

    } while (opcion != 3);

    sc.close();
  }

  // Procedimiento que registra un análisis y devuelve un objeto Analisis
  static Analisis analizarProducto(Scanner sc) {

    int codigo = 0;

    System.out.print("Ingrese código del producto: ");
    codigo = sc.nextInt();
    sc.nextLine();

    System.out.print("Ingrese nombre del producto: ");
    String nombre = sc.nextLine();

    System.out.print("Ingrese puntaje de calidad (1 a 5): ");
    int puntaje = sc.nextInt();
    sc.nextLine();

    return new Analisis(codigo, nombre, puntaje);
  }

  // Procedimiento que muestra los análisis realizados
  static void verAnalisisRealizados(Analisis[] arr, int cantidad) {
    System.out.println("\n=== ANÁLISIS REALIZADOS ===");

    for (int i = 0; i < cantidad; i++) {
      System.out.println(arr[i].mostrarInfo());
    }

  }

}
