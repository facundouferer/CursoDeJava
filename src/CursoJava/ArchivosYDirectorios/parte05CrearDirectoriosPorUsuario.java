package CursoJava.ArchivosYDirectorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class parte05CrearDirectoriosPorUsuario {

    public static void main(String[] args) {

        /*CREAR UN DIRECTORIO POR PARTE DEL ARCHIVO*/

        Scanner lectura = new Scanner(System.in); //crea para leer

        System.out.print("Nombre de la carpeta: "); //informa al usuario que debe hacer

        String nombreCarpeta = lectura.nextLine(); //guarda el texto que ser� el nombre de la carpeta

        File carpeta = new File("D:" + File.separator + "Desarrollo" + File.separator + "CursoDeJava" + File.separator + nombreCarpeta);

        carpeta.mkdir(); /*Crea la carpeta*/

        /*CREAR UN ARCHIVO*/

        System.out.print("Nombre de la Archivo: "); //informa al usuario que debe hacer

        String nombreArchivo = lectura.nextLine(); //guarda el texto que ser� el nombre de la carpeta

        /* Escribir dentro del archivo */

        System.out.print("Contenido: "); //informa al usuario que debe hacer
        String frase = lectura.nextLine();

        try {
            FileWriter contenidoDelArchivo = new FileWriter("D:" + File.separator + "Desarrollo" + File.separator + "CursoDeJava" + File.separator + nombreCarpeta + File.separator +nombreArchivo + ".txt", true);

            contenidoDelArchivo.write(frase.toString()); /*Escribe en el archivo el contenido escrito por el usuario*/

            contenidoDelArchivo.close(); /*cierra el objeto*/

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
