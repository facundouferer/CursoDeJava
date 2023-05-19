package CursoJava.Ordenamiento;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 3};

        System.out.println("Array sin ordenar:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("Array ordenado:");
        printArray(array);
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            // Ordenar recursivamente los elementos antes y después del pivote
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                // Intercambiar los elementos
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Colocar el pivote en su posición correcta
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
