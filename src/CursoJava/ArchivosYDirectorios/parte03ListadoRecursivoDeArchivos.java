package CursoJava.ArchivosYDirectorios;

import java.io.File;

class parte03ListadoRecursivoDeArchivos {

    public static void main(String[] args) {

        File carpeta = new File("D:" + File.separator + "Desarrollo" + File.separator + "CursoDeJava");

        String[] nombres = carpeta.list();

        for (int i = 0; i < nombres.length; i++) {

            System.out.println(nombres[i]); /*Escribe el nombre del archivo o directorio*/

            File f = new File(carpeta.getAbsolutePath(), nombres[i]); /*Crea un nuevo objeto para analizar luego*/

            if (f.isDirectory()) { /*si es un directorio ingresa al IF*/
                String[] nombresEnSubCarpeta = f.list(); /*Toma la lista de archivos del directorio*/
                for (int j = 0; j < nombresEnSubCarpeta.length; j++) {
                    System.out.println("\t |__ " + nombresEnSubCarpeta[j]); /*imprime el contenido del directorio. el s�mbolo \t tabula el texto*/
                }
            }

        }

    }

}
