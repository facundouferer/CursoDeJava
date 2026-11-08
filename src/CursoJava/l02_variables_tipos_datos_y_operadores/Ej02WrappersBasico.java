package CursoJava.l02_variables_tipos_datos_y_operadores;

/**
 * Lección 02 – Variables, tipos de datos y operadores
 * Objetivo: usar las clases envoltorio (wrappers) y sus constantes asociadas a los tipos primitivos.
 * Concepto: 3. Tipos primitivos vs. tipos por referencia.
 */
public class Ej02WrappersBasico {

    public static void main(String[] args) {
        Integer a = Integer.valueOf(10);
        Double b = Double.valueOf(3.5);

        // intValue() obtiene el valor primitivo; para un Double trunca los decimales.
        int suma = a.intValue() + b.intValue();
        System.out.println("Suma: " + suma);

        System.out.println("MAX = " + Integer.MAX_VALUE);
        System.out.println("MIN = " + Integer.MIN_VALUE);
        System.out.println("SIZE = " + Double.SIZE);
        System.out.println("TIPO = " + Integer.TYPE);
        System.out.println("TIPO = " + Double.TYPE);
        System.out.println("NaN = " + Double.NaN);
        System.out.println("POSITIVE_INFINITY (FLOAT) = " + Float.POSITIVE_INFINITY);
    }
}
