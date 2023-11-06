package CursoJava.ExpresionesLambdaColecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> numerosPares = numeros.stream().filter(numero -> numero % 2 == 0).collect(Collectors.toList());
        System.out.println(numerosPares);
    }
}
