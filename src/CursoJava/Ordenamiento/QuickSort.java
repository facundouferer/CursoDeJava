package CursoJava.Ordenamiento;

public class QuickSort {
    // Método principal para iniciar el proceso de ordenamiento QuickSort
    public static void sort(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            return;
        }
        System.out.println("Iniciando QuickSort:");
        quickSort(arreglo, 0, arreglo.length - 1); // Llamada al método auxiliar quickSort
    }

    // Método auxiliar que implementa el algoritmo QuickSort de manera recursiva
    private static void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        // Elegir un elemento pivote (podría ser cualquier elemento en el rango)
        int pivote = arreglo[(inicio + fin) / 2];
        // Particionar el arreglo alrededor del pivote y obtener el índice de partición
        int indiceParticion = particion(arreglo, inicio, fin, pivote);
        // Mostrar el resultado de la partición
        System.out.println("Partición: ");
        imprimirArreglo(arreglo);
        // Mostrar los subarreglos resultantes
        System.out.println("Subarreglos resultantes: ");
        imprimirSubarreglos(arreglo, inicio, fin, indiceParticion);
        // Aplicar QuickSort recursivamente a las sub-particiones izquierda y derecha
        // del pivote
        quickSort(arreglo, inicio, indiceParticion - 1);
        quickSort(arreglo, indiceParticion, fin);
    }

    // Método auxiliar para particionar el arreglo y devolver el índice de partición
    private static int particion(int[] arreglo, int inicio, int fin, int pivote) {
        while (inicio <= fin) {
            while (arreglo[inicio] < pivote) {
                inicio++;
            }
            while (arreglo[fin] > pivote) {
                fin--;
            }
            if (inicio <= fin) {
                // Intercambiar los elementos en las posiciones inicio y fin
                int temp = arreglo[inicio];
                arreglo[inicio] = arreglo[fin];
                arreglo[fin] = temp;
                // Mover los índices para continuar con la partición
                inicio++;
                fin--;
            }
        }
        // Devolver el índice donde se encuentra el pivote después de la partición
        return inicio;
    }

    // Método para imprimir el contenido del arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    // Método para imprimir los subarreglos resultantes
    public static void imprimirSubarreglos(int[] arreglo, int inicio, int fin, int indiceParticion) {
        // Imprimir subarreglo izquierdo
        System.out.print("[");
        for (int i = inicio; i < indiceParticion; i++) {
            System.out.print(arreglo[i] + (i == indiceParticion - 1 ? "" : ", "));
        }
        System.out.print("] ");
        // Imprimir pivote
        System.out.print("[" + arreglo[indiceParticion - 1] + "] ");
        // Imprimir subarreglo derecho
        System.out.print("[");
        for (int i = indiceParticion; i <= fin; i++) {
            System.out.print(arreglo[i] + (i == fin ? "" : ", "));
        }
        System.out.println("]");
    }

    // Método main para probar el algoritmo QuickSort
    public static void main(String[] args) {
        int[] arreglo = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        // Ordenar el arreglo usando QuickSort
        sort(arreglo);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);
    }
}
