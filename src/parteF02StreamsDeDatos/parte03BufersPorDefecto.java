package parteF01Buffers;

import java.io.BufferedReader;
import java.io.FileReader;

public class parte01BufersPorDefecto {
    public static void main(String[]args){

        LeerFichero lectura = new LeerFichero();
        lectura.leeDatos();

    }
}

class LeerFichero{

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
