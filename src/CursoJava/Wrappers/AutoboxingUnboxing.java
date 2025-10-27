package CursoJava.Wrappers;

public class AutoboxingUnboxing {
  public static void main(String[] args) {

    // Autoboxing int -> Integer
    Integer x = 100;
    Integer y = Integer.valueOf("200");

    // Unboxing Integer -> int
    int suma = x + y;
    System.out.println("Suma: " + suma);

    String numeroTexto = "300";

    suma = Integer.parseInt(numeroTexto) + x;
    System.out.println("Suma con ParseInt: " + suma);
    suma = Integer.valueOf(numeroTexto) + x;
    System.out.println("Suma con ValueOf: " + suma);

    Integer.parseInt(numeroTexto); // esto es un simple int
    Integer.valueOf(numeroTexto); // esto es un Integer

  }
}
