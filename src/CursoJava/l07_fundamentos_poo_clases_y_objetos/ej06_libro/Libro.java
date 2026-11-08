package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej06_libro;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Modelar un libro con ISBN, título, autor y cantidad de páginas.
 * Concepto: 3. Ejemplo práctico: modelando una clase (atributos, métodos y toString).
 */
public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "El libro con ISBN " + isbn + " creado por " + autor + " tiene " + numPaginas + " páginas.";
    }
}
