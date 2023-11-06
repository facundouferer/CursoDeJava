package CursoJava.ExpresionesLambdaColecciones;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class MapNumeros {

    public static void main (String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add( 1);
        numeros.add( 2);
        numeros.add( 3);

        List<Integer> numerosDuplicados = numeros.stream().map(numero -> numero * 2).collect(Collectors.toList());

        System.out.println(numerosDuplicados);

    }

}
