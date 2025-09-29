package CursoJava.Condicionales;

import java.util.Scanner;

public class ej05CondicionalSwitch1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cantidad de hijos");
        int hijos = entrada.nextInt();

        switch (hijos) {
            case 0:
                System.out.println("No tiene hijos");
                break;
            case 1:
                System.out.println("Creo que esta bien tener un hijo");
                break;
            case 2:
                System.out.println("y bueno, 2 no son nada");
                break;
            case 3:
                System.out.println("tal vez ya son muchos.");
                break;
            default:
                System.out.println("Usted tiene " + hijos + " hijos.");
                break;
        }

    }

}
