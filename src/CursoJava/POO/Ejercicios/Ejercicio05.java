package Ejercicios;

/**
 * Ejercicio 5:
 * Escribir una clase Papel que contenga un atributo texto, un m�todo escribir,
 * que reciba una
 * cadena de caracteres para agregar al texto, y el m�todo toString() que
 * imprima el contenido del
 * texto.
 * Escribir una clase Birome que contenga un atributo cantidad de tinta, y un
 * m�todo escribir, que
 * reciba un texto y un papel (objeto de la clase Papel) sobre el cual escribir.
 * Cada letra escrita
 * debe reducir la cantidad de tinta contenida. Cuando la tinta se acabe, debe
 * imprimir un mensaje
 * de error indicando que la tinta se ha acabado.
 */
public class Ejercicio05 {

    public static void main(String[] args) {

        // Creamos un objeto de la clase Papel
        Papel papel = new Papel();

        // Creamos un objeto de la clase Birome
        Birome birome = new Birome(10);

        // Escribimos en el papel con la birome
        birome.escribir("Hola, �c�mo est�s?", papel);
        birome.escribir(" Espero que bien.", papel);
        birome.escribir(" Saludos.", papel);

        // Imprimimos el contenido del papel
        System.out.println(papel.toString());

        // Intentamos escribir con la birome que no tiene tinta
        Birome biromeSinTinta = new Birome(0);
        biromeSinTinta.escribir("No deber�a aparecer este texto en el papel.", papel);
    }
}

class Papel {

    // Atributo
    private String texto;

    // Constructor
    public Papel() {
        this.texto = "";
    }

    // M�todo escribir
    public void escribir(String texto) {
        this.texto += texto;
    }

    // M�todo toString
    public String toString() {
        return texto;
    }
}

class Birome {

    // Atributos
    private int cantidadTinta;

    // Constructor
    public Birome(int cantidadTinta) {
        this.cantidadTinta = cantidadTinta;
    }

    // M�todo escribir
    public void escribir(String texto, Papel papel) {
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (cantidadTinta > 0) {
                papel.escribir(Character.toString(letra));
                cantidadTinta--;
            } else {
                System.out.println("La tinta se ha acabado.");
                break;
            }
        }
    }
}
