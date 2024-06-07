package CursoJava.EjerciciosResueltos;

import java.io.*;
import java.util.*;

public class ej47InvertirLineasArchivo {
  public static void main(String[] args) {

    String nombreArchivoEntrada = "operaciones_con_archivos/archivo.txt";
    String nombreArchivoSalida = "operaciones_con_archivos/salida.txt";

    List<String> lineas = leerLineasDeArchivo(nombreArchivoEntrada);

    Collections.reverse(lineas);

    escribirLineasEnArchivo(nombreArchivoSalida, lineas);
  }

  public static List<String> leerLineasDeArchivo(String nombreArchivo) {
    List<String> lineas = new ArrayList<>();
    try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
      String linea;
      while ((linea = lector.readLine()) != null) {
        lineas.add(linea);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lineas;
  }

  public static void escribirLineasEnArchivo(String nombreArchivo, List<String> lineas) {
    try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
      for (String linea : lineas) {
        escritor.write(linea);
        escritor.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
