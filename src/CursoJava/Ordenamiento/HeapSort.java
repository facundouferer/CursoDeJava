package CursoJava.Ordenamiento;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9, 3};

        System.out.println("Array sin ordenar:");
        printArray(array);

        heapSort(array);

        System.out.println("Array ordenado:");
        printArray(array);
    }

    public static void heapSort(int[] array) {
        int n = array.length;

        // Construir el montículo máximo
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extraer elementos del montículo uno por uno
        for (int i = n - 1; i >= 0; i--) {
            // Mover el elemento raíz (máximo) al final
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Llamar a heapify en el subárbol reducido
            heapify(array, i, 0);

            // Estado actual del array en esta iteración
            printArray(array);
        }
    }

    public static void heapify(int[] array, int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        // Si el hijo izquierdo es más grande que la raíz
        if (leftChild < n && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // Si el hijo derecho es más grande que la raíz o el hijo izquierdo
        if (rightChild < n && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // Si se cambió la raíz
        if (largest != i) {
            // Intercambiar los elementos
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            // Recursivamente hacer heapify en el subárbol afectado
            heapify(array, n, largest);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
