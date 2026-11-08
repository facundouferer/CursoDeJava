package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej09_papelybirome;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Escribir en un papel con una birome hasta agotar su tinta.
 * Concepto: 5. Referencias vs. copia de objetos (un objeto recibido por otro objeto).
 */
public class Main {

    public static void main(String[] args) {
        Papel papel = new Papel();
        Birome birome = new Birome(10);

        birome.escribir("Hola, ¿cómo estás?", papel);
        birome.escribir(" Espero que bien.", papel);
        birome.escribir(" Saludos.", papel);

        System.out.println(papel);

        Birome biromeSinTinta = new Birome(0);
        biromeSinTinta.escribir("Este texto no debería aparecer en el papel.", papel);
    }
}
