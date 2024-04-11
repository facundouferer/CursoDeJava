package CursoJava.EstructurasIterativas;

import java.util.Scanner;

public class ej05BucleDoWhile1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner entrada = new Scanner(System.in);

        System.out.println("Este programa cuenta los caracteres de la palabra o frase introducida  \n" +
                "Para termianr escribir salir");
        String texto;

        do {
            texto = entrada.nextLine();
            System.out.println("el texto contiene " + texto.length() + " caracteres.");
        } while (!texto.equals("salir"));

        System.out.println("fin del programa");

    }

}
