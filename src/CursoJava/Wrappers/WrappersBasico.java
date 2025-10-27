package CursoJava.Wrappers;

public class WrappersBasico {

  public static void main(String[] args) {
    Integer a = Integer.valueOf(10);

    Double b = Double.valueOf(3.5);

    int suma = a.intValue() + b.intValue();

    System.out.println("Suma: " + suma);

    System.out.println("MAX = " + Integer.MAX_VALUE);

    System.out.println("MIN = " + Integer.MIN_VALUE);

    System.out.println("SIZE = " + Double.SIZE);

    System.out.println("TIPO = " + Integer.TYPE);

    System.out.println("TIPO = " + Double.TYPE);

    System.out.println("TIPO = " + Double.NaN);

    System.out.println("POSITIVE_INFINITY (FLOAT) = " + Float.POSITIVE_INFINITY);

  }

}
