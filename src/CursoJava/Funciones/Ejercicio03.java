package CursoJava.Funciones;

/**Ejercicio 3:
 Escribir dos funciones que resuelvan los siguientes problemas:
 a) Dados dos números, imprimir la suma, resta, división y multiplicación de ambos.
 b) Dado un número entero n, imprimir su tabla de multiplicar.*/
public class Ejercicio03 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 3;
        operacionesBasicas(num1, num2);
        int numero = 5;
        tablaMultiplicar(numero);
    }

    public static void operacionesBasicas(int num1, int num2) {
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;

        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println("División: " + num1 + " / " + num2 + " = " + division);
    }

    public static void tablaMultiplicar(int n) {
        System.out.println("Tabla de multiplicar del " + n + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            System.out.println(n + " * " + i + " = " + resultado);
        }
    }
}
