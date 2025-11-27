package Parciales.Parcial2025.Recuperatorio;

import java.util.Scanner;
import java.util.ArrayList;

interface Informable {
  public String mostrarInfo();
}

class Persona implements Informable {
  private String nombre;

  public Persona(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String mostrarInfo() {
    return nombre;
  }
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

  // Procedimiento que registra una encuesta y devuelve un objeto Encuesta
  static Encuesta registrarEncuesta(Scanner sc) {

    System.out.print("Ingrese nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Ingrese puntaje (1 a 5): ");
    int puntaje = sc.nextInt();
    sc.nextLine();

    return new Encuesta(nombre.toUpperCase(), puntaje);
  }

  // Procedimiento que elimina la última encuesta registrada
  static void eliminarUltimoRegistro(ArrayList<Encuesta> encuestas) {
    if (encuestas.isEmpty()) {
      System.out.println("No hay encuestas para eliminar.");
    } else {
      Encuesta ultimaEncuesta = encuestas.get(encuestas.size() - 1);
      encuestas.remove(encuestas.size() - 1);
      System.out.println("Se eliminó la encuesta de: " + ultimaEncuesta.getNombre());
      System.out.println("Total de encuestas restantes: " + encuestas.size());
    }
  }

  // Procedimiento que muestra los resultados
  static void mostrarResultados(ArrayList<Encuesta> encuestas) {
    System.out.println("\n=== RESULTADOS DE ENCUESTAS ===");

    if (encuestas.isEmpty()) {
      System.out.println("No hay encuestas registradas.");
    } else {
      for (Encuesta encuesta : encuestas) {
        System.out.println(encuesta.mostrarInfo());
      }
      System.out.println("\nTotal de encuestas: " + encuestas.size());
    }
  }
}
