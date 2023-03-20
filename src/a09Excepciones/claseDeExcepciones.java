package a09Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class claseDeExcepciones {
    public static void main(String[] args) {
        boolean error = true;
        while(error) {
            try {
                Scanner entrada = new Scanner(System.in);
                System.out.println("Escriba primer nro");
                int nro1 = entrada.nextInt();
                System.out.println("Escriba segundo nro");
                int nro2 = entrada.nextInt();
                int resultado = nro1 / nro2;
                System.out.println("El resultado es: " + resultado);
                error = false;
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir por cero");
            }catch (InputMismatchException e) {
                System.out.println("Ingrese nros enteros");
            }catch (Exception e) {
                System.out.println("Hay un error");
            }
        }
    }
}
