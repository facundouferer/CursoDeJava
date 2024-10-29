package CursoJava.ArchivosYDirectorios;

import java.io.File;

class ListadoRecursivoDeArchivos {
    public static void main(String[] args) {

        File carpeta = new File("src");
        String[] nombres = carpeta.list();

        for (int i = 0; i < nombres.length; i++) {
            /* Escribe el nombre del archivo o directorio */
            System.out.println("📂" + nombres[i]);
            /* Crea un nuevo objeto para analizar luego */
            File f = new File(carpeta.getAbsolutePath(), nombres[i]);
            /* si es un directorio ingresa al IF */
            if (f.isDirectory()) {
                /* Toma la lista de archivos del directorio∫ */
                String[] nombresEnSubCarpeta = f.list();
                for (int j = 0; j < nombresEnSubCarpeta.length; j++) {
                    System.out.println("\t |__" + nombresEnSubCarpeta[j]);
                }
            }
        }
    }

}

// en el parcial esto pasar a recursividad y que imprima los archivos de todos
// los directorios BOOM!