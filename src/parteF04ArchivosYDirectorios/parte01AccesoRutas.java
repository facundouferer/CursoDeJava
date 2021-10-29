package parteF03ArchivosYDirectorios;

import java.io.File;

public class parte01AccesoRutas {
    public static void main(String[]args){

        //Usamos el constructor que nos pide el patch
        File archivo = new File("gatito.png");

        System.out.println("Ruta: "+archivo.getAbsoluteFile()); //nos muestra la rura absoluta del archivo pero según el proyecto

        System.out.println("Ruta: "+archivo.exists());// ver si un archivo existe y si no existe devuelve false.

        //Examinar todo lo que hay dentro de un directorio

        File carpeta = new File("D:\\Desarrollo\\CursoDeJava\\src\\parteF02ArchivosYDirectorios\\carpetaConCosas");
        String [] nombres = carpeta.list();

        // lista todos lo elementos que se enceuntran en la carpeta

        System.out.println("Listado de archivos:");

        for(int i = 0; i<nombres.length;i++){

            System.out.println(nombres[i]);

            //Si queremos ver también los archivos dentro del directorio hijo
            File f = new File(carpeta.getAbsolutePath(),nombres[i]);

            if(f.isDirectory()){ //analizamos si es un directorio y si lo es lo recorremos
                String [] nombresEnSubCarpeta = f.list();
                for(int j = 0; j<nombresEnSubCarpeta.length;j++){
                    System.out.println(" -> "+nombres[j]);
                }
            }

        }

    }
}
