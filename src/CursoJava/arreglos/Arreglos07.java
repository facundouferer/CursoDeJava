package CursoJava.arreglos;
import java.util.Scanner;
public class Arreglos07 {
    /**Ejercicio 7:
     Diseñe un algoritmo que lea dos arreglos A y B de 20 elementos cada uno y multiplique el
     primer elemento de A con el último elemento de B y luego el segundo elemento de A por el
     décimo noveno elemento de B y así sucesivamente hasta llegar al veinteavo elemento de A por
     el primer elemento de B. Almancer el resultado de las multiplicaciones en un arreglo C.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 20;

        // Crear arreglos A, B y C
        int[] arregloA = new int[n];
        int[] arregloB = new int[n];
        int[] arregloC = new int[n];

        // Solicitar al usuario los elementos del arreglo A
        System.out.println("Ingrese los elementos del arreglo A:");
        for (int i = 0; i < n; i++) {
            arregloA[i] = scanner.nextInt();
        }

        // Solicitar al usuario los elementos del arreglo B
        System.out.println("Ingrese los elementos del arreglo B:");
        for (int i = 0; i < n; i++) {
            arregloB[i] = scanner.nextInt();
        }

        // Multiplicar el primer elemento de A con el último elemento de B y así sucesivamente,
        // almacenar el resultado en el arreglo C
        for (int i = 0; i < n; i++) {
            arregloC[i] = arregloA[i] * arregloB[n - i - 1];
        }

        // Imprimir el resultado final
        System.out.println("El resultado de las multiplicaciones es:");
        for (int i = 0; i < n; i++) {
            System.out.println("arregloA[" + i + "] * arregloB[" + (n - i - 1) + "] = " + arregloC[i]);
        }
    }
}
