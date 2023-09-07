package CursoJava.ArchivosYDirectorios;

import java.io.File;
import java.io.IOException;

class parte04crearUnNuevoDirectorio {
    public static void main(String[] args) {

        /*CREAR UNA CARPETA*/

        /* al colocar en el final el nombre del directorio que queremos crear y luego mkdir creamos el directorio */
        File carpeta = new File("D:" + File.separator + "Desarrollo" + File.separator + "CursoDeJava" + File.separator + "Carpeta_Nueva");

        carpeta.mkdir(); /*crea la carpeta*/

        /*CREAR UN ARCHIVO VAC�O*/

        File archivo = new File("D:" + File.separator + "Desarrollo" + File.separator + "CursoDeJava" + File.separator + "arhivoVacio.txt");

        try {
            archivo.createNewFile(); /*Crea el archivo nuevo*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

