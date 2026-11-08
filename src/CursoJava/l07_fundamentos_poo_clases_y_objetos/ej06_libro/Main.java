package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej06_libro;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Crear dos libros, mostrarlos e indicar cuál tiene más páginas.
 * Concepto: 3. Ejemplo práctico: modelando una clase (instanciación y uso).
 */
public class Main {

    public static void main(String[] args) {
        Libro libro1 = new Libro("978-842-330-375-8", "El Quijote", "Miguel de Cervantes", 864);
        Libro libro2 = new Libro("978-080-214-830-6", "1984", "George Orwell", 336);

        System.out.println(libro1);
        System.out.println(libro2);

        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("El libro " + libro1.getTitulo() + " tiene más páginas.");
        } else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
            System.out.println("El libro " + libro2.getTitulo() + " tiene más páginas.");
        } else {
            System.out.println("Ambos libros tienen el mismo número de páginas.");
        }
    }
}
