package viejes.parteZ01Parcial_2_2022_12_01;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        // Escritura escribeElArchivo = new Escritura();
        // escribeElArchivo.escribir();
        // ArrayList<Jugador> listaJugadores = new ArrayList<>();
        LeerFichero leeElArchivo = new LeerFichero();
        leeElArchivo.leeDatos();
    }
}

class Escritura {
    public void escribir() {
        String texto = "Dibu Mart�nez; Molina, Romero, Otamendi, Acu�a; De Paul, Enzo Fern�ndez, Alexis Mac Allister; Messi, Juli�n �lvarez; Di Mar�a";

        try {
            FileWriter escriturua = new FileWriter("jugadores.txt", true);

            for (int i = 0; i < texto.length(); i++) {
                escriturua.write(texto.charAt(i));
            }
            escriturua.write("\n");
            escriturua.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class LeerFichero {
    public void leeDatos() {
        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        String jugador = "";
        String numero = "";
        try {
            FileReader entrada = new FileReader("jugadores.txt");
            int caracter = entrada.read();
            char letra = (char) caracter;
            while (caracter != -1) {
                if (letra == ';') {
                    System.out.println(numero + ") " + jugador);
                    jugador = "";
                    numero = "";
                } else {
                    jugador += letra;
                }
                caracter = entrada.read();
                letra = (char) caracter;
            }
            entrada.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

class Jugador {
    String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getDatos() {
        return this.nombre;
    }
}
