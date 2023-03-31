package pre2023.parteF03Serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList of Personas
		ArrayList<Personas> personas = new ArrayList<Personas>();

		
		personas.add(new Personas("Alberto Fernandez", 32123987));
		personas.add(new Personas("Carlitos Tevez", 12987987));
		personas.add(new Personas("Rita Sosa", 31123654)) ;
		personas.add(new Personas("Juan De Arco", 78123123));
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
