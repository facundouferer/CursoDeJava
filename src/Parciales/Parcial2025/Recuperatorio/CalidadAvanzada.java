package Parciales.Parcial2025.Recuperatorio;

import java.util.Scanner;
import java.util.ArrayList;

interface Auditable {
  public String mostrarInfo();
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

}
