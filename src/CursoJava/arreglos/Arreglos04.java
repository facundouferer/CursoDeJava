package CursoJava.arreglos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arreglos04 {
    /**Ejercicio 4:
     Escriba un programa para realizar otra función que invierta una lista, similar al ejercicio anterior,
     pero en lugar de devolver una nueva, modifique la lista dada para invertirla, sin usar listas
     auxiliares.*/
    public static void main(String[] args) {
        // Crear una lista de ejemplo
        List<String> listaOriginal = new ArrayList<>(Arrays.asList("Di", "buen", "día", "a", "papa"));
        System.out.println("Lista original: " + listaOriginal);

        // Invertir la lista original directamente, sin crear una lista auxiliar
        invertirListaInSitu(listaOriginal);
        System.out.println("Lista invertida: " + listaOriginal);
    }

    // Función para invertir una lista en su lugar, sin usar listas auxiliares
    public static <T> void invertirListaInSitu(List<T> listaOriginal) {
        int n = listaOriginal.size();
        for (int i = 0; i < n / 2; i++) {
            // Intercambiar el elemento en la posición i con el elemento en la posición n - i - 1
            T temp = listaOriginal.get(i);
            listaOriginal.set(i, listaOriginal.get(n - i - 1));
            listaOriginal.set(n - i - 1, temp);
        }
    }

}
