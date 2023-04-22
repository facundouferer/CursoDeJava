package CursoJava.Arreglos;
import java.util.Scanner;
public class Arreglos03 {
    /**Ejercicio 3:
     Escriba un programa para realizar una función que, dada una lista, devuelva una nueva lista
     cuyo contenido sea igual a la original pero invertida.
     Así, dada la lista [“Di”, “buen”, “día”, “a”, “papa”],
     deberá devolver [“papa”, “a”, “día”, “buen”, “Di”].
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Solicitar al usuario la cantidad de elementos a ingresar
        System.out.println("Ingrese la cantidad de elementos en la lista:");
        n = scanner.nextInt();
        scanner.nextLine();

        // Crear un arreglo para almacenar las cadenas
        String[] lista = new String[n];

        // Solicitar al usuario las cadenas
        System.out.println("Ingrese los elementos de la lista:");
        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextLine();
        }

        // Crear un arreglo para almacenar la lista invertida
        String[] listaInvertida = new String[n];

        // Invertir la lista y almacenarla en listaInvertida
        for (int i = 0; i < n; i++) {
            listaInvertida[i] = lista[n - 1 - i];
        }

        // Imprimir la lista invertida
        System.out.println("Lista invertida:");
        for (String elemento : listaInvertida) {
            System.out.print(elemento+" ");
        }
    }
}
