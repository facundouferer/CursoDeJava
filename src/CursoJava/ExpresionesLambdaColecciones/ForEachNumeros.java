package CursoJava.ExpresionesLambdaColecciones;
import java.util.List;
import java.util.ArrayList; // Agregar esta importación


class ForEachNumeros {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add( 1);
        numeros.add( 2);
        numeros.add( 3);
        numeros.add( 4);

        numeros.stream().forEach((numero) -> System.out.println(numero));

        System.out.println("listado de numeros con expresion lambda");

        numeros.stream().forEach((numero)->{
            numero += 1;
            System.out.println(numero+" + "+numero+" = "+(numero+numero));
        });

    }
}
