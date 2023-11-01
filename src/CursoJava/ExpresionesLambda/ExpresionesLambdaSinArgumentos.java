package CursoJava.ExpresionesLambda;
import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ExpresionesLambdaSinArgumentos {
    public static void main(String[] args) {

        // Ejemplo 1: Expresión lambda que no toma argumentos y devuelve un valor
        Supplier<String> saludo = () -> "¡Hola, mundo!";
        System.out.println(saludo.get());

        // Ejemplo 2: Expresión lambda que no toma argumentos y realiza una acción
        Runnable miRunnable = () -> {
            System.out.println("Este es un mensaje de la expresión lambda.");
        };

        miRunnable.run();

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(pares);

    }
}
