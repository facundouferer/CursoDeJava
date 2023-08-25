package CursoJava.Excepciones;

import java.io.IOException;
import java.util.Scanner;

class excepciones06ThrowObligatorio {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /**
         * nos obliga a colocar try-catch
         */
        try {
            realizarDivision();
        } catch (IOException e) {

            e.printStackTrace();
        }

        System.out.println("Fin del programa");

    }

    /**
     * Como es una excepci�n controlada estmos obligados a colocar el trycatch en donde se lllame al m�todo.
     * Siempre hay que colocar la excepcion que puede pasar, no una gen�rica o err�nea.
     */
    static void realizarDivision() throws IOException {

        Scanner leer = new Scanner(System.in);

        System.out.println("ingresa un n�mero");
        int nroUno = leer.nextInt();

        System.out.println("ingresa otro n�mero");
        int nroDos = leer.nextInt();

        int resultado = nroUno / nroDos;
        System.out.println("el resultado es" + resultado);

    }

}
