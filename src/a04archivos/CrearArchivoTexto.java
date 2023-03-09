package a04archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivoTexto {
    public static void main(String[] args) {

        String texto = "este texto se guardo en el archivo";
        File archivo = new File("archivoDeTexto.txt");

        try {
            FileWriter escritor = new FileWriter(archivo);
            escritor.write(texto);
            escritor.close();
            System.out.println("El archivo se ha creado con éxito.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el archivo.");
            e.printStackTrace();
        }
    }
}
