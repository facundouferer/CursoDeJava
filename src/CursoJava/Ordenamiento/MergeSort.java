package CursoJava.Ordenamiento;

public class MergeSort {

    // Método principal para iniciar el proceso de ordenamiento MergeSort
    public static void sort(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            return;
        }
        int[] arregloTemporal = new int[arreglo.length]; // Arreglo temporal para almacenar los elementos durante la
                                                         // mezcla
        mergeSort(arreglo, arregloTemporal, 0, arreglo.length - 1); // Llamada al método auxiliar mergeSort
    }

    // Método auxiliar que implementa el algoritmo MergeSort de manera recursiva
    private static void mergeSort(int[] arreglo, int[] arregloTemporal, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2; // Calcular el punto medio del arreglo
            // Dividir el arreglo en dos partes y ordenar cada parte recursivamente
            mergeSort(arreglo, arregloTemporal, inicio, medio); // Parte izquierda
            mergeSort(arreglo, arregloTemporal, medio + 1, fin); // Parte derecha
            // Mezclar las partes ordenadas para fusionarlas en un solo arreglo ordenado
            merge(arreglo, arregloTemporal, inicio, medio, fin);
        }
    }

    // Método auxiliar para mezclar dos sub-arreglos ordenados en uno solo
    private static void merge(int[] arreglo, int[] arregloTemporal, int inicio, int medio, int fin) {
        // Copiar los elementos a los arreglos temporales
        for (int i = inicio; i <= fin; i++) {
            arregloTemporal[i] = arreglo[i];
        }
        // Índices para recorrer los arreglos temporal y original, y el índice para el
        // arreglo resultante
        int i = inicio, j = medio + 1, k = inicio;
        // Mezclar los dos sub-arreglos ordenados en uno solo
        while (i <= medio && j <= fin) {
            if (arregloTemporal[i] <= arregloTemporal[j]) {
                arreglo[k++] = arregloTemporal[i++];
            } else {
                arreglo[k++] = arregloTemporal[j++];
            }
        }
        // Copiar los elementos restantes de la parte izquierda, si los hay
        while (i <= medio) {
            arreglo[k++] = arregloTemporal[i++];
        }
        // No es necesario copiar los elementos restantes de la parte derecha, ya que ya
        // están en su lugar
        imprimirArreglo(arreglo);
    }

    // Método para imprimir el contenido del arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    // Método main para probar el algoritmo MergeSort
    public static void main(String[] args) {
        int[] arreglo = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        // Ordenar el arreglo usando MergeSort
        sort(arreglo);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);
    }
}

/**
 * El método sort() es el punto de entrada para iniciar el proceso de
 * ordenamiento MergeSort. Se crea un arreglo temporal para almacenar los
 * elementos durante la mezcla y se llama al método auxiliar mergeSort() con los
 * parámetros necesarios.
 * El método mergeSort() implementa el algoritmo MergeSort de manera recursiva.
 * Divide el arreglo en dos partes y ordena cada parte recursivamente. Luego,
 * mezcla las partes ordenadas usando el método auxiliar merge().
 * El método merge() se encarga de mezclar dos sub-arreglos ordenados en uno
 * solo.
 * La clase Main contiene un ejemplo de uso del algoritmo MergeSort para ordenar
 * un arreglo de ejemplo e imprime tanto el arreglo original como el ordenado.
 */