package CursoJava.l05_metodos_y_funciones;

import java.util.Scanner;

/*
 * Lección 05 – Métodos y funciones
 * Objetivo: Cargar un arreglo de enteros ingresados por el usuario y mostrar el cuadrado de cada elemento.
 * Concepto: 2. La pila de llamadas y el pasaje de parámetros (un arreglo se pasa por valor de referencia).
 */
public class Ej09CuadradosDeUnArreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamaño del listado:");
        int tamanio = scanner.nextInt();
        int[] numeros = new int[tamanio];

        cargarArreglo(numeros, scanner);
        imprimirCuadrados(numeros);

        scanner.close();
    }

    // El método modifica el contenido del arreglo recibido, visible para el llamador.
    public static void cargarArreglo(int[] numeros, Scanner scanner) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Valor:");
            numeros[i] = scanner.nextInt();
        }
    }

    public static void imprimirCuadrados(int[] numeros) {
        System.out.println("Cuadrados:");
        StringBuilder cuadrados = new StringBuilder();
        for (int i = 0; i < numeros.length; i++) {
            if (i > 0) {
                cuadrados.append(", ");
            }
            cuadrados.append(numeros[i] * numeros[i]);
        }
        System.out.println(cuadrados);
    }
}
