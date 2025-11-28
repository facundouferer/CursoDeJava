package Parciales.Parcial2025.Recuperatorio;

import java.util.Scanner;

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

}
