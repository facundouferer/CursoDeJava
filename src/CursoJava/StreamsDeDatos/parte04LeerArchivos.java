package CursoJava.StreamsDeDatos;

import java.io.FileInputStream;
import java.io.IOException;

class parte04LeerArchivos {

    public static void main (String[]args){

        try {

            /*Debe estar rodeado de un try-catch porque puede dar errores por no encontrarse el archivo.*/

            FileInputStream lecturaDeArchivos = new FileInputStream("gato.jpg");

            boolean final_archivo = false;  //Creo una variable para ver si llegu� al final de la lectura

            while(!final_archivo){ //esto suceder� mientras no se llegue al final del archivo.

                int byteImagenEntrada = lecturaDeArchivos.read(); //variable para almacenar cada byte del archivo

                if(byteImagenEntrada == -1) final_archivo = true; //El -1 me indica que se lleg� al final

                System.out.println(byteImagenEntrada); /*Me mostrar� todos los bits en la consola*/

            }

            lecturaDeArchivos.close(); //siempre hay que cerrar el canal del lectura para no consumir recursos al pedo

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
