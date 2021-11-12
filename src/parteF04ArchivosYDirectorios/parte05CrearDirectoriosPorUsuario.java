package parteF04ArchivosYDirectorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class parte04CrearDirectoriosPorUsuario {

    public static void main(String[]args){

        /*
        Crear un directorios por parte de los usuarios.
         */

        Scanner lectura = new Scanner(System.in); //crea para leer

        System.out.print("Nombre de la carpeta: "); //informa al usuario que debe hacer

        String nombreCarpeta = lectura.nextLine(); //guarda el texto que será el nombre de la carpeta

        File carpeta = new File("C:"+File.separator+
                "Users"+File.separator+"facundo"+File.separator+"eclipse-workspace"+File.separator+
                "tutorialDeJavaEE"+File.separator+"carpetaConCosas"+File.separator+nombreCarpeta);
        carpeta.mkdir();

        /*
        Crear un archivo
         */

        System.out.print("Nombre de la Archivo: "); //informa al usuario que debe hacer
        String nombreArchivo = lectura.nextLine(); //guarda el texto que será el nombre de la carpeta

        /*
        Escribir dentro del archivo
         */

        System.out.print("Contenido: "); //informa al usuario que debe hacer
        String frase = lectura.nextLine();

        try {
            FileWriter contenidoDelArchivo = new FileWriter("C:"+File.separator+
                    "Users"+File.separator+"facundo"+File.separator+"eclipse-workspace"+File.separator+
                    "tutorialDeJavaEE"+File.separator+"carpetaConCosas"+File.separator+nombreCarpeta+File.separator+nombreArchivo+".txt", true);

            contenidoDelArchivo.write(frase.toString());

            contenidoDelArchivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
