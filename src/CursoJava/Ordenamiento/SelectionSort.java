package CursoJava.Ordenamiento;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 3};

        System.out.println("Array sin ordenar:");
        printArray(array);

        selectionSort(array);

        System.out.println("Array ordenado:");
        printArray(array);
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Encontrar el elemento mínimo en el subarray sin ordenar
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambiar el elemento mínimo con el elemento actual
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            // Estado actual del array en esta iteración
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

