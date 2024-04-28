package CursoJava.Ordenamiento;

public class BubbleSort {
    public static void sort(int[] arreglo) {
        int n = arreglo.length;
        // Iterar sobre todo el arreglo
        for (int i = 0; i < n - 1; i++) {
            // Últimos i elementos ya están en su posición correcta, por lo que no necesitan
            // ser verificados
            for (int j = 0; j < n - i - 1; j++) {
                // Comparar elemento actual con el siguiente
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar si el elemento actual es mayor que el siguiente
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    System.out.println("Intercambiando " + arreglo[j] + " con " + arreglo[j + 1]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arreglo = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        // Ordenar el arreglo usando BubbleSort
        sort(arreglo);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(arreglo);
    }

    // Método para imprimir el contenido del arreglo
    public static void imprimirArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
