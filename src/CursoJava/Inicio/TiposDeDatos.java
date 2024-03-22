package CursoJava.Inicio;

public class TiposDeDatos {
  public static void main(String[] args) {

    // Tipos de datos primitivos
    byte b = 127; // 8 bits
    short s = 32767; // 16 bits
    int i = 2147483647; // 32 bits
    long l = 9223372036854775807L; // 64 bits
    float f = 3.4028235E38f; // 32 bits
    double d = 1.7976931348623157E308 * 2; // 64 bits desbordamiento
    char c = '8'; // 16 bits
    boolean bool = true; // 1 bit

    // Tipos de datos no primitivos
    String cadena = "Hola mundo";
    Integer entero = 10;
    Double decimal = 10.5;
    Character caracter = 'A';
    Boolean booleano = true;

    // Imprimir en consola
    System.out.println("byte: " + b);
    System.out.println("short: " + s);
    System.out.println("int: " + i);
    System.out.println("long: " + l);
    System.out.println("float: " + f);
    System.out.println("double: " + d);
    System.out.println("char: " + c);
    System.out.println("boolean: " + bool);
    System.out.println("String: " + cadena);
    System.out.println("Integer: " + entero);
    System.out.println("Double: " + decimal);
    System.out.println("Character: " + caracter);
    System.out.println("Boolean: " + booleano);

    float uno = 4;
    int dos = 253;
    float resultado = uno / dos;
    System.out.println("\nResultado: " + resultado + "\n");
  }
}
