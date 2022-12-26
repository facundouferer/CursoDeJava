package parteZ01Parcial_2_2022_11_17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Archivo implements Impresion {

    private String nombreArchivo;

    public Archivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    public void imprimir(String texto){
        try {
            FileWriter escriturua = new FileWriter(this.nombreArchivo, false);
            for(int i =0; i < texto.length(); i++){
                escriturua.write(texto.charAt(i));
            }
            escriturua.write("\n");
            escriturua.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leerArchivo(String nombreArchivo){
        try {
            FileReader lector = new FileReader(nombreArchivo);
            BufferedReader lectorBuffer = new BufferedReader(lector);
            String linea = lectorBuffer.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = lectorBuffer.readLine();
            }
            lectorBuffer.close();
            lector.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
