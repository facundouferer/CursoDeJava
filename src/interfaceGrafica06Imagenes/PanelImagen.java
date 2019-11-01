package interfaceGrafica06Imagenes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

class PanelImagen extends JPanel{
	
	private Image imagen;
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		File archivo = new File("src/interfaceGrafica06Imagenes/capitan.png");
		
		try {
			
			imagen = ImageIO.read(archivo);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Graphics2D g2 = (Graphics2D)g;
		
		g2.drawImage(imagen, 20, 20, null);
		
		
	}	

}
