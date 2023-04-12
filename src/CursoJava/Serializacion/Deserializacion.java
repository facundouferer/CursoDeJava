package CursoJava.Serializacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializacion {
    public static void main(String[] args) {
        try {
            // Creamos el flujo de entrada para leer el archivo serializado
            FileInputStream archivoEntrada = new FileInputStream("archivo_serializado.txt");
            ObjectInputStream flujoEntrada = new ObjectInputStream(archivoEntrada);

            // Leemos el objeto serializado y hacemos el casting a la clase Personas
            Personas persona = (Personas) flujoEntrada.readObject();

            // Imprimimos los datos de la persona
            System.out.println("Datos de la persona: ");
            System.out.println(persona.toString());

            // Cerramos el flujo de entrada
            flujoEntrada.close();
            archivoEntrada.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
