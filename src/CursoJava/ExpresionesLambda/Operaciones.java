package CursoJava.ExpresionesLambda;

class Operaciones {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> suma = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> resta = (a, b) -> a - b;
        BiFunction<Integer, Integer, Integer> multiplicacion = (a, b) -> a * b;
        BiFunction<Integer, Integer, Double> division = (a, b) -> (b != 0) ? (double) a / b : Double.NaN;

        int num1 = 10;
        int num2 = 5;

        System.out.println("Operaciones aritméticas:");
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma.apply(num1, num2));
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta.apply(num1, num2));
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multiplicacion.apply(num1, num2));
        System.out.println("División: " + num1 + " / " + num2 + " = " + division.apply(num1, num2));

    }
}

// Definimos una interfaz funcional personalizada llamada BiFunction
@FunctionalInterface
interface BiFunction<T, U, R> {
    R apply(T t, U u);
}

