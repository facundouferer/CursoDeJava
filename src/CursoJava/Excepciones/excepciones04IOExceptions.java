package CursoJava.Excepciones;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class excepciones04IOExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			/**
			 * Si no existe el archivo dar� una IOException
			 * IOException es una Excepcion comprobada y NO DEPENDEN DEL PROGRAMDOR
			 * Significa que se ha producido un error en la entrada/salida.
			 * Es obligatorio tratar la excepci�n, ya sea en la cabeza del m�todo con "throws IOException"
			 * o con un bloque try/catch.
			 */

			BufferedImage imagen = ImageIO.read(new File("src/parteD01Excepciones/imagen.png"));
			System.out.println("TODO OK: SI se encuentra el archivo");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERROR: No se encuentra el archivo!");
		}

	}

}
