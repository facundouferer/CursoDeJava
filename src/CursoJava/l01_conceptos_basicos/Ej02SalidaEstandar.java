package CursoJava.l01_conceptos_basicos;

/**
 * Lección 01 – Conceptos básicos
 * Objetivo: mostrar texto en la consola estándar con print, println y printf, incluyendo caracteres de escape.
 * Concepto: 3. Anatomía completa de tu primer programa (System.out.println).
 */
public class Ej02SalidaEstandar {

    public static void main(String[] args) {
        String textoUno = "Hola";
        String textoDos = "Mundo";

        // Concatenación con println: imprime y agrega un salto de línea.
        System.out.println("-------------------");
        System.out.println(textoUno + " " + textoDos + ". ");

        // print no agrega salto de línea, por eso se cierra con println.
        System.out.println("-------------------");
        System.out.print(textoUno);
        System.out.print(" ");
        System.out.print(textoDos);
        System.out.println(".");

        // printf permite dar formato; %s inserta una cadena y %n un salto de línea.
        System.out.println("-------------------");
        System.out.printf(" %s %s.%n", textoUno, textoDos);

        // Caracteres de escape: \n salto de línea, \t tabulación, \f avance de página.
        System.out.println("-------------------");
        System.out.print(textoUno + "\n\t" + textoDos + "\n");
        System.out.print(textoUno + "\f" + textoDos + "\f" + textoDos + "\n");
        System.out.println("-------------------");

        // Para mostrar comillas dentro de una cadena se escapan con \".
        String saludo = "Hola \"Mundo!\"";
        System.out.println(saludo);
    }
}
