package pre2023.parteXXeventosDeRaton01;

import javax.swing.JFrame;

class EventoVentana01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana ventana = new MarcoVentana();
		
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//pone en escucha al marco
		ventana.addMouseListener(new EventosDeRaton());

	}

}