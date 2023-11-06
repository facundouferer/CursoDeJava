package CursoJava.ExpresionesLambdaColecciones;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class MapToIntNumeros {

    public static void main(String[] args) {
        List<String> numerosString = new ArrayList<>();
        numerosString.add("1");
        numerosString.add("2");
        numerosString.add("3");
        List<Integer> numeros = numerosString.stream().mapToInt(numero ->
                Integer.valueOf(numero)).boxed().collect(Collectors.toList());
        System.out.println(numeros);
    }
}
