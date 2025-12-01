package Parciales.Parcial2025.Recuperatorio;

import java.util.Scanner;
import java.util.ArrayList;

interface Auditable {
  public String mostrarInfo();
}

class Producto implements Auditable {
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

  @Override
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

class CalidadAvanzada {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ArrayList<Analisis> analisisList = new ArrayList<>();
    int opcion;

    do {
      System.out.println("\n===== CONTROL DE CALIDAD AVANZADO =====");
      System.out.println("1. Analizar producto");
      System.out.println("2. Ver análisis realizados");
      System.out.println("3. Eliminar último análisis");
      System.out.println("4. Salir");
      System.out.print("Elija una opción: ");
      opcion = sc.nextInt();
      sc.nextLine();

      switch (opcion) {
        case 1:
          analisisList.add(analizarProducto(sc));
          System.out.println("Análisis registrado exitosamente.");
          break;

        case 2:
          verAnalisisRealizados(analisisList);
          break;

        case 3:
          eliminarUltimoAnalisis(analisisList);
          break;

        case 4:
          System.out.println("Saliendo...");
          break;

        default:
          System.out.println("Opción inválida.");
      }

    } while (opcion != 4);

    sc.close();
  }

  // Procedimiento que registra un análisis y devuelve un objeto Analisis
  static Analisis analizarProducto(Scanner sc) {

    int codigo = 0;
    boolean codigoValido = false;
    while (!codigoValido) {
      try {
        System.out.print("Ingrese código del producto: ");
        codigo = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea
        codigoValido = true;
      } catch (Exception e) {
        System.out.println("No se puede colocar letra en el codigo");
        sc.nextLine(); // Limpiar el buffer del scanner
      }
    }

    System.out.print("Ingrese nombre del producto: ");
    String nombre = sc.nextLine();

    System.out.print("Ingrese puntaje de calidad (1 a 5): ");
    int puntaje = sc.nextInt();
    sc.nextLine();

    return new Analisis(codigo, nombre, puntaje);
  }

  // Procedimiento que muestra los análisis realizados
  static void verAnalisisRealizados(ArrayList<Analisis> analisisList) {
    System.out.println("\n=== ANÁLISIS REALIZADOS ===");

    if (analisisList.isEmpty()) {
      System.out.println("No hay análisis registrados.");
    } else {
      for (Analisis a : analisisList) {
        System.out.println(a.mostrarInfo());
      }
      System.out.println("\nTotal de análisis: " + analisisList.size());
    }
  }

  // Procedimiento que elimina el último análisis registrado
  static void eliminarUltimoAnalisis(ArrayList<Analisis> analisisList) {
    if (analisisList.isEmpty()) {
      System.out.println("No hay análisis para eliminar.");
    } else {
      Analisis ultimoAnalisis = analisisList.get(analisisList.size() - 1);
      analisisList.remove(analisisList.size() - 1);
      System.out.println("Se eliminó el análisis del producto: " + ultimoAnalisis.getNombre());
      System.out.println("Total de análisis restantes: " + analisisList.size());
    }
  }

}
