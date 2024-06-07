package CursoJava.EjerciciosResueltos;

import java.io.FileReader;
import java.io.IOException;

public class ej49ContarVocales {
  public static void main(String[] args) {
    String nombreArchivo = "operaciones_con_archivos/archivo.txt";
    int contadorVocales = 0;

    try (FileReader lector = new FileReader(nombreArchivo)) {
      int c;
      while ((c = lector.read()) != -1) {
        char caracter = (char) c;
        /**
         * indexOf(caracter): Este método busca el carácter especificado dentro
         * de la cadena "aeiouAEIOU". Si el carácter se encuentra en la cadena,
         * indexOf devuelve la posición (índice) del primer encuentro del carácter.
         * Si el carácter no se encuentra en la cadena, indexOf devuelve -1.
         */
        if ("aeiouAEIOU".indexOf(caracter) != -1) {
          contadorVocales++;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("Número de vocales: " + contadorVocales);
  }
}
