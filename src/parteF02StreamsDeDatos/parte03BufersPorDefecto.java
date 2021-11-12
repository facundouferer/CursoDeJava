package parteF02StreamsDeDatos;

import java.io.BufferedReader;
import java.io.FileReader;

class parte01BufersPorDefecto {
    public static void main(String[]args){

        LeerFicheroConBuffer lectura = new LeerFicheroConBuffer();
        lectura.leeDatos();

    }
}

class LeerFicheroConBuffer{

    public void leeDatos() {

        try {

            FileReader entrada = new FileReader("archivo2.txt");

            BufferedReader miBuffer = new BufferedReader(entrada); /*El buffer donde guardaremos*/

            String linea = ""; /*variable vacía donde guardaremos lo leído*/

            while(linea != null){

                linea = miBuffer.readLine(); /*guarda en el buffer cada línea*/
                System.out.println(linea); /*imprime en consila cada línea*/

                /*la última línea impresa será null porque no puede leer más*/

            }

            entrada.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
