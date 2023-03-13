package parteF02StreamsDeDatos;

import java.io.FileWriter;

class parte02EscrituraDeFicheros {

    public static void main(String[]args){
        Escritura escribeElArchivo = new Escritura();
        escribeElArchivo.escribir();
    }

}

class Escritura{
    public void escribir(){
        String texto = "ESTO FUE ESCRITO Esto se escribió en el archivo desde el programa. ";

        try {

            FileWriter escriturua = new FileWriter("archivo2.txt", true);

            for(int i =0; i < texto.length(); i++){
                escriturua.write(texto.charAt(i));
            }
            escriturua.write("\n");
            escriturua.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
