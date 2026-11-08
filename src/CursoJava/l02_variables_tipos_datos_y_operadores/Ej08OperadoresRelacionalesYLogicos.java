package CursoJava.l02_variables_tipos_datos_y_operadores;

/**
 * Lección 02 – Variables, tipos de datos y operadores
 * Objetivo: combinar operadores relacionales y lógicos y mostrar el resultado con el operador ternario.
 * Concepto: 5. Operadores relacionales y lógicos.
 */
public class Ej08OperadoresRelacionalesYLogicos {

    public static void main(String[] args) {
        int uno = 1;
        int dos = 2;
        int tres = 3;
        int cuatro = 4;

        boolean condicion = (uno != dos) || (tres == cuatro);
        String mensaje = condicion ? "VERDADERO" : "FALSO";
        System.out.println(mensaje);
    }
}
