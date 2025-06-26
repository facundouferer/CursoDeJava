package CursoJava.ExpresionesLambdaColecciones;

import java.util.ArrayList;
import java.util.List;

class AllMatchNumeros {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        boolean coincide = numeros.stream().allMatch((numero) -> numero > 1);

        if (coincide) {
            System.out.println("Todos los numeros son > 1");
        } else {
            System.out.println("No todos los numeros son > 1");
        }
    }
}
