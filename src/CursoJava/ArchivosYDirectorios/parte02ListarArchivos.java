package CursoJava.ArchivosYDirectorios;

import java.io.File;

class parte02ListarArchivos {
    public static void main(String[] args) {

        /*Usamos el constructor que nos pide el patch
        * Usamos File.separator para que traiga el separador de carpetas
        * sin problemas
        * */
        File directorio = new File("/Users/facundouferer/Devs/UTN/CursoDeJava");

        String [] nombres = directorio.list();

        // lista todos los elementos que se enceuntran en la carpeta
        System.out.println("Listado de archivos:");

        for(int i = 0; i<nombres.length;i++){
            System.out.println(nombres[i]);
        }

    }
}
