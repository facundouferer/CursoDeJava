package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej11_calculadora;

import java.util.Scanner;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Ofrecer un menú interactivo que opera con dos números mediante un objeto Calculadora.
 * Concepto: 3. Ejemplo práctico: modelando una clase (instanciación y uso).
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Menu menu = new Menu();
        int opcion;

        do {
            menu.mostrarMenu();
            opcion = entrada.nextInt();

            if (opcion == 0) {
                System.out.println("FIN");
            } else if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                int nro1 = entrada.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int nro2 = entrada.nextInt();
                ejecutarOperacion(opcion, new Calculadora(nro1, nro2));
            } else {
                System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        entrada.close();
    }

    private static void ejecutarOperacion(int opcion, Calculadora calculadora) {
        int nro1 = calculadora.getNro1();
        int nro2 = calculadora.getNro2();

        switch (opcion) {
            case 1:
                System.out.println(nro1 + "+" + nro2 + " = " + calculadora.sumar());
                break;
            case 2:
                int resta = calculadora.restar();
                System.out.println(nro1 + "-" + nro2 + " = " + resta);
                if (resta < 0) {
                    System.out.println("El resultado es negativo");
                }
                break;
            case 3:
                System.out.println(nro1 + "*" + nro2 + " = " + calculadora.multiplicar());
                break;
            case 4:
                if (calculadora.esIndeterminada()) {
                    System.out.println("El resultado es indeterminado");
                } else if (!calculadora.puedeDividir()) {
                    System.out.println("No se puede dividir por cero");
                } else {
                    System.out.println(nro1 + "/" + nro2 + " = " + calculadora.dividir());
                }
                break;
            default:
                break;
        }
    }
}
