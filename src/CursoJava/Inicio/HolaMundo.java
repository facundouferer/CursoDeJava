package CursoJava.Inicio;

import java.util.Scanner;

public class HolaMundo {
    /**
     * El programa pedirá al usuario la operación
     * a realizar, suma o resta, y luego de la operación
     * dirá si el resultado es par o impar.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la operación \n 1:suma\n 2:resta\n");
        int opcion = entrada.nextInt();
        double numeroUno, numeroDos, resultado = 0;
        System.out.print("Ingrese el primer número: ");
        numeroUno = entrada.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        numeroDos = entrada.nextDouble();
        switch (opcion) {
            case 1:
                resultado = numeroUno + numeroDos;
                System.out.println(numeroUno + " + " + numeroDos + " = " + resultado);
                break;
            case 2:
                resultado = numeroUno - numeroUno;
                System.out.println(numeroUno + " - " + numeroUno + " = " + resultado);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        if (resultado % 2 == 0) {
            System.out.println("El resultado es par");
        } else {
            System.out.println("El resultado es impar");
        }
    }
}