package CursoJava.ExpresionesLambdaColecciones;

import java.util.ArrayList;
import java.util.List;

class AnyMatchNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add( 1);
        numeros.add( 2);
        numeros.add( 3);

        boolean coincide = numeros.stream().anyMatch((numero) -> numero < 3);

        if(coincide){
            System.out.println("Hay por lo menos un numero menor que 3");
        }else{
            System.out.println("No hay números menor a 3");
        }
    }
}
