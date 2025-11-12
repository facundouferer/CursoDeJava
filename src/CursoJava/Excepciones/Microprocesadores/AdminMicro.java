package CursoJava.Excepciones.Microprocesadores;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

class AdminMicro {

  public boolean agrearMicro(ArrayList<Micro> listaMicros, Scanner s) {

    boolean error = false;

    try {
      System.out.println("Ingrese nro de producto:");
      int nroProducto = s.nextInt();
      System.out.println("Ingrese modelo:");
      String modelo = s.next();
      s.nextLine(); // Limpiar el buffer
      System.out.println("Ingrese cantidad de nucleos:");
      int nucleos = s.nextInt();
      System.out.println("Ingrese frecuencia (GHz):");
      double frecuencia = s.nextDouble();
      System.out.println("Ingrese memoria (MB):");
      double memoria = s.nextDouble();
      Micro micro = new Micro(nroProducto, nucleos, frecuencia, memoria, modelo);
      listaMicros.add(micro);
      error = false;

    } catch (InputMismatchException ime) {
      System.out.println("Tipo de dato incorrecto.");
      error = true;
    } catch (Exception e) {
      System.out.println("Algo paso! ");
      System.out.println("Error: " + e);
      error = true;
    } finally {
      System.out.println("---------------------");
    }
    System.out.println("Microprocesador agregado correctamente.");
    return error;
  }

  public void listarMicros(ArrayList<Micro> listaMicros) {
    System.out.println("Listado de Microprocesadores:");
    for (Micro m : listaMicros) {
      System.out.println(m);
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    ArrayList<Micro> listaMicros = new ArrayList<>();
    AdminMicro admin = new AdminMicro();
    admin.agrearMicro(listaMicros, s);
    admin.agrearMicro(listaMicros, s);
    admin.listarMicros(listaMicros);
    s.close();
  }

}
