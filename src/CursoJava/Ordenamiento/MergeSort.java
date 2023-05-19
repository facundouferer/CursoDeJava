package CursoJava.Ordenamiento;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 3};

        System.out.println("Array sin ordenar:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("Array ordenado:");
        printArray(array);
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Ordenar recursivamente la primera mitad del array
            mergeSort(array, left, middle);

            // Ordenar recursivamente la segunda mitad del array
            mergeSort(array, middle + 1, right);

            // Combinar las dos mitades ordenadas
            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Crear arreglos temporales para almacenar las mitades
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copiar los datos a los arreglos temporales
        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[middle + 1 + j];
        }

        // Combinar los arreglos temporales en el array original
        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de leftArray, si los hay
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copiar los elementos restantes de rightArray, si los hay
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }

        // Estado actual del array en esta iteración
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
