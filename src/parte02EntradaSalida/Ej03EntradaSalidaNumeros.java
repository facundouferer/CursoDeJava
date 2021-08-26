package parte02EntradaSalida;

import java.util.Scanner;

public class Ej03EntradaSalidaNumeros {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner entrada = new Scanner(System.in);

        System.out.println("introduce el Número");

        int numero1 = entrada.nextInt();

        System.out.println("introduce el 2do Número");

        int numero2 = entrada.nextInt(); //permite escanear el siguiente int que se ingrese

        /*
         * Para que la clase Scanner, la cual está a la escucha desde el momento
         * que la isntanciamos, no siga consumiendo recursos la cerramos
         * con la siguiente línea
         * */
        entrada.close(); // para cerrar la escucha de Scanner

        int resultado = numero1 + numero2;

        System.out.println("el número ingresado es " + resultado);

    }

}
