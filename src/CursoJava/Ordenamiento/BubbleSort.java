package CursoJava.Ordenamiento;

public class BubbleSort {
    // Método para ordenar un arreglo utilizando el algoritmo de BubbleSort
    public static void sort(int[] arreglo) {
        int n = arreglo.length;
        // Iterar sobre todo el arreglo
        for (int i = 0; i < n - 1; i++) {
            // Indica que una nueva pasada comienza
            System.out.println("Pasada " + (i + 1) + ":");
            // Últimos i elementos ya están en su posición correcta
            // n-i-1 es la cantidad de elementos total, menos donde quedó el recorrido
            // anterior menos el elemento anterior
            for (int j = 0; j < n - i - 1; j++) {
                // Imprimir el arreglo antes del posible intercambio
                imprimirArreglo(arreglo);
                // Comparar elemento actual con el siguiente
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar si el elemento actual es mayor que el siguiente
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    System.out.println("Intercambiando " + arreglo[j + 1] + " con " + arreglo[j]);
                }
            }
            // Imprimir el arreglo después de cada pasada completa
            System.out.println("Estado del arreglo después de la pasada " + (i + 1) + ":");
            imprimirArreglo(arreglo);
            System.out.println();
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
