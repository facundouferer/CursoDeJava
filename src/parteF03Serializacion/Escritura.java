package parteF03Serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personas[] personas = new Personas[4];
		
		personas[0]= new Personas("Alberto Fernandez", 32123987);
		personas[1]= new Personas("Carlitos Tevez", 12987987);
		personas[2]= new Personas("Rita Sosa", 31123654);
		personas[3]= new Personas("Juan De Arco", 78123123);
		//Creamos el canal para guardar el objeto
		//utilizamos un try-catch por si no puede escribirse el objeto
		try {
			ObjectOutputStream flujoSalida = new ObjectOutputStream(new FileOutputStream("miObjetoSerializado.txt"));
			// Escribe el objeto en un archivo
			flujoSalida.writeObject(personas);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};

	}

}
