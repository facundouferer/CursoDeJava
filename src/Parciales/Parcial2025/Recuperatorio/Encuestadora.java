package Parciales.Parcial2025.Recuperatorio;

import java.util.Scanner;

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

public class Encuestadora {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Encuesta[] encuestas = new Encuesta[20];
    int cantidad = 0;
    int opcion;

    do {
      System.out.println("\n===== SISTEMA DE ENCUESTAS =====");
      System.out.println("1. Registrar encuesta");
      System.out.println("2. Ver resultados");
      System.out.println("3. Salir");
      System.out.print("Elija una opción: ");
      opcion = sc.nextInt();
      sc.nextLine();

      switch (opcion) {
        case 1:
          if (cantidad < 20) {
            encuestas[cantidad] = registrarEncuesta(sc);
            cantidad++;
          } else {
            System.out.println("Capacidad máxima alcanzada.");
          }
          break;

        case 2:
          mostrarResultados(encuestas, cantidad);
          break;

        case 3:
          System.out.println("Saliendo...");
          break;

        default:
          System.out.println("Opción inválida.");
      }

    } while (opcion != 4);

    sc.close();
  }

}