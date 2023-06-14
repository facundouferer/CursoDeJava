package CursoJava.Ordenamiento;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 3};

        System.out.println("Array sin ordenar:");
        printArray(array);
        bubbleSort(array);
        System.out.println("Array ordenado:");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Iteración actual
            System.out.println("Iteración " + (i + 1) + ":");

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar los elementos
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                // Estado actual del array en esta iteraci�n
                printArray(array);
            }

            System.out.println();
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
