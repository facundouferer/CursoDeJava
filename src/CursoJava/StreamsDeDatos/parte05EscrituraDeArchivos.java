package CursoJava.StreamsDeDatos;

import java.io.*;

class parte05EscrituraDeArchivos {

    public static void main(String[] args) {

        try {

            File archivo = new File("gatito.png");

            int tamanioDelArchivio = (int) archivo.length(); /*permite saber cuantos bytes tiene el archivo*/

            int imagen[] = new int [tamanioDelArchivio];

            /*Debe estar rodeado de un try-catch porque puede dar errores por no encontrarse el archivo.*/

            FileInputStream lecturaDeArchivos = new FileInputStream("gatito.png");

            boolean final_archivo = false;  //Creo una variable para ver si llegu� al final de la lectura

            int cont = 0;

            while(!final_archivo){ //esto suceder� mientras no se llegue al final del archivo.

                int byteImagenEntrada = lecturaDeArchivos.read(); //variable para almacenar cada byte del archivo

                if(byteImagenEntrada != -1) {
                    imagen[cont] = byteImagenEntrada; /*escribe byte a byte*/
                }else{
                    final_archivo = true; //El -1 me indica que se lleg� al final
                }

                cont++;
            }

            lecturaDeArchivos.close(); //siempre hay que cerrar el canal de lectura para no consumir recursos al pedo

            CrearArchivo(imagen);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void CrearArchivo(int arrayExterno[]){

        try {

            FileOutputStream archivoExterno = new FileOutputStream("gato2.jpg");
            for(int i=0; i < arrayExterno.length; i++){
                archivoExterno.write(arrayExterno[i]);
            }

            archivoExterno.close();
            System.out.println("archivo creado");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
