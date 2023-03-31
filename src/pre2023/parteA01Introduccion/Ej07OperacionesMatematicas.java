package pre2023.parteA01Introduccion;

public class Ej07OperacionesMatematicas {
    public static void main(String[] args) {
        int edad01, edad02, edad03;
        edad01 = 12;
        edad02 = 73;
        edad03 = 12;

        /*
         * se declara la variable double
         * por las dudas que el resultado del promedio
         * tenga coma
         */

        double promedio = (edad01 + edad02 + edad03) / 3;

        System.out.print(promedio);
    }
}
