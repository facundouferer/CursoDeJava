package CursoJava.l12_excepciones_y_manejo_de_errores.ej15_microprocesadores;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: cargar microprocesadores por teclado y listarlos, informando los datos mal ingresados.
 * Concepto: §2 try, catch, finally y §5 Varios catch (el método informa si la carga falló).
 */
public class AdminMicro {

  /** Devuelve true si la carga falló y el microprocesador no se agregó. */
  public boolean agregarMicro(ArrayList<Micro> listaMicros, Scanner leer) {
    boolean error = false;

    try {
      System.out.println("Ingrese nro de producto:");
      int nroProducto = leer.nextInt();
      System.out.println("Ingrese modelo:");
      String modelo = leer.next();
      leer.nextLine(); // descarta el resto de la línea
      System.out.println("Ingrese cantidad de núcleos:");
      int nucleos = leer.nextInt();
      System.out.println("Ingrese frecuencia (GHz):");
      double frecuencia = leer.nextDouble();
      System.out.println("Ingrese memoria (MB):");
      double memoria = leer.nextDouble();

      listaMicros.add(new Micro(nroProducto, nucleos, frecuencia, memoria, modelo));
      System.out.println("Microprocesador agregado correctamente.");
    } catch (InputMismatchException e) {
      System.out.println("Tipo de dato incorrecto.");
      error = true;
    } catch (Exception e) {
      System.out.println("Ocurrió un error inesperado: " + e);
      error = true;
    } finally {
      System.out.println("---------------------");
    }
    return error;
  }

  public void listarMicros(ArrayList<Micro> listaMicros) {
    System.out.println("Listado de microprocesadores:");
    for (Micro micro : listaMicros) {
      System.out.println(micro);
    }
  }
}
