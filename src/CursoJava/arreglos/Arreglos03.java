package CursoJava.arreglos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Arreglos03 {
    /**Ejercicio 3:
     Escriba un programa para realizar una función que, dada una lista, devuelva una nueva lista
     cuyo contenido sea igual a la original pero invertida.
     Así, dada la lista [“Di”, “buen”, “día”, “a”, “papa”],
     deberá devolver [“papa”, “a”, “día”, “buen”, “Di”].
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una lista de ejemplo
        List<String> listaOriginal = Arrays.asList("Di", "buen", "día", "a", "papa");
        System.out.println("Lista original: " + listaOriginal);

        // Invertir la lista original
        List<String> listaInvertida = invertirLista(listaOriginal);
        System.out.println("Lista invertida: " + listaInvertida);
    }

    // Función para invertir una lista
    public static <T> List<T> invertirLista(List<T> listaOriginal) {
        List<T> listaInvertida = new ArrayList<>();
        for (int i = listaOriginal.size() - 1; i >= 0; i--) {
            listaInvertida.add(listaOriginal.get(i));
        }
        return listaInvertida;
    }
}
