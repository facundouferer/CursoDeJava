package viejes.parteXXinterfaceGrafica07Imagenes;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

class Panel extends JPanel {

	private Image imagen;

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		File archivo = new File("src/interfaceGrafica07Imagenes/deadpool.gif");

		try {

			imagen = ImageIO.read(archivo);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int ancho = imagen.getWidth(this);
		int alto = imagen.getHeight(this);

		g.drawImage(imagen, 20, 20, null);

		for (int i = 0; i < 500; i++) {
			for (int j = 0; j <= 400; j++) {
				g.copyArea(0, 0, ancho, alto, ancho * i, alto * j);
			}
		}

	}

}
