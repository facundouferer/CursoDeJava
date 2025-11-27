package Parciales.Parcial2025.Recuperatorio;

import java.util.Scanner;
import java.util.ArrayList;

interface Informable {
  public String mostrarInfo();
}

class Encuesta extends Persona {
  private int puntaje; // 1 a 5

  public Encuesta(String nombre, int puntaje) {
    super(nombre);
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
    return super.mostrarInfo() + " - Puntaje: " + puntaje;
  }

}

public class EncuestadoraAvanzada {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ArrayList<Encuesta> encuestas = new ArrayList<>();
    int opcion;

    do {
      System.out.println("\n===== SISTEMA DE ENCUESTAS =====");
      System.out.println("1. Registrar encuesta");
      System.out.println("2. Ver resultados");
      System.out.println("3. Eliminar último registro");
      System.out.println("4. Salir");
      System.out.print("Elija una opción: ");
      opcion = sc.nextInt();
      sc.nextLine();

      switch (opcion) {
        case 1:
          encuestas.add(registrarEncuesta(sc));
          System.out.println("Encuesta registrada exitosamente.");
          break;

        case 2:
          mostrarResultados(encuestas);
          break;

        case 3:
          eliminarUltimoRegistro(encuestas);
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
