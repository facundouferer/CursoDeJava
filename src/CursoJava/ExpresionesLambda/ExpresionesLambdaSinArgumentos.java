package CursoJava.ExpresionesLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ExpresionesLambdaSinArgumentos {
    public static void main(String[] args) {

        // Ejemplo 1: Expresión lambda que no toma argumentos y devuelve un valor
        /*
          En el "Ejemplo 1", se define una expresión lambda utilizando la interfaz funcional Supplier.
          La expresión lambda no toma argumentos y simplemente devuelve la cadena "¡Hola, mundo!".
          Luego, se llama al método get() para obtener el valor de la expresión lambda y se imprime
          en la consola.
         */
        Supplier<String> saludo = () -> "¡Hola, mundo!";
        System.out.println(saludo.get());  // Imprime el resultado de la expresión lambda

        // Ejemplo 2: Expresión lambda que no toma argumentos y realiza una acción
        /*
        En el "Ejemplo 2", se define una expresión lambda utilizando la interfaz funcional Runnable.
        La expresión lambda no toma argumentos y realiza una acción que imprime "Este es un mensaje
        de la expresión lambda." en la consola. Se ejecuta la acción llamando al método run().
         */
        Runnable miRunnable = () -> {
            System.out.println("Este es un mensaje de la expresión lambda.");
        };
        miRunnable.run();  // Ejecuta la acción definida por la expresión lambda

        // Creación de una lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // Ejemplo 3: Utilización de una expresión lambda en una operación de filtrado y recolección
        /*
        En el "Ejemplo 3", se crea una lista de números enteros. Luego, se utiliza una
        expresión lambda en una operación de filtrado para seleccionar los números pares.
        Los números pares se recopilan en una nueva lista utilizando la operación collect.
        La lista resultante de números pares se imprime en la consola.
         */
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)  // Filtra los números pares
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);  // Recolecta los números pares en una nueva lista
        System.out.println(pares);  // Imprime la lista de números pares

    }
}
