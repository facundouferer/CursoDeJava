package CursoJava.l12_excepciones_y_manejo_de_errores;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: leer una imagen del disco y avisar si el archivo no existe.
 * Concepto: §3 Checked vs unchecked (IOException es checked: el compilador
 *           obliga a atraparla con try/catch o a declararla con throws).
 */
public class Ej05ExcepcionChequeada {

  public static void main(String[] args) {
    try {
      BufferedImage imagen = ImageIO.read(new File("src/parteD01Excepciones/imagen.png"));
      System.out.println("La imagen se leyó correctamente.");
    } catch (IOException e) {
      System.err.println("No se pudo leer el archivo: " + e.getMessage());
    }
  }
}
