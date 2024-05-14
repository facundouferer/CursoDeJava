package CursoJava.Serializacion;

import java.io.*;

class Lectura {
	public static void main(String[] args) { // TODO Auto-generated method stub

		try {
			ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("miObjetoSerializado.txt"));
			Persona personasEntrada = (Persona) flujoEntrada.readObject();
			System.out.println(personasEntrada.toString());
		} catch (IOException e) {
			// catch para capturar los errores al intentar leer el archivo
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// catch para capturar los errores producto de la lecuta del archivo
			e.printStackTrace();
		}
	}

}

class Persona implements Serializable {
	private String nombre;
	private int dni;

	public Persona(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String toString() {
		return this.nombre + " (" + this.dni + ")";
	}

}
