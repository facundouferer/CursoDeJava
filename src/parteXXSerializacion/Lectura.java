package parteXXSerializacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("/datos/workspace/ObjetosSerializados/miObjetoSerializado.txt"));
			
			//debemos crear una variable del mismo objeto que queremos deserializar
			
			//Debemos hacer un casting de Objet a la clase Personas
			Personas[] personasEntrada = (Personas[]) flujoEntrada.readObject();
			
			for(Personas e: personasEntrada) {
				System.out.println(e.toString());
			}
			
		} catch (IOException e) {
			// catch para capturar los errores al intentar leer el archivo
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// catch para capturar los errores producto de la lecuta del archivo
			e.printStackTrace();
		}
		
		

	}

}
