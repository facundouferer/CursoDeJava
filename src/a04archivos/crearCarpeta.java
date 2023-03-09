package a04archivos;

import java.io.File;

public class crearCarpeta {
    public static void main(String[] args) {

        // Creamos un objeto de la clase File para representar la carpeta que queremos crear
        File carpeta = new File("carpetaCreada");

        // Usamos el método mkdir() para crear la carpeta
        if (carpeta.mkdir()) {
            System.out.println("La carpeta se ha creado correctamente.");
        } else {
            System.out.println("No se ha podido crear la carpeta.");
        }

        // También podemos utilizar el método mkdirs() para crear la carpeta y sus subdirectorios si no existen
        File carpetaConSubdirectorios = new File("directorio1/directorio2/carpetaCreadaConSubdirectorios");
        if (carpetaConSubdirectorios.mkdirs()) {
            System.out.println("La carpeta con subdirectorios se ha creado correctamente.");
        } else {
            System.out.println("No se ha podido crear la carpeta con subdirectorios.");
        }
    }
}
