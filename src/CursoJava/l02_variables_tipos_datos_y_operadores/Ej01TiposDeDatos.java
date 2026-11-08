package CursoJava.l02_variables_tipos_datos_y_operadores;

/**
 * Lección 02 – Variables, tipos de datos y operadores
 * Objetivo: declarar variables de tipos primitivos y por referencia y mostrar sus valores.
 * Concepto: 3. Tipos primitivos vs. tipos por referencia.
 */
public class Ej01TiposDeDatos {

    public static void main(String[] args) {
        // Tipos primitivos: almacenan valores directos.
        byte b = 127;                        // 8 bits
        short s = 32767;                     // 16 bits
        int i = 2147483647;                  // 32 bits
        long l = 9223372036854775807L;       // 64 bits
        float f = 3.4028235E38f;             // 32 bits
        double d = 1.7976931348623157E308 * 2; // 64 bits: supera el máximo y da Infinity
        char c = '8';                        // 16 bits, un carácter Unicode
        boolean bool = true;                 // verdadero o falso

        // Tipos por referencia: almacenan la dirección de un objeto.
        String cadena = "Hola mundo";
        Integer entero = 10;
        Double decimal = 10.5;
        Character caracter = 'A';
        Boolean booleano = true;

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

        // Al operar un float con un int, el int se convierte implícitamente (widening).
        float uno = 4;
        int dos = 253;
        float resultado = uno / dos;
        System.out.println("\nResultado: " + resultado + "\n");
    }
}
