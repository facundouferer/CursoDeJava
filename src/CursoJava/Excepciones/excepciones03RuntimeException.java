package CursoJava.Excepciones;

import java.util.Scanner;

class excepciones03RuntimeException {

    public static void main(String[] args) {
        int nroUno = 0;
        int nroDos = 0;
        try {

            try{
                System.out.println("ingresa un número");
                Scanner leer = new Scanner(System.in);
                nroUno = leer.nextInt();

                System.out.println("ingresa otro número");
                nroDos = leer.nextInt();
            }catch(Exception e){
                System.out.println("Sólo se adminten números");
            }

            System.out.println(nroUno/nroDos);

        } catch (ArithmeticException e) {
            System.out.println("no pudimos dividir "+ e.getMessage());
        }

        System.out.println("Fin del programa");

    }

}

