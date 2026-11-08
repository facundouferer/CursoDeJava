package CursoJava.l02_variables_tipos_datos_y_operadores;

/**
 * Lección 02 – Variables, tipos de datos y operadores
 * Objetivo: mostrar la conversión automática entre tipos primitivos y sus wrappers.
 * Concepto: 3. Tipos primitivos vs. tipos por referencia; 4. Conversión de tipos.
 */
public class Ej03AutoboxingUnboxing {

    public static void main(String[] args) {
        // Autoboxing: int -> Integer.
        Integer x = 100;
        Integer y = Integer.valueOf("200");

        // Unboxing: Integer -> int al operar.
        int suma = x + y;
        System.out.println("Suma: " + suma);

        String numeroTexto = "300";

        // parseInt devuelve un int primitivo; valueOf devuelve un objeto Integer.
        suma = Integer.parseInt(numeroTexto) + x;
        System.out.println("Suma con parseInt: " + suma);
        suma = Integer.valueOf(numeroTexto) + x;
        System.out.println("Suma con valueOf: " + suma);
    }
}
