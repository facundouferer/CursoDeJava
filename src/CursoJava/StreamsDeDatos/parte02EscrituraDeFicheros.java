package CursoJava.StreamsDeDatos;

import java.io.FileWriter;

class parte02EscrituraDeFicheros {

    public static void main(String[]args){
        Escritura escribeElArchivo = new Escritura();
        escribeElArchivo.escribir();
    }

}

class Escritura{
    public void escribir(){
        String texto = "ESTO FUE ESCRITO Esto se escribió en el archivo desde el programa.";

        try {

            FileWriter escritura = new FileWriter("archivo2.txt", true);

            for(int i =0; i < texto.length(); i++){
                escritura.write(texto.charAt(i));
            }
            escritura.write("\n");
            escritura.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
