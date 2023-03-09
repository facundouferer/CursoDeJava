package clases;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {
    public static void main(String[] args) {
        String texto = "este es el texto del arcivo";
        File archivo = new File("miArchivo.txt");

        FileWriter escritor = null;
        try {
            escritor = new FileWriter(archivo);
            escritor.write(texto);
            escritor.close();
            System.out.println("el archivo fue creado con exito.");
        } catch (IOException e) {
            System.out.println("el archivo NO fue creado con exito.");
            throw new RuntimeException(e);
        }


    }
}
