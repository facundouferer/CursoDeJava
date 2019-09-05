package excepciones;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class bIOException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedImage imagen = null;
		try {
			imagen = ImageIO.read(new File("src/excepciones/imagen.png"));
			System.out.println("LA IMAGEN EXISTE");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("NO SE ENCUENTRA LA IMAGEN");
		}
		
	}

}
