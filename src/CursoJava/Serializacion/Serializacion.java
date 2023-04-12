package CursoJava.Serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializacion {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Personas
        Personas persona = new Personas("Juan", 12345678);

        try {
            // Creamos el flujo de salida para escribir el archivo serializado
            FileOutputStream archivoSalida = new FileOutputStream("archivo_serializado.txt");
            ObjectOutputStream flujoSalida = new ObjectOutputStream(archivoSalida);

            // Escribimos el objeto serializado
            flujoSalida.writeObject(persona);

            // Cerramos el flujo de salida
            flujoSalida.close();
            archivoSalida.close();

            System.out.println("Objeto serializado correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
