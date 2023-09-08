package CursoJava.StreamsDeDatos;

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

            String linea = ""; /*variable vac�a donde guardaremos lo le�do*/

            while(linea != null){

                linea = miBuffer.readLine(); /*guarda en el buffer cada l�nea*/
                System.out.println(linea); /*imprime en consila cada l�nea*/

                /*la �ltima l�nea impresa ser� null porque no puede leer m�s*/

            }

            entrada.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
