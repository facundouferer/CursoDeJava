package parteA01Introduccion;

public class Ej04DeclaracionDeVariables {
    public static void main(String[] args) {
        /*
         * El modificador final es lo que define
         * que es una constante
         */
        final double pi = 3.1415926535;

        /*
         * Si se intenta modificar el valor
         * de la variable mi IDE me dará un error
         */

        System.out.println(pi);
        System.out.println(Math.PI); //sacar de la API de Java
    }
}
