package CursoJava.ExpresionesLambdaColecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class MapToDoubleNumeros {
    public static void main(String[] args) {
        List<String> numerosString = new ArrayList<>();
        numerosString.add("1");
        numerosString.add("7");
        numerosString.add("3");

        List<Double> numeros = numerosString.stream()
                .mapToDouble(numero -> Double.valueOf(numero))
                .boxed()  // Convertir DoubleStream a Stream<Double>
                .collect(Collectors.toList());

        System.out.println(numeros);
    }
}
