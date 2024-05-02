package CursoJava.Ordenamiento;

public class MergeSort {

    // Método principal para iniciar el proceso de ordenamiento MergeSort
    public static void sort(int[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            return;
        }
        int[] arregloTemporal = new int[arreglo.length]; // Arreglo temporal para almacenar los elementos durante la
                                                         // mezcla
        System.out.println("Iniciando ordenamiento MergeSort:");
        mergeSort(arreglo, arregloTemporal, 0, arreglo.length - 1); // Llamada al método auxiliar mergeSort
    }

    // Método auxiliar que implementa el algoritmo MergeSort de manera recursiva
    private static void mergeSort(int[] arreglo, int[] arregloTemporal, int inicio, int fin) {
        if (inicio < fin) {
            int medio = (inicio + fin) / 2; // Calcular el punto medio del arreglo
            // Dividir el arreglo en dos partes y ordenar cada parte recursivamente
            mergeSort(arreglo, arregloTemporal, inicio, medio); // Parte izquierda
            mergeSort(arreglo, arregloTemporal, medio + 1, fin); // Parte derecha
            // Mezclar las partes ordenadas
            merge(arreglo, arregloTemporal, inicio, medio, fin);
            System.out.println("Después de mezclar desde " + inicio + " a " + fin + ":");
            imprimirArreglo(arreglo);
        }
    }

    // Método auxiliar para mezclar dos sub-arreglos ordenados en uno solo
    private static void merge(int[] arreglo, int[] arregloTemporal, int inicio, int medio, int fin) {
        // Copiar los elementos al arreglo temporal
        for (int i = inicio; i <= fin; i++) {
            arregloTemporal[i] = arreglo[i];
        }

        int i = inicio, j = medio + 1, k = inicio;
        // Mezclar los dos sub-arreglos de vuelta al arreglo original
        while (i <= medio && j <= fin) {
            if (arregloTemporal[i] <= arregloTemporal[j]) {
                arreglo[k] = arregloTemporal[i];
                i++;
            } else {
                arreglo[k] = arregloTemporal[j];
                j++;
            }
            k++;
        }

        // Copiar los elementos restantes de la parte izquierda, si los hay
        while (i <= medio) {
            arreglo[k] = arregloTemporal[i];
            i++;
            k++;
        }

        // Los elementos del lado derecho ya están en el lugar correcto
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
