package CursoJava.ArchivosYDirectorios;

import java.io.File;

class parte01AccesoRutas {
    public static void main(String[] args) {

        File archivo = new File("gatito.png"); /*Usamos el constructor que nos pide el patch*/

        System.out.println("Ruta: " + archivo.getAbsoluteFile()); /*nos muestra la ruta absoluta del archivo pero seg�n el proyecto*/

        System.out.println("Ruta: " + archivo.exists()); /*ver si un archivo existe y si no existe devuelve false.*/

        if(archivo.exists()){
            System.out.println("Existe");
        }else{
            System.out.println("No existe");
        }


    }
}
