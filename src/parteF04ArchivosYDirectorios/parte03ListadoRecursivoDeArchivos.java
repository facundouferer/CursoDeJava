package parteF04ArchivosYDirectorios;

import java.io.File;

public class parte02mejorandoLaLectura {

    public static void main(String[]args){

        /*
        Usamos File.separator para colocar el separador compatible con mi sistema operativo
        y así hacer compatible nuestro programa con otros sistema operativos.
         */

        File carpeta = new File("C:"+File.separator+"Users"+File.separator+"facundo"+File.separator+"eclipse-workspace"+File.separator+"tutorialDeJavaEE"+File.separator+"carpetaConCosas");
        String [] nombres = carpeta.list();

        /*
        Listar el contenido de la carpeta instanciada
         */

        for(int i = 0; i<nombres.length;i++){
            System.out.println(nombres[i]);
            File f = new File(carpeta.getAbsolutePath(),nombres[i]);
            if(f.isDirectory()){
                String [] nombresEnSubCarpeta = f.list();
                for(int j = 0; j<nombresEnSubCarpeta.length;j++){
                    System.out.println(" -> "+nombres[j]);
                }
            }

        }

    }

}
