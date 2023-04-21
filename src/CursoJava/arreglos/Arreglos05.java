package CursoJava.arreglos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Arreglos05 {
    /**Ejercicio 5:
     Escriba un programa para calcular el promedio de 20 valores almacenados en un arreglo. Los
     valores deben ser ingresados por teclado. Además, determinar cuántos valores son mayores
     que el promedio. Imprima:
     a) El promedio
     b) La cantidad de valores mayores al promedio y la lista de valores.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 20;
        double suma = 0;
        double promedio;
        int contadorMayores = 0;
        List<Integer> mayores = new ArrayList<>();

        // Crear un arreglo para almacenar los 20 valores
        int[] valores = new int[n];

        // Solicitar los valores al usuario
        System.out.println("Ingrese 20 valores:");
        for (int i = 0; i < n; i++) {
            valores[i] = scanner.nextInt();
            suma += valores[i];
        }

        // Calcular el promedio
        promedio = suma / n;

        // Contar cuántos valores son mayores que el promedio
        for (int i = 0; i < n; i++) {
            if (valores[i] > promedio) {
                contadorMayores++;
                mayores.add(valores[i]);
            }
        }

        // a) Imprimir el promedio
        System.out.println("El promedio es: " + promedio);

        // b) Imprimir la cantidad de valores mayores al promedio y la lista de valores
        System.out.println("Hay " + contadorMayores + " valores mayores que el promedio:");
        System.out.println(mayores);
    }
}
