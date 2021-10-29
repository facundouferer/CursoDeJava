package parteF03ArchivosYDirectorios;

import java.io.File;
import java.io.IOException;

public class parte03crearUnNuevoDirectorio {
    public static void main(String[]args){

        /*
        al colocar en el final el nombre del directorio
        que queremos crear y luego mkdir creamos el directorio

         */
        File carpeta = new File("C:"+File.separator+
                "Users"+File.separator+"facundo"+File.separator+"eclipse-workspace"+File.separator+
                "tutorialDeJavaEE"+File.separator+"carpetaConCosas"+File.separator+"carpetaNueuva");

        carpeta.mkdir();

        /*
        Crear un archivo vacío
         */

        File carpeta2 = new File("C:"+File.separator+
                "Users"+File.separator+"facundo"+File.separator+"eclipse-workspace"+File.separator+
                "tutorialDeJavaEE"+File.separator+"carpetaConCosas"+File.separator+"carpetaNueuva"+File.separator+"arhivoVacio.txt");

        try {
            carpeta2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
